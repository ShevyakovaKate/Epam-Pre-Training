package by.epam.preTraining.shevyakova.task6.containers;

import by.epam.preTraining.shevyakova.task6.exceptions.FullStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;
import by.epam.preTraining.shevyakova.task6.exceptions.IllegalIndexException;

public interface Container<T> {
    T peek() throws EmptyContainerException, FullStackException, IllegalIndexException;
    int size();
    boolean isEmpty();
    boolean isFull();
}

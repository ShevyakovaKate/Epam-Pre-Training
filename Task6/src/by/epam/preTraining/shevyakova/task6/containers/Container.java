package by.epam.preTraining.shevyakova.task6.containers;

import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;

public interface Container<T> {
    T peek() throws EmptyContainerException;
    int size();
    boolean isEmpty();


}

package by.epam.preTraining.shevyakova.task6.containers.stack;

import by.epam.preTraining.shevyakova.task6.exceptions.EmptyElementException;
import by.epam.preTraining.shevyakova.task6.exceptions.FullStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;
import by.epam.preTraining.shevyakova.task6.exceptions.IllegalIndexException;

public interface Stack<T> {
    void push(T element) throws FullStackException, IllegalIndexException, EmptyElementException;
    T pop() throws EmptyContainerException, IllegalIndexException;
}

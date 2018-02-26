package by.epam.preTraining.shevyakova.task6.containers.stack;

import by.epam.preTraining.shevyakova.task6.exceptions.FullStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;

public interface Stack<T> {
    void push(T element) throws FullStackException;
    T pop() throws EmptyContainerException;
}

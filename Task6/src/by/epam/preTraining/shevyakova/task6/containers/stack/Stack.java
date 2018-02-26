package by.epam.preTraining.shevyakova.task6.containers.stack;

import by.epam.preTraining.shevyakova.task6.exceptions.CrowdedStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;

public interface Stack<T> {
    void push(T element) throws CrowdedStackException;
    T pop() throws EmptyContainerException;
}

package by.epam.preTraining.shevyakova.task6.containers;

import by.epam.preTraining.shevyakova.task6.exceptions.CrowdedStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;

public abstract class Container<T> {
    public abstract T peek() throws EmptyContainerException, CrowdedStackException;
    public abstract int size();
    public abstract boolean isEmpty();
    public abstract boolean isFull();
}

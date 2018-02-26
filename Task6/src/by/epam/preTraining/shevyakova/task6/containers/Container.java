package by.epam.preTraining.shevyakova.task6.containers;

import by.epam.preTraining.shevyakova.task6.exceptions.FullStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;

public abstract class Container<T> {
    public abstract T peek() throws EmptyContainerException, FullStackException;
    public abstract int size();
    public abstract boolean isEmpty();
    public abstract boolean isFull();
}

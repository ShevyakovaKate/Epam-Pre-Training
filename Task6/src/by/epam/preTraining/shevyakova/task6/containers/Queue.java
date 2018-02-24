package by.epam.preTraining.shevyakova.task6.containers;

import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;

public interface Queue<T> {
    void enqueue(T element);
    T dequeue() throws EmptyContainerException;
}

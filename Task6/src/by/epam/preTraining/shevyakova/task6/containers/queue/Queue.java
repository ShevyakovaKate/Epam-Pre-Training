package by.epam.preTraining.shevyakova.task6.containers.queue;

import by.epam.preTraining.shevyakova.task6.exceptions.FullStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;

public interface Queue<T> {
    void enqueue(T element) throws FullStackException;
    T dequeue() throws EmptyContainerException;
}

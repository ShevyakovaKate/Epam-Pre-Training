package by.epam.preTraining.shevyakova.task6.containers.queue;

import by.epam.preTraining.shevyakova.task6.exceptions.CrowdedStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;

public interface Queue<T> {
    void enqueue(T element) throws CrowdedStackException;
    T dequeue() throws EmptyContainerException;
}

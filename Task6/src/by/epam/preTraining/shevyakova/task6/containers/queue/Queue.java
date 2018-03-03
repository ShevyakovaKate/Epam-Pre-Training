package by.epam.preTraining.shevyakova.task6.containers.queue;

import by.epam.preTraining.shevyakova.task6.exceptions.EmptyElementException;
import by.epam.preTraining.shevyakova.task6.exceptions.FullStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;
import by.epam.preTraining.shevyakova.task6.exceptions.IllegalIndexException;

public interface Queue<T> {
    void enqueue(T element) throws FullStackException, IllegalIndexException, EmptyElementException;
    T dequeue() throws EmptyContainerException, IllegalIndexException;
}

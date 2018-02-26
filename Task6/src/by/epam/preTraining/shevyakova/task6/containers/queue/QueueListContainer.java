package by.epam.preTraining.shevyakova.task6.containers.queue;

import by.epam.preTraining.shevyakova.task6.containers.ListContainer;
import by.epam.preTraining.shevyakova.task6.exceptions.FullStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;

public abstract class QueueListContainer<T> extends ListContainer implements Queue {

    @Override
    public abstract void enqueue(Object element) throws FullStackException;

    @Override
    public Object peek() throws EmptyContainerException, FullStackException {
        if(isEmpty()) {
            throw new EmptyContainerException("Queue is empty.");
        }
        return array.get(0);
    }

    @Override
    public Object dequeue() throws EmptyContainerException {
        if(isEmpty()) {
            throw new EmptyContainerException("Queue is empty.");
        }
        T element = (T) array.get(0);
        array.remove(0);
        return element;
    }
}

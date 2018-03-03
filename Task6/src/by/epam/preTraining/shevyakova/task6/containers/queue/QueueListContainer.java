package by.epam.preTraining.shevyakova.task6.containers.queue;

import by.epam.preTraining.shevyakova.task6.containers.ListContainer;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyElementException;
import by.epam.preTraining.shevyakova.task6.exceptions.FullStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;
import by.epam.preTraining.shevyakova.task6.exceptions.IllegalIndexException;

public abstract class QueueListContainer<T> extends ListContainer implements Queue {

    @Override
    public abstract void enqueue(Object element) throws FullStackException, IllegalIndexException, EmptyElementException;

    @Override
    public Object peek() throws EmptyContainerException, IllegalIndexException, FullStackException {
        if(isEmpty()) {
            throw new EmptyContainerException("Queue is empty.");
        }
        return array.get(0);
    }

    @Override
    public Object dequeue() throws EmptyContainerException, IllegalIndexException {
        if(isEmpty()) {
            throw new EmptyContainerException("Queue is empty.");
        }
        T element = (T) array.get(0);
        array.remove(0);
        return element;
    }
}

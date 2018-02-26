package by.epam.preTraining.shevyakova.task6.containers.queue;

import by.epam.preTraining.shevyakova.task6.containers.ArrayContainer;
import by.epam.preTraining.shevyakova.task6.exceptions.CrowdedStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;

public abstract class QueueArrayContainer<T> extends ArrayContainer implements Queue {

    @Override
    public abstract void enqueue(Object element) throws CrowdedStackException;

    @Override
    public Object peek() throws EmptyContainerException {
        if(isEmpty()) {
            throw new EmptyContainerException("Queue is empty.");
        }
        return array[0];
    }

    @Override
    public Object dequeue() throws EmptyContainerException {
        if(isEmpty()) {
            throw new EmptyContainerException("Queue is empty");
        }
        T element = (T) array[0];
        array[0] = null;
        for(int i = 0; i < elementCount; i++){
            array[i] = array[i + 1];
        }
        return element;
    }
}

package by.epam.preTraining.shevyakova.task6.containers.stack;

import by.epam.preTraining.shevyakova.task6.containers.ArrayContainer;
import by.epam.preTraining.shevyakova.task6.exceptions.FullStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;

public abstract class StackArrayContainer<T> extends ArrayContainer implements Stack {

    @Override
    public abstract void push(Object element) throws FullStackException;

    @Override
    public Object peek() throws EmptyContainerException {
        if (isEmpty()) {
            throw new EmptyContainerException("Array is empty");
        }
        return array[elementCount - 1];
    }

    @Override
    public T pop() throws EmptyContainerException {
        if(isEmpty()) {
            throw new EmptyContainerException("Stack is empty.");
        } else {
            T element = (T) array[elementCount - 1];
            array[elementCount - 1] = null;
            elementCount--;
            return element;
        }
    }
}

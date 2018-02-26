package by.epam.preTraining.shevyakova.task6.containers.stack;

import by.epam.preTraining.shevyakova.task6.containers.ListContainer;
import by.epam.preTraining.shevyakova.task6.exceptions.CrowdedStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;

public abstract class StackListContainer<T> extends ListContainer implements Stack {

    @Override
    public abstract void push(Object element) throws CrowdedStackException;

    @Override
    public Object peek() throws EmptyContainerException {
        if(isEmpty()) {
            throw new EmptyContainerException("Stack is empty.");
        }
        return array.get(elementCount - 1);
    }

    @Override
    public Object pop() throws EmptyContainerException {
        if (isEmpty()) {
            throw new EmptyContainerException("Stack is empty.");
        }
        T element = (T) array.get(elementCount - 1);
        array.remove(--elementCount);
        return element;
    }
}

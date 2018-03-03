package by.epam.preTraining.shevyakova.task6.containers.stack;

import by.epam.preTraining.shevyakova.task6.containers.ListContainer;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyElementException;
import by.epam.preTraining.shevyakova.task6.exceptions.FullStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;
import by.epam.preTraining.shevyakova.task6.exceptions.IllegalIndexException;

public abstract class StackListContainer<T> extends ListContainer implements Stack {

    @Override
    public abstract void push(Object element) throws FullStackException, IllegalIndexException, EmptyElementException;
    @Override
    public Object peek() throws EmptyContainerException, IllegalIndexException {
        if(isEmpty()) {
            throw new EmptyContainerException("Stack is empty.");
        }
        return array.get(elementCount - 1);
    }

    @Override
    public Object pop() throws EmptyContainerException, IllegalIndexException {
        if (isEmpty()) {
            throw new EmptyContainerException("Stack is empty.");
        }
        T element = (T) array.get(elementCount - 1);
        array.remove(--elementCount);
        return element;
    }
}

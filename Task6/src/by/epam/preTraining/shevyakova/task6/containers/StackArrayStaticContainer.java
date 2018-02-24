package by.epam.preTraining.shevyakova.task6.containers;

import by.epam.preTraining.shevyakova.task6.exceptions.CrowdedStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;

public class StackArrayStaticContainer<T> extends ArrayContainer implements Stack {

    public StackArrayStaticContainer(int length) {
        this.array = (T[]) new Object[length];
        this.length = length;
        this.top = 0;
    }

    @Override
    public Object peek() throws EmptyContainerException, CrowdedStackException {
        if(top == length) {
            throw new CrowdedStackException("Array is crowded.");
        }
        if (top == 0) {
            throw new EmptyContainerException("Array is empty");
        }
        return array[top - 1];
    }

    @Override
    public void push(Object element) throws CrowdedStackException {
        if(top > length) {
            throw new CrowdedStackException("The stack is full.");
        }
        array[top] = element;
        top++;
    }

    @Override
    public T pop() throws EmptyContainerException {
        if(top == 0) {
            throw new EmptyContainerException("Stack is empty.");
        } else {
            T element = (T) array[top - 1];
            array[top - 1] = null;
            top--;
            return element;
        }

    }

}

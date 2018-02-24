package by.epam.preTraining.shevyakova.task6.containers;

import by.epam.preTraining.shevyakova.task6.exceptions.CrowdedStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;

public class StackArrayStaticContainer<T> extends StackArrayContainer {

    public StackArrayStaticContainer(int length) {
        this.array = (T[]) new Object[length];
        this.length = length;
        this.top = 0;
    }

    public void push(T element) throws CrowdedStackException {
        if(top == length) {
            throw new CrowdedStackException("The stack is full.");
        }
        top++;
        array[top] = element;
    }

    public T pop() throws EmptyContainerException {
        if(top == 0) {
            throw new EmptyContainerException("Stack is empty.");
        } else {
            T element = (T) array[top];
            top--;
            return element;
        }

    }

}

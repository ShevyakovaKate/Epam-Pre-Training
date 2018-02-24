package by.epam.preTraining.shevyakova.task6.containers;

import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;

public abstract class StackArrayContainer<T> implements Container {
    T[] array;
    int length;
    int top;

    public T peek()throws EmptyContainerException {
        if (top == 0) {
            throw new EmptyContainerException();
        }
        return array[0];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top > 0;
    }

}

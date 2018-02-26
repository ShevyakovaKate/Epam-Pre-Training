package by.epam.preTraining.shevyakova.task6.containers.stack;

import by.epam.preTraining.shevyakova.task6.exceptions.FullStackException;

public class StackArrayStaticContainer<T> extends StackArrayContainer {
    private static final int DEFAULT_ARRAY_LENGTH = 10;

    public StackArrayStaticContainer() {
        this.array = (T[]) new Object[DEFAULT_ARRAY_LENGTH];
        this.length = DEFAULT_ARRAY_LENGTH;
        this.elementCount = 0;
    }

    public StackArrayStaticContainer(int length) {
        this.array = (T[]) new Object[length];
        this.length = length;
        this.elementCount = 0;
    }

    public StackArrayStaticContainer(StackArrayStaticContainer stackArrayStaticContainer) {
        this.array = stackArrayStaticContainer.array;
        this.length = stackArrayStaticContainer.length;
        this.elementCount = stackArrayStaticContainer.elementCount;
    }

    @Override
    public void push(Object element) throws FullStackException {
        if(isFull()) {
            throw new FullStackException("The stack is full.");
        }
        array[elementCount] = element;
        elementCount++;
    }
}

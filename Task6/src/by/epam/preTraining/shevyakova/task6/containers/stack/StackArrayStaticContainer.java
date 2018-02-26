package by.epam.preTraining.shevyakova.task6.containers.stack;

import by.epam.preTraining.shevyakova.task6.exceptions.CrowdedStackException;

public class StackArrayStaticContainer<T> extends StackArrayContainer {
    private static final int DEFAULT_ARRAY_LENGHT = 10;

    public StackArrayStaticContainer() {
        this.array = (T[]) new Object[DEFAULT_ARRAY_LENGHT];
        this.length = DEFAULT_ARRAY_LENGHT;
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
    public void push(Object element) throws CrowdedStackException {
        if(isFull()) {
            throw new CrowdedStackException("The stack is full.");
        }
        array[elementCount] = element;
        elementCount++;
    }

}

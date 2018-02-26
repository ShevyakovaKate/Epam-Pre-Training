package by.epam.preTraining.shevyakova.task6.containers.stack;

import by.epam.preTraining.shevyakova.task6.exceptions.CrowdedStackException;

import java.util.ArrayList;

public class StackListStaticContainer<T> extends StackListContainer {
    private static final int DEFAULT_ARRAY_LENGHT = 10;

    public StackListStaticContainer() {
        this.array = new ArrayList(DEFAULT_ARRAY_LENGHT);
        this.length = DEFAULT_ARRAY_LENGHT;
        this.elementCount = 0;
    }

    public StackListStaticContainer(int length) {
        this.array = new ArrayList(length);
        this.length = length;
        this.elementCount = 0;
    }

    public StackListStaticContainer(StackListStaticContainer stackListStaticContainer) {
        this.array = stackListStaticContainer.array;
        this.length = stackListStaticContainer.length;
        this.elementCount = stackListStaticContainer.elementCount;
    }

    @Override
    public void push(Object element) throws CrowdedStackException {
        if (isFull()) {
            throw new CrowdedStackException("Stack is crowded.");
        }
        array.add(elementCount, element);
        elementCount++;
    }
}

package by.epam.preTraining.shevyakova.task6.containers.stack;

import by.epam.preTraining.shevyakova.task6.exceptions.EmptyElementException;
import by.epam.preTraining.shevyakova.task6.exceptions.FullStackException;
import by.epam.preTraining.shevyakova.task6.containers.list.List;
import by.epam.preTraining.shevyakova.task6.exceptions.IllegalIndexException;

public class StackListStaticContainer<T> extends StackListContainer {
    private static final int DEFAULT_ARRAY_LENGTH = 10;

    public StackListStaticContainer() {
        this.array = new List(DEFAULT_ARRAY_LENGTH);
        this.length = DEFAULT_ARRAY_LENGTH;
        this.elementCount = 0;
    }

    public StackListStaticContainer(int length) {
        this.array = new List(length);
        this.length = length;
        this.elementCount = 0;
    }

    public StackListStaticContainer(StackListStaticContainer stackListStaticContainer) {
        this.array = stackListStaticContainer.array;
        this.length = stackListStaticContainer.length;
        this.elementCount = stackListStaticContainer.elementCount;
    }

    @Override
    public void push(Object element) throws FullStackException, IllegalIndexException, EmptyElementException {
        if (isFull()) {
            throw new FullStackException("Stack is crowded.");
        }
        array.add(element, elementCount);
        elementCount++;
    }
}

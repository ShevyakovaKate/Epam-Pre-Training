package by.epam.preTraining.shevyakova.task6.containers.queue;

import by.epam.preTraining.shevyakova.task6.exceptions.CrowdedStackException;

public class QueueArrayStaticContainer<T> extends QueueArrayContainer {
    private static final int DEFAULT_ARRAY_LENGTH = 10;

    public QueueArrayStaticContainer() {
        this.array = (T[]) new Object[DEFAULT_ARRAY_LENGTH];
        this.length = DEFAULT_ARRAY_LENGTH;
        this.elementCount = 0;
    }

    public QueueArrayStaticContainer(int length) {
        this.array = (T[]) new Object[length];
        this.length = length;
        this.elementCount = 0;
    }

    public QueueArrayStaticContainer(QueueArrayStaticContainer queueArrayStaticContainer) {
        this.array = queueArrayStaticContainer.array;
        this.length = queueArrayStaticContainer.length;
        this.elementCount = queueArrayStaticContainer.elementCount;
    }

    @Override
    public void enqueue(Object element) throws CrowdedStackException {
        if(isFull()) {
            throw new CrowdedStackException("The queue is full.");
        }
        array[elementCount] = element;
        elementCount++;
    }
}

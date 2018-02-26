package by.epam.preTraining.shevyakova.task6.containers.queue;

import by.epam.preTraining.shevyakova.task6.exceptions.FullStackException;

import java.util.ArrayList;

public class QueueListStaticContainer extends QueueListContainer {
    private static final int DEFAULT_ARRAY_LENGHT = 10;

    public QueueListStaticContainer() {
        this.array = new ArrayList(DEFAULT_ARRAY_LENGHT);
        this.length = DEFAULT_ARRAY_LENGHT;
        this.elementCount = 0;
    }

    public QueueListStaticContainer(int length) {
        this.array = new ArrayList(length);
        this.length = length;
        this.elementCount = 0;
    }

    public QueueListStaticContainer(QueueListStaticContainer queueListStaticContainer) {
        this.array = queueListStaticContainer.array;
        this.length = queueListStaticContainer.length;
        this.elementCount = queueListStaticContainer.elementCount;
    }

    @Override
    public void enqueue(Object element) throws FullStackException {
        if (isFull()) {
            throw new FullStackException("Queue is full.");
        }
        array.add(elementCount, element);
        elementCount++;
    }
}

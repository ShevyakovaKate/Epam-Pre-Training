package by.epam.preTraining.shevyakova.task6.containers.queue;

import by.epam.preTraining.shevyakova.task6.exceptions.EmptyElementException;
import by.epam.preTraining.shevyakova.task6.exceptions.FullStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.IllegalIndexException;

import by.epam.preTraining.shevyakova.task6.containers.list.List;

public class QueueListStaticContainer extends QueueListContainer {
    private static final int DEFAULT_ARRAY_LENGTH = 10;

    public QueueListStaticContainer() {
        this.array = new List(DEFAULT_ARRAY_LENGTH);
        this.length = DEFAULT_ARRAY_LENGTH;
        this.elementCount = 0;
    }

    public QueueListStaticContainer(int length) {
        this.array = new List(length);
        this.length = length;
        this.elementCount = 0;
    }

    public QueueListStaticContainer(QueueListStaticContainer queueListStaticContainer) {
        this.array = queueListStaticContainer.array;
        this.length = queueListStaticContainer.length;
        this.elementCount = queueListStaticContainer.elementCount;
    }

    @Override
    public void enqueue(Object element) throws FullStackException, IllegalIndexException, EmptyElementException {
        if (isFull()) {
            throw new FullStackException("Queue is full.");
        }
        array.add(element, elementCount);
        elementCount++;
    }
}

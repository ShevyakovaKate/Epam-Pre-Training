package by.epam.preTraining.shevyakova.task6.containers.queue;

import by.epam.preTraining.shevyakova.task6.exceptions.FullStackException;

import java.util.ArrayList;
import java.util.List;

public class QueueListDynamicContainer extends QueueListContainer {

    public QueueListDynamicContainer() {
        this.array = new ArrayList();
        this.elementCount = 0;
    }

    public QueueListDynamicContainer(List array) {
        this.array = array;
        elementCount = array.size();
    }

    public QueueListDynamicContainer(QueueListDynamicContainer queueListDynamicContainer) {
        this.array = queueListDynamicContainer.array;
        this.elementCount = queueListDynamicContainer.elementCount;
    }

    @Override
    public void enqueue(Object element) throws FullStackException {
        array.add(elementCount, element);
        elementCount++;
    }
}

package by.epam.preTraining.shevyakova.task6.containers.queue;

import by.epam.preTraining.shevyakova.task6.exceptions.EmptyElementException;
import by.epam.preTraining.shevyakova.task6.exceptions.FullStackException;
import by.epam.preTraining.shevyakova.task6.containers.list.List;
import by.epam.preTraining.shevyakova.task6.exceptions.IllegalIndexException;

public class QueueListDynamicContainer extends QueueListContainer {

    public QueueListDynamicContainer() {
        this.array = new List();
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
    public void enqueue(Object element) throws FullStackException, IllegalIndexException, EmptyElementException {
        array.add(element, elementCount);
        elementCount++;
    }
}

package by.epam.preTraining.shevyakova.task6.containers.stack;

import by.epam.preTraining.shevyakova.task6.exceptions.EmptyElementException;
import by.epam.preTraining.shevyakova.task6.exceptions.FullStackException;

import by.epam.preTraining.shevyakova.task6.containers.list.List;
import by.epam.preTraining.shevyakova.task6.exceptions.IllegalIndexException;

public class StackListDynamicContainer<T> extends StackListContainer {

    public StackListDynamicContainer() {
        this.array = new List();
        this.elementCount = 0;
    }

    public StackListDynamicContainer(List array) {
        this.array = array;
        elementCount = array.size();
    }

    public StackListDynamicContainer(StackListDynamicContainer stackListDynamicContainer) {
        this.array = stackListDynamicContainer.array;
        this.elementCount = stackListDynamicContainer.elementCount;
    }

    @Override
    public void push(Object element) throws EmptyElementException, IllegalIndexException {
        array.add(element, elementCount);
        elementCount++;
    }

}

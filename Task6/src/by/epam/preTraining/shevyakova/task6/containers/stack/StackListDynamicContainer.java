package by.epam.preTraining.shevyakova.task6.containers.stack;

import by.epam.preTraining.shevyakova.task6.exceptions.FullStackException;

import java.util.ArrayList;
import java.util.List;

public class StackListDynamicContainer<T> extends StackListContainer {

    public StackListDynamicContainer() {
        this.array = new ArrayList();
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
    public void push(Object element) throws FullStackException {
        array.add(elementCount, element);
        elementCount++;
    }

}

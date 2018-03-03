package by.epam.preTraining.shevyakova.task6.containers;

import by.epam.preTraining.shevyakova.task6.containers.list.List;

public abstract class ListContainer<T> implements Container{
    protected List<T> array;
    protected int length;
    protected int elementCount;

    public int size() {
        return elementCount;
    }

    public boolean isEmpty() {
        return elementCount == 0;
    }

    public boolean isFull() {
        return elementCount == length;
    }

    @Override
    public String toString() {
        return "ListContainer{" +
                "array=" + array;
    }
}

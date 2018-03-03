package by.epam.preTraining.shevyakova.task6.containers;

import java.util.Arrays;

public abstract class ArrayContainer<T> implements Container {
    protected T[] array;
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
        return "ArrayContainer{" +
                "array=" + Arrays.toString(array);
    }
}

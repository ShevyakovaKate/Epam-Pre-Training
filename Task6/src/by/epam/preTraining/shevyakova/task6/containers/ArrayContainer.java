package by.epam.preTraining.shevyakova.task6.containers;

import java.util.Arrays;

public abstract class ArrayContainer<T> extends Container {
    protected T[] array;
    protected int length;
    protected int top;

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == length;
    }

    @Override
    public String toString() {
        return "ArrayContainer{" +
                "array=" + Arrays.toString(array);
    }
}

package by.epam.preTrainig.shevyakova.task5.container;

import by.epam.preTrainig.shevyakova.task5.exceptions.TechnicalException;

import java.util.Arrays;
import java.util.Objects;

public class MyArray<T> {
    private T[] array;
    private int length;

    public MyArray() {
        this.array = (T[]) new Object[0];
        this.length = 0;
    }

    public MyArray(T... ob) {
        this.array = (T[]) new Object[ob.length];
        for (int i = 0; i < ob.length; i++){
            ob[i] = ob[i];
        }
        length = ob.length;
    }

    public void add(T ob) {
        T[] temp = array;
        array = (T[]) new Object[++length];
        for (int i = 0; i < temp.length; i++) {
            array[i] = temp[i];
        }
        array[length - 1] = ob;
    }

    public void add(T[] obs) {
        for (T ob : obs) {
            add(ob);
        }
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return array.length == 0;
    }

    public T get(int index) throws TechnicalException {
        try {
            return array[index];
        } catch (IndexOutOfBoundsException e) {
            throw new TechnicalException("Doesn't exist such index in array.", e);
        }
    }

    public void remove(int index) throws TechnicalException {
        try {
            T[] temp = array;
            array = (T[]) new Object[temp.length - 1];
            for (int i = index; i < temp.length - 1; i++) {
                array[i] = temp[i + 1];
            }
            length--;
        } catch (IndexOutOfBoundsException e) {
            throw new TechnicalException("Doesn't exist such index in array", e);
        }
    }

    public void clear() {
        array = (T[]) new Object[0];
        length = array.length;
    }

    public boolean contains(T ob) {
        boolean result = false;
        if (ob == null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null){
                    result = true;
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (ob.equals(array[i])) {
                    result = true;
                }
            }
        }
        return result;
    }

    public boolean contains(T[] obs) {
        for (T ob : obs) {
            if (!contains(ob)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyArray<?> myArray = (MyArray<?>) o;
        return length == myArray.length &&
                Arrays.equals(array, myArray.array);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(length);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "array=" + Arrays.toString(array) +
                ", length=" + length +
                '}';
    }
}

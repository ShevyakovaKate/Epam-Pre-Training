package by.epam.preTraining.shevyakova.task6.containers;

import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;

public class StackArrayDynamicContainer<T> extends StackArrayContainer {

    public StackArrayDynamicContainer() {
        this.array = (T[]) new Object[10];
        this.length = 10;
        this.top = 0;
    }

    public StackArrayDynamicContainer(T[] array) {
        this.array = array;
        this.length = array.length;
        this.top = array.length;
    }

    //copy constructor

    public void push(T element) {
        if(top < length) {
            top++;
            array[top] = element;
        } else {
            T[] temp = (T[]) array;
            length = length * 3 / 2;
            array = (T[]) new Object[length];
            for (int i = 0; i < temp.length; i++) {
                array[i] = temp[i];
            }
            top++;
            array[top] = element;
        }
    }

    public T pop() throws EmptyContainerException {
        if(top == 0) {
            throw new EmptyContainerException("Stack is empty.");
        } else {
            T[] temp = (T[]) array;
            array[top] = null;
            top--;
            return temp[temp.length];
        }
    }
}

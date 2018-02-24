package by.epam.preTraining.shevyakova.task6.containers;

import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;

public class StackArrayDynamicContainer<T> extends ArrayContainer implements Stack {

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

   public StackArrayDynamicContainer(StackArrayDynamicContainer stackArrayDynamicContainer) {
        this.array = stackArrayDynamicContainer.array;
        this.length = stackArrayDynamicContainer.length;
        this.top = stackArrayDynamicContainer.top;
   }

    public Object peek() throws EmptyContainerException {
        if (top == 0) {
            throw new EmptyContainerException("Stack is empty.");
        }
        return array[top - 1];
    }

    @Override
    public void push(Object element) {
        if(top <= length) {
            array[top] = element;
            top++;
        } else {
            T[] temp = (T[]) array;
            length = length * 3 / 2;
            array = (T[]) new Object[length];
            for (int i = 0; i < temp.length; i++) {
                array[i] = temp[i];
            }
            array[top] = element;
            top++;
        }
    }

    @Override
    public T pop() throws EmptyContainerException {
        if(top == 0) {
            throw new EmptyContainerException("Stack is empty.");
        } else {
            T[] temp = (T[]) array;
            array[top - 1] = null;
            top--;
            return temp[temp.length];
        }
    }
}

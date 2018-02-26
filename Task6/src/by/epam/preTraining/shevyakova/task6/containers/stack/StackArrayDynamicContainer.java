package by.epam.preTraining.shevyakova.task6.containers.stack;

public class StackArrayDynamicContainer<T> extends StackArrayContainer {
    private static final int DEFAULT_LENGTH = 10;

    public StackArrayDynamicContainer() {
        this.array = (T[]) new Object[DEFAULT_LENGTH];
        this.length = DEFAULT_LENGTH;
        this.elementCount = 0;
    }

    public StackArrayDynamicContainer(T[] array) {
        this.array = array;
        this.length = array.length;
        this.elementCount = array.length;
    }

   public StackArrayDynamicContainer(StackArrayDynamicContainer stackArrayDynamicContainer) {
        this.array = stackArrayDynamicContainer.array;
        this.length = stackArrayDynamicContainer.length;
        this.elementCount = stackArrayDynamicContainer.elementCount;
   }

    @Override
    public void push(Object element) {
        if(isFull()) {
            T[] temp = (T[]) array;
            length = length * 3 / 2 + 1;
            array = (T[]) new Object[length];
            for (int i = 0; i < temp.length; i++) {
                array[i] = temp[i];
            }
        }
        array[elementCount] = element;
        elementCount++;
    }
}

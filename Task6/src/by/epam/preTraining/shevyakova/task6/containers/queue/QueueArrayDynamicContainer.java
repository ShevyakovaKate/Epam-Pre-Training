package by.epam.preTraining.shevyakova.task6.containers.queue;

public class QueueArrayDynamicContainer<T> extends QueueArrayContainer {
    private static final int DEFAULT_ARRAY_LENGTH = 10;

    public QueueArrayDynamicContainer() {
        this.array = (T[]) new Object[DEFAULT_ARRAY_LENGTH];
        this.length = DEFAULT_ARRAY_LENGTH;
        this.elementCount = 0;
    }

    public QueueArrayDynamicContainer(T[] array) {
        this.array = array;
        this.length = array.length;
        this.elementCount = array.length;
    }

    public QueueArrayDynamicContainer(QueueArrayDynamicContainer queueArrayDynamicContainer) {
        this.array = queueArrayDynamicContainer.array;
        this.length = queueArrayDynamicContainer.length;
        this.elementCount = queueArrayDynamicContainer.elementCount;
    }

    @Override
    public void enqueue(Object element) {
        if(isFull()) {
            T[] temp = (T[]) array;
            length = length * 3 / 2 + 1;
            array = (T[]) new Object[length];
            for (int i = 0; i < elementCount; i++) {
                array[i] = temp[i];
            }
        }
        array[elementCount] = element;
        elementCount++;
    }
}

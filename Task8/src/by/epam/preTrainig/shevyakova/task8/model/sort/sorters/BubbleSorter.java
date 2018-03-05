package by.epam.preTrainig.shevyakova.task8.model.sort.sorters;

import by.epam.preTrainig.shevyakova.task8.model.container.MyArray;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.ArrayException;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.NullObjectException;

public class BubbleSorter<T extends Comparable> implements Sortable {

    @Override
    public MyArray sort(MyArray array) throws ArrayException, NullObjectException {
        int size = array.size();
        MyArray<T> result = MyArray.copyOfRange(array, 0, size);
        for (int j = 0; j < size - 1; j++) {
            boolean flag = true;
            for (int i = 0; i < size - 1 - j; i++) {
                T currentPlane = result.get(i);
                T nextPlane = result.get(i + 1);
                if (currentPlane.compareTo(nextPlane) > 0) {
                    T temp = currentPlane;
                    result.set(nextPlane, i);
                    result.set(temp, i + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return result;
    }
}

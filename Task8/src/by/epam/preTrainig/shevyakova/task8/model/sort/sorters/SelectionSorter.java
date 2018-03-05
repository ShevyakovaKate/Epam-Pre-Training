package by.epam.preTrainig.shevyakova.task8.model.sort.sorters;

import by.epam.preTrainig.shevyakova.task8.model.container.MyArray;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.ArrayException;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.NullObjectException;

public class SelectionSorter<T extends Comparable> implements Sortable {
    @Override
    public MyArray sort(MyArray array) throws ArrayException, NullObjectException {
        int min;
        T temp;
        int size = array.size();
        MyArray<T> result = MyArray.copyOfRange(array, 0, size);
        for (int i = 0; i < size - 1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (result.get(j).compareTo(result.get(min)) < 0) {
                    min = j;
                }
            }
            temp = result.get(min);
            result.set(result.get(i), min);
            result.set(temp, i);
        }
        return result;
    }
}

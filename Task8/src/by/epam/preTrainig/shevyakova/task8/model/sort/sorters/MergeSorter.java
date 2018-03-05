package by.epam.preTrainig.shevyakova.task8.model.sort.sorters;

import by.epam.preTrainig.shevyakova.task8.model.container.MyArray;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.ArrayException;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.NullObjectException;

public class MergeSorter<T extends Comparable> implements Sortable {

    @Override
    public MyArray sort(MyArray array) throws ArrayException, NullObjectException {
        int size = array.size();
        if(size < 2) {
            return array;
        }
        int middle = size / 2;
        MyArray<T> array1 = MyArray.copyOfRange(array, 0, middle);
        MyArray<T> array2 = MyArray.copyOfRange(array, middle, size);
        return merge(sort(array1), sort(array2));
    }

    private MyArray<T> merge(MyArray<T> array1, MyArray<T> array2) throws ArrayException, NullObjectException {
        int len_1 = array1.size();
        int len_2 = array2.size();
        int commonSize = len_1 + len_2;
        MyArray<T> result = new MyArray<>(commonSize);
        int iterator1 = 0;
        int iterator2 = 0;
        for (int i = 0; i < commonSize; i++) {
            if (iterator2 < len_2 && iterator1 < len_1) {
                if (array1.get(iterator1).compareTo(array2.get(iterator2)) > 0) {
                    result.set(array2.get(iterator2++), i);
                } else {
                    result.set(array1.get(iterator1++), i);
                }
            } else if (iterator2 < len_2) {
                result.set(array2.get(iterator2++), i);
            } else {
                result.set(array1.get(iterator1++), i);
            }
        }
        return result;
    }
}

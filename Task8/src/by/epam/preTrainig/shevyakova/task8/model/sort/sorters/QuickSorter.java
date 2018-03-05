package by.epam.preTrainig.shevyakova.task8.model.sort.sorters;

import by.epam.preTrainig.shevyakova.task8.model.container.MyArray;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.ArrayException;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.NullObjectException;

public class QuickSorter<T extends Comparable> implements Sortable {
    @Override
    public MyArray sort(MyArray array) throws ArrayException, NullObjectException {
        int size = array.size();
        MyArray<T> result = MyArray.copyOfRange(array, 0, size);
        int startIndex = 0;
        int endIndex = size - 1;
        doSort(result, startIndex, endIndex);
        return result;
    }

    private void doSort(MyArray<T> array, int start, int end) throws ArrayException, NullObjectException {
        if (start >= end)
            return;
        int i = start;
        int j = end;
        int current = i - (i - j) / 2;
        while (i < j) {
            while (i < current && (array.get(i).compareTo(array.get(current)) <= 0)) {
                i++;
            }
            while (j > current && (array.get(current).compareTo(array.get(j)) <= 0)) {
                j--;
            }
            if (i < j) {
                T temp = array.get(i);
                array.set(array.get(j), i);
                array.set(temp, j);
                if (i == current)
                    current = j;
                else if (j == current)
                    current = i;
            }
        }
        doSort(array, start, current);
        doSort(array, current+1, end);
    }
}

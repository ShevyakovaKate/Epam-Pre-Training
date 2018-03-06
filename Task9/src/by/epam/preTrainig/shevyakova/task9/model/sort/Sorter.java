package by.epam.preTrainig.shevyakova.task8.model.sort.sorters;

import by.epam.preTrainig.shevyakova.task9.exceptions.ArrayException;
import by.epam.preTrainig.shevyakova.task9.exceptions.NullObjectException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Sorter<T extends Comparable> {

    public ArrayList<T> sort(ArrayList<T> array) {
        int size = array.size();
        ArrayList<T> result = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            result.add((T)array.get(i));
        }
        int startIndex = 0;
        int endIndex = size - 1;
        doSort(result, startIndex, endIndex);
        return result;
    }

    private void doSort(ArrayList<T> array, int start, int end) {
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
                array.set(i, array.get(j));
                array.set(j, temp);
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

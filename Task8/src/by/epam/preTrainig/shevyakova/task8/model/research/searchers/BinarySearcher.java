package by.epam.preTrainig.shevyakova.task8.model.research.searchers;

import by.epam.preTrainig.shevyakova.task8.model.container.MyArray;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.ArrayException;

public class BinarySearcher<T extends Comparable> implements Searchable {

    @Override
    public int search(MyArray array, Comparable key) throws ArrayException {
        return doBinarySearch(array, key, 0, array.size() - 1);
    }

    private int doBinarySearch(MyArray<T> array, Comparable key, int low, int high)  throws ArrayException {
        int mid = (low + high) / 2;
        if (high < low) {
            return -1;
        }
        if (array.get(mid).compareTo(key) == 0) {
            return mid;
        } else if (array.get(mid).compareTo(key) > 0) {
            return doBinarySearch(array, key, low, mid - 1);
        } else {
            return doBinarySearch(array, key, mid + 1, high);
        }
    }
}

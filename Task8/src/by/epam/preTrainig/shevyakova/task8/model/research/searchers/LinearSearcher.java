package by.epam.preTrainig.shevyakova.task8.model.research.searchers;

import by.epam.preTrainig.shevyakova.task8.model.container.MyArray;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.ArrayException;

public class LinearSearcher<T extends Comparable> implements Searchable {

    @Override
    public int search(MyArray array, Comparable key) throws ArrayException {
        for (int i = 0; i < array.size(); i++) {
            T currentElement = (T)array.get(i);
            if (currentElement.compareTo(key) == 0) {
                return i;
            }
        }
        return -1;
    }
}

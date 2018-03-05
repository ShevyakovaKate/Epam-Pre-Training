package by.epam.preTrainig.shevyakova.task8.model.research.searchers;

import by.epam.preTrainig.shevyakova.task8.model.container.MyArray;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.ArrayException;

public interface Searchable<T extends Comparable> {
    int search(MyArray<T> array, T key) throws ArrayException;
}

package by.epam.preTrainig.shevyakova.task8.model.sort.sorters;

import by.epam.preTrainig.shevyakova.task8.model.container.MyArray;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.ArrayException;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.NullObjectException;

public interface Sortable<T extends Comparable> {
    MyArray<T> sort(MyArray<T> array) throws ArrayException, NullObjectException;
}

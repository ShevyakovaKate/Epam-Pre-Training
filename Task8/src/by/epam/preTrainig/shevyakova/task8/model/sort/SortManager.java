package by.epam.preTrainig.shevyakova.task8.model.sort;

import by.epam.preTrainig.shevyakova.task8.model.container.MyArray;
import by.epam.preTrainig.shevyakova.task8.model.entities.Plane;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.ArrayException;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.NullObjectException;
import by.epam.preTrainig.shevyakova.task8.model.sort.sorters.Sortable;

public class SortManager<T extends Comparable> {
    private Sortable sortType;

    public Sortable getSortType() {
        return sortType;
    }

    public void setSortType(Sortable sortType) {
        this.sortType = sortType;
    }

    public MyArray<Plane> sort(MyArray<T> array) throws ArrayException, NullObjectException {
        return sortType.sort(array);
    }
}

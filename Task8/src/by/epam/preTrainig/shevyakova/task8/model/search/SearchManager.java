package by.epam.preTrainig.shevyakova.task8.model.search;

import by.epam.preTrainig.shevyakova.task8.model.container.MyArray;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.ArrayException;
import by.epam.preTrainig.shevyakova.task8.model.search.searchers.Searchable;

public class SearchManager<T extends Comparable> {
    private Searchable searchType;

    public Searchable getSearchType() {
        return searchType;
    }

    public void setSearchType(Searchable searchType) {
        this.searchType = searchType;
    }

    public int search(MyArray<T> array, T key) throws ArrayException {
        return searchType.search(array, key);
    }
}

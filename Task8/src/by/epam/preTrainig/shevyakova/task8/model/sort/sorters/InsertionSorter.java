package by.epam.preTrainig.shevyakova.task8.model.sort.sorters;

import by.epam.preTrainig.shevyakova.task8.model.container.MyArray;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.ArrayException;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.NullObjectException;

public class InsertionSorter<T extends Comparable> implements Sortable {

    @Override
    public MyArray sort(MyArray array) throws ArrayException, NullObjectException {
        int size = array.size();
        MyArray<T> result = MyArray.copyOfRange(array, 0, size);
        for(int i = 1; i < size ;i++){
            for(int j = i; j > 0 && result.get(j - 1).compareTo(result.get(j)) > 0; j--){
                T temp = result.get(j - 1);
                result.set(result.get(j), j - 1);
                result.set(temp, j);
            }
        }
        return result;
    }
}

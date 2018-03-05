package by.epam.preTrainig.shevyakova.task8.model;

import by.epam.preTrainig.shevyakova.task8.model.exceptions.ArrayException;
import by.epam.preTrainig.shevyakova.task8.model.entities.Plane;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.NullObjectException;
import by.epam.preTrainig.shevyakova.task8.model.research.SearchManager;
import by.epam.preTrainig.shevyakova.task8.model.research.searchers.BinarySearcher;
import by.epam.preTrainig.shevyakova.task8.model.research.searchers.LinearSearcher;
import by.epam.preTrainig.shevyakova.task8.model.research.SearchTypes;
import by.epam.preTrainig.shevyakova.task8.model.sort.SortManager;
import by.epam.preTrainig.shevyakova.task8.model.sort.SortTypes;
import by.epam.preTrainig.shevyakova.task8.model.sort.sorters.*;

public class AerodromeManager {
    private Aerodrome aerodrome;

    public AerodromeManager(Aerodrome aerodrome) {
        this.aerodrome = aerodrome;
    }

    public int calculateTotalCarryingCapacity() throws ArrayException {
        int totalCarryingCapacity = 0;
        for (int i = 0; i < aerodrome.size(); i++) {
            Plane currentPlane = aerodrome.getPlanes().get(i);
            totalCarryingCapacity +=  currentPlane.getCarryingCapacity();
        }
        return totalCarryingCapacity;
    }

    public int calculateTotalSeatingCapacity() throws ArrayException {
        int totalSeatingCapacity = 0;
        for (int i = 0; i < aerodrome.size(); i++) {
            Plane currentPlane = aerodrome.getPlanes().get(i);
            totalSeatingCapacity += currentPlane.getSeatingCapacity();
        }
        return totalSeatingCapacity;
    }

    public Plane findMaxCarryingCapacityPlane() throws ArrayException {
        int maxCarryingCapacity = 0;
        Plane maxCarryingCapacityPlane = null;
        for (int i = 0; i < aerodrome.size(); i++) {
            Plane currentPlane = aerodrome.getPlanes().get(i);
            int currentCarryingCapacity = currentPlane.getCarryingCapacity();
            if (currentCarryingCapacity > maxCarryingCapacity) {
                maxCarryingCapacity = currentCarryingCapacity;
                maxCarryingCapacityPlane = currentPlane;
            }
        }
        return maxCarryingCapacityPlane;
    }

    public Plane findMaxSeatingCapacityPlane() throws ArrayException {
        int maxSeatingCapacity = 0;
        Plane maxSeatingCapacityPlane = null;
        for (int i = 0; i < aerodrome.size(); i++) {
            Plane currentPlane = aerodrome.getPlanes().get(i);
            int currentSeatingCapacity = currentPlane.getSeatingCapacity();
            if (currentSeatingCapacity > maxSeatingCapacity) {
                maxSeatingCapacity = currentSeatingCapacity;
                maxSeatingCapacityPlane = currentPlane;
            }
        }
        return maxSeatingCapacityPlane;
    }

    public Plane findMinCarryingCapacityPlane() throws ArrayException {
        Plane minCarryingCapacityPlane = aerodrome.getPlanes().get(0);
        int minCarryingCapacity = minCarryingCapacityPlane.getCarryingCapacity();
        for (int i = 1; i < aerodrome.size(); i++) {
            Plane currentPlane = aerodrome.getPlanes().get(i);
            int currentCarryingCapacity = currentPlane.getCarryingCapacity();
            if (currentCarryingCapacity < minCarryingCapacity) {
                minCarryingCapacity = currentCarryingCapacity;
                minCarryingCapacityPlane = currentPlane;
            }
        }
        return minCarryingCapacityPlane;
    }

    public Plane findMinSeatingCapacityPlane() throws ArrayException {
        Plane minSeatingCapacityPlane = aerodrome.getPlanes().get(0);
        int minSeatingCapacity = minSeatingCapacityPlane.getSeatingCapacity();
        for (int i = 1; i < aerodrome.size(); i++) {
            Plane currentPlane = aerodrome.getPlanes().get(i);
            int currentSeatingCapacity = currentPlane.getSeatingCapacity();
            if (currentSeatingCapacity < minSeatingCapacity) {
                minSeatingCapacity = currentSeatingCapacity;
                minSeatingCapacityPlane = currentPlane;
            }
        }
        return minSeatingCapacityPlane;
    }

    public Aerodrome sort(SortTypes type) throws ArrayException, NullObjectException{
        SortManager sortManager = new SortManager();
        switch (type) {
            case BUBBLE:
                sortManager.setSortType(new BubbleSorter());
                break;
            case INSERTION:
                sortManager.setSortType(new InsertionSorter());
                break;
            case MERGE:
                sortManager.setSortType(new MergeSorter());
                break;
            case QUICK:
                sortManager.setSortType(new QuickSorter());
                break;
            case SELECTION:
                sortManager.setSortType(new SelectionSorter());
                break;
        }
        Aerodrome result = new Aerodrome();
        result.setPlanes(sortManager.sort(aerodrome.getPlanes()));
        return result;
    }

    public int search(Plane plane, SearchTypes type) throws ArrayException {
        SearchManager searchManager = new SearchManager();
        switch (type) {
            case LINEAR:
                searchManager.setSearchType(new LinearSearcher<>());
                break;
            case BINARY:
                searchManager.setSearchType(new BinarySearcher());
                break;
        }
        int result = searchManager.search(aerodrome.getPlanes(), plane);
        return result;
    }
}

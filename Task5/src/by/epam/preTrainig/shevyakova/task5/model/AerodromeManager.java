package by.epam.preTrainig.shevyakova.task5.model;

import by.epam.preTrainig.shevyakova.task5.exceptions.ArrayException;
import by.epam.preTrainig.shevyakova.task5.model.entities.Plane;

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
}

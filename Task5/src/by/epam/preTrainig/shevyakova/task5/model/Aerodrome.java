package by.epam.preTrainig.shevyakova.task5.model;

import by.epam.preTrainig.shevyakova.task5.container.MyArray;
import by.epam.preTrainig.shevyakova.task5.entities.Plane;
import by.epam.preTrainig.shevyakova.task5.exceptions.TechnicalException;

public class Aerodrome {

    private MyArray<Plane> planes;

    public Aerodrome() {
        planes = new MyArray<>();
    }

    public Aerodrome(Aerodrome aerodrome) {
        this.planes = aerodrome.planes;
    }

    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    public void removePlane(int index) throws TechnicalException {
        planes.remove(index);
    }

    public int calculateTotalCarryingCapacity() throws TechnicalException {
        int totalCarryingCapacity = 0;
        for (int i = 0; i < planes.size(); i++) {
            Plane currentPlane = planes.get(i);
            totalCarryingCapacity +=  currentPlane.getCarryingCapacity();
        }
        return totalCarryingCapacity;
    }

    public int calculateTotalSeatingCapacity() throws TechnicalException {
        int totalSeatingCapacity = 0;
        for (int i = 0; i < planes.size(); i++) {
            Plane currentPlane = planes.get(i);
            totalSeatingCapacity += currentPlane.getSeatingCapacity();
        }
        return totalSeatingCapacity;
    }

    public Plane findMaxCarryingCapacityPlane() throws TechnicalException {
        int maxCarryingCapacity = 0;
        Plane maxCarryingCapacityPlane = null;
        for (int i = 0; i < planes.size(); i++) {
            Plane currentPlane = planes.get(i);
            int currentCarryingCapacity = currentPlane.getCarryingCapacity();
            if (currentCarryingCapacity > maxCarryingCapacity) {
                maxCarryingCapacity = currentCarryingCapacity;
                maxCarryingCapacityPlane = currentPlane;
            }
        }
        return maxCarryingCapacityPlane;
    }

    public Plane findMaxSeatingCapacityPlane() throws TechnicalException {
        int maxSeatingCapacity = 0;
        Plane maxSeatingCapacityPlane = null;
        for (int i = 0; i < planes.size(); i++) {
            Plane currentPlane = planes.get(i);
            int currentSeatingCapacity = currentPlane.getSeatingCapacity();
            if (currentSeatingCapacity > maxSeatingCapacity) {
                maxSeatingCapacity = currentSeatingCapacity;
                maxSeatingCapacityPlane = currentPlane;
            }
        }
        return maxSeatingCapacityPlane;
    }

    public Plane findMinCarryingCapacityPlane() throws TechnicalException {
        Plane minCarryingCapacityPlane = planes.get(0);
        int minCarryingCapacity = minCarryingCapacityPlane.getCarryingCapacity();
        for (int i = 1; i < planes.size(); i++) {
            Plane currentPlane = planes.get(i);
            int currentCarryingCapacity = currentPlane.getCarryingCapacity();
            if (currentCarryingCapacity < minCarryingCapacity) {
                minCarryingCapacity = currentCarryingCapacity;
                minCarryingCapacityPlane = currentPlane;
            }
        }
        return minCarryingCapacityPlane;
    }

    public Plane findMinSeatingCapacityPlane() throws TechnicalException {
        Plane minSeatingCapacityPlane = planes.get(0);
        int minSeatingCapacity = minSeatingCapacityPlane.getSeatingCapacity();
        for (int i = 1; i < planes.size(); i++) {
            Plane currentPlane = planes.get(i);
            int currentSeatingCapacity = currentPlane.getSeatingCapacity();
            if (currentSeatingCapacity < minSeatingCapacity) {
                minSeatingCapacity = currentSeatingCapacity;
                minSeatingCapacityPlane = currentPlane;
            }
        }
        return minSeatingCapacityPlane;
    }
}

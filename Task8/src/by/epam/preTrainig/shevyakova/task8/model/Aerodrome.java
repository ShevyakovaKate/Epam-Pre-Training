package by.epam.preTrainig.shevyakova.task8.model;

import by.epam.preTrainig.shevyakova.task8.model.container.MyArray;
import by.epam.preTrainig.shevyakova.task8.model.entities.Plane;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.ArrayException;

public class Aerodrome {

    private MyArray<Plane> planes;

    public Aerodrome() {
        planes = new MyArray<>();
    }

    public Aerodrome(Aerodrome aerodrome) {
        this.planes = aerodrome.planes;
    }

    public MyArray<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(MyArray<Plane> planes) {
        this.planes = planes;
    }

    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    public void removePlane(int index) throws ArrayException {
        planes.remove(index);
    }

    public int size() {
        return planes.size();
    }

    @Override
    public String toString() {
        return "Aerodrome{" +
                "planes=" + planes +
                '}';
    }
}

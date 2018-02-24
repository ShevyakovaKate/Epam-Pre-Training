package by.epam.preTrainig.shevyakova.task5.model.entities;

import java.util.Objects;

public class AirPlane extends Plane {


    public AirPlane() {
    }

    public AirPlane(String name, int seatingCapacity) {
        super(name, seatingCapacity, 0);
    }

    public AirPlane(AirPlane airPlane) {
        super(airPlane);
    }

    @Override
    public int getCarryingCapacity() {
        return 0;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirPlane airPlane = (AirPlane) o;
        return seatingCapacity == airPlane.seatingCapacity &&
                Objects.equals(name, airPlane.name);
    }

    @Override
    public int hashCode() {
        return (29 * seatingCapacity + (name == null ? 0 : name.hashCode()));
    }

    @Override
    public String toString() {
        return "AirPlane{" +
                "name='" + name + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                '}';
    }
}

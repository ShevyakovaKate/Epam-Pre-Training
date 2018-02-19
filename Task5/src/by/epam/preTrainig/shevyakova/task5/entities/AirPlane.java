package by.epam.preTrainig.shevyakova.task5.entities;

import java.util.Objects;

public class AirPlane extends Plane {
    private String name;
    private int seatingCapacity;

    public AirPlane() {
        this.name = "Unknown";
    }

    public AirPlane(String name, int seatingCapacity) {
        this.name = name;
        this.seatingCapacity = seatingCapacity;
    }

    public AirPlane(AirPlane airPlane) {
        this.name = airPlane.getName();
        this.seatingCapacity = airPlane.getSeatingCapacity();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getSeatingCapacity() {
        return seatingCapacity;
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

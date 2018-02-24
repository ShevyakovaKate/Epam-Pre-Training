package by.epam.preTrainig.shevyakova.task5.model.entities;

import java.util.Objects;

public class Plane {
    protected String name;
    protected int seatingCapacity;
    protected int carryingCapacity;

    public Plane() {
        this.name = "Unknown";
    }

    public Plane(String name, int seatingCapacity, int carryingCapacity) {
        this.name = name;
        this.seatingCapacity = seatingCapacity;
        this.carryingCapacity = carryingCapacity;
    }

    public Plane(Plane plane) {
        this.name = plane.name;
        this.seatingCapacity = plane.seatingCapacity;
        this.carryingCapacity = plane.carryingCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCarryingCapacity() { return carryingCapacity; }

    public int getSeatingCapacity() { return seatingCapacity; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return seatingCapacity == plane.seatingCapacity &&
                carryingCapacity == plane.carryingCapacity &&
                Objects.equals(name, plane.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, seatingCapacity, carryingCapacity);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                ", carryingCapacity=" + carryingCapacity +
                '}';
    }
}

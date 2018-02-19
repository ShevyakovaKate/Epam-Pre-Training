package by.epam.preTrainig.shevyakova.task5.entities;

import java.util.Objects;

public class CargoPlane extends Plane {
    private String name;
    private int carryingCapacity;

    public CargoPlane() {
        this.name = "Unknown";
    }

    public CargoPlane(String name, int carryingCapacity) {
        this.name = name;
        this.carryingCapacity = carryingCapacity;
    }

    public CargoPlane(CargoPlane cargoPlane) {
        this.name = cargoPlane.getName();
        this.carryingCapacity = cargoPlane.getCarryingCapacity();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    @Override
    public int getSeatingCapacity() {
        return 0;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CargoPlane that = (CargoPlane) o;
        return carryingCapacity == that.carryingCapacity &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return (29 * carryingCapacity + (name == null ? 0 : name.hashCode()));
    }

    @Override
    public String toString() {
        return "CargoPlane{" +
                "name='" + name + '\'' +
                ", carryingCapacity=" + carryingCapacity +
                '}';
    }
}
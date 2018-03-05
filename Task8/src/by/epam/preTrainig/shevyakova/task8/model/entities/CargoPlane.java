package by.epam.preTrainig.shevyakova.task8.model.entities;

import java.util.Objects;

public class CargoPlane extends Plane {

    public CargoPlane() {
    }

    public CargoPlane(String name,int cost, int carryingCapacity) {
        super(name,cost, 0, carryingCapacity);
    }

    public CargoPlane(CargoPlane cargoPlane) {
        super(cargoPlane);
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
                ",cost=" + cost +
                ", carryingCapacity=" + carryingCapacity +
                '}';
    }
}
package by.epam.preTrainig.shevyakova.task8.model.entities;

import by.epam.preTrainig.shevyakova.task8.util.ObjectGenerator;

import java.util.Objects;

public class Plane implements Comparable {
    protected String name;
    protected int cost;
    protected int seatingCapacity;
    protected int carryingCapacity;

    public Plane() {
        this.name = "Unknown";
    }

    public Plane(String name,int cost, int seatingCapacity, int carryingCapacity) {
        this.name = name;
        this.cost = cost;
        this.seatingCapacity = seatingCapacity;
        this.carryingCapacity = carryingCapacity;
    }

    public Plane(Plane plane) {
        this.name = plane.name;
        this.cost = plane.cost;
        this.seatingCapacity = plane.seatingCapacity;
        this.carryingCapacity = plane.carryingCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {return cost;}

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCarryingCapacity() { return carryingCapacity; }

    public int getSeatingCapacity() { return seatingCapacity; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return cost == plane.cost &&
                seatingCapacity == plane.seatingCapacity &&
                carryingCapacity == plane.carryingCapacity &&
                Objects.equals(name, plane.name);
    }

    @Override
    public int compareTo(Object o) {
        Plane plane = (Plane) o;
        return this.name.compareTo(plane.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, cost, seatingCapacity, carryingCapacity);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ",cost=" + cost +
                ", seatingCapacity=" + seatingCapacity +
                ", carryingCapacity=" + carryingCapacity +
                '}';
    }
}

package by.epam.preTrainig.shevyakova.task8.util;

import by.epam.preTrainig.shevyakova.task8.model.Aerodrome;
import by.epam.preTrainig.shevyakova.task8.model.entities.AirPlane;
import by.epam.preTrainig.shevyakova.task8.model.entities.CargoPlane;
import by.epam.preTrainig.shevyakova.task8.model.entities.Plane;

import java.util.Random;
import java.util.UUID;

public class ObjectGenerator {
    private static final int MAX_COST = 1_000_000;
    private static final int MIN_COST = 1_000;
    private static final int MAX_AERODROME_SIZE = 50;
    private static final int MAX_SEATING_CAPACITY = 400;
    private static final int MIN_SEATING_CAPACITY = 10;
    private static final int MAX_CARRYING_CAPACITY = 10_000;
    private static final int MIN_CARRYING_CAPACITY = 1_000;

    private static ObjectGenerator instance = new ObjectGenerator();

    private ObjectGenerator() {
    }

    public static ObjectGenerator getInstance() {
        return instance;
    }

    public Aerodrome generateAerodrome() {
        Aerodrome aerodrome = new Aerodrome();
        Random random = new Random();
        int aerodromeSize = random.nextInt(MAX_AERODROME_SIZE) + 1;
        for (int i = 0; i < aerodromeSize; i++) {
            if(random.nextBoolean()) {
                aerodrome.addPlane(generatePlane(PlaneTypes.AIRPLANE));
            } else {
                aerodrome.addPlane(generatePlane(PlaneTypes.CARGOPLANE));
            }
        }
        return aerodrome;
    }

    public Plane generatePlane(PlaneTypes planeType) {
        Plane plane = null;
        switch (planeType) {
            case AIRPLANE:
                plane = generateAirPlane();
                break;
            case CARGOPLANE:
                plane = generateCargoPlane();
                break;
        }
        return plane;
    }

    private AirPlane generateAirPlane() {
        StringBuilder name = new StringBuilder("AirPlane№");
        UUID id = UUID.randomUUID();
        name.append(id);
        Random random = new Random();
        int seatingCapacity = random.nextInt(MAX_SEATING_CAPACITY) + MIN_SEATING_CAPACITY;
        int cost = random.nextInt(MAX_COST) + MIN_COST;
        return new AirPlane(name.toString(),cost, seatingCapacity);
    }

    private CargoPlane generateCargoPlane() {
        StringBuilder name = new StringBuilder("CargoPlane№");
        UUID id = UUID.randomUUID();
        name.append(id);
        Random random = new Random();
        int carryingCapacity = random.nextInt(MAX_CARRYING_CAPACITY) + MIN_CARRYING_CAPACITY;
        int cost = random.nextInt(MAX_COST) + MIN_COST;
        return new CargoPlane(name.toString(),cost, carryingCapacity);
    }

}

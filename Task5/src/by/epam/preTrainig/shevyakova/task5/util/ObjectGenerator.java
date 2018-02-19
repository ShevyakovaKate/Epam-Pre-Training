package by.epam.preTrainig.shevyakova.task5.util;

import by.epam.preTrainig.shevyakova.task5.entities.AirPlane;
import by.epam.preTrainig.shevyakova.task5.entities.CargoPlane;
import by.epam.preTrainig.shevyakova.task5.model.Aerodrome;

import java.util.Random;
import java.util.UUID;

public class ObjectGenerator {

    private static final int MAX_AERODROME_SIZE = 50;
    private static final int MAX_SEATING_CAPACITY = 400;
    private static final int MIN_SEATING_CAPACITY = 10;
    private static final int MAX_CARRYING_CAPACITY = 10_000;
    private static final int MIN_CARRYING_CAPACITY = 1_000;

    public static Aerodrome generateAerodrome() {
        Aerodrome aerodrome = new Aerodrome();
        Random random = new Random();
        int aerodromeSize = random.nextInt(MAX_AERODROME_SIZE) + 1;
        for (int i = 0; i < aerodromeSize; i++) {
            if(random.nextBoolean()) {
                aerodrome.addPlane(generateAirPlane());
            } else {
                aerodrome.addPlane(generateCargoPlane());
            }
        }
        return aerodrome;
    }


    public static AirPlane generateAirPlane() {
        StringBuilder name = new StringBuilder("AirPlane№");
        UUID id = UUID.randomUUID();
        name.append(id);
        Random random = new Random();
        int seatingCapacity = random.nextInt(MAX_SEATING_CAPACITY) + MIN_SEATING_CAPACITY;
        return new AirPlane(name.toString(), seatingCapacity);
    }

    public static CargoPlane generateCargoPlane() {
        StringBuilder name = new StringBuilder("CargoPlane№");
        UUID id = UUID.randomUUID();
        name.append(id);
        Random random = new Random();
        int carryingCapacity = random.nextInt(MAX_CARRYING_CAPACITY) + MIN_CARRYING_CAPACITY;
        return new CargoPlane(name.toString(), carryingCapacity);
    }

}

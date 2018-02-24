package by.epam.preTrainig.shevyakova.task5.controller;

import by.epam.preTrainig.shevyakova.task5.exceptions.ArrayException;
import by.epam.preTrainig.shevyakova.task5.model.Aerodrome;
import by.epam.preTrainig.shevyakova.task5.model.AerodromeManager;
import by.epam.preTrainig.shevyakova.task5.util.ObjectGenerator;
import by.epam.preTrainig.shevyakova.task5.view.ResultPrinter;

public class Main {

    public static void main(String[] args) {
        try {
            ObjectGenerator generator = ObjectGenerator.getInstance();
            Aerodrome aerodrome = generator.generateAerodrome();
            System.out.println(aerodrome.toString());
            System.out.println(aerodrome.getPlanes().toString());
            System.out.println(aerodrome.size());
            AerodromeManager aerodromeManager = new AerodromeManager(aerodrome);
            ResultPrinter.print(aerodromeManager.calculateTotalCarryingCapacity());
            ResultPrinter.print(aerodromeManager.calculateTotalSeatingCapacity());
            ResultPrinter.print(aerodromeManager.findMaxCarryingCapacityPlane());
            ResultPrinter.print(aerodromeManager.findMaxSeatingCapacityPlane());
            ResultPrinter.print(aerodromeManager.findMinCarryingCapacityPlane());
            ResultPrinter.print(aerodromeManager.findMinSeatingCapacityPlane());
        } catch (ArrayException e){
            e.printStackTrace();
        }
    }
}

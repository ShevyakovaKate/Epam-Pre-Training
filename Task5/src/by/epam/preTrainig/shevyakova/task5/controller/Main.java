package by.epam.preTrainig.shevyakova.task5.controller;

import by.epam.preTrainig.shevyakova.task5.exceptions.TechnicalException;
import by.epam.preTrainig.shevyakova.task5.model.Aerodrome;
import by.epam.preTrainig.shevyakova.task5.util.ObjectGenerator;
import by.epam.preTrainig.shevyakova.task5.view.ResultPrinter;

public class Main {

    public static void main(String[] args) {
        try {
            Aerodrome aerodrome = ObjectGenerator.generateAerodrome();
            ResultPrinter.print(aerodrome.calculateTotalCarryingCapacity());
            ResultPrinter.print(aerodrome.calculateTotalSeatingCapacity());
            ResultPrinter.print(aerodrome.findMaxCarryingCapacityPlane());
            ResultPrinter.print(aerodrome.findMinCarryingCapacityPlane());
            ResultPrinter.print(aerodrome.findMaxSeatingCapacityPlane());
            ResultPrinter.print(aerodrome.findMinSeatingCapacityPlane());
        } catch (TechnicalException e){
            e.printStackTrace();
        }
    }
}

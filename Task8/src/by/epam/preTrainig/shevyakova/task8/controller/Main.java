package by.epam.preTrainig.shevyakova.task8.controller;

import by.epam.preTrainig.shevyakova.task8.model.Aerodrome;
import by.epam.preTrainig.shevyakova.task8.model.AerodromeManager;
import by.epam.preTrainig.shevyakova.task8.model.container.MyArray;
import by.epam.preTrainig.shevyakova.task8.model.entities.Plane;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.ArrayException;
import by.epam.preTrainig.shevyakova.task8.model.exceptions.NullObjectException;
import by.epam.preTrainig.shevyakova.task8.model.research.SearchTypes;
import by.epam.preTrainig.shevyakova.task8.model.sort.SortTypes;
import by.epam.preTrainig.shevyakova.task8.model.sort.sorters.*;
import by.epam.preTrainig.shevyakova.task8.util.ObjectGenerator;
import by.epam.preTrainig.shevyakova.task8.util.PlaneTypes;
import by.epam.preTrainig.shevyakova.task8.view.ResultPrinter;

public class Main {

    public static void main(String[] args) {
        try {
            ObjectGenerator generator = ObjectGenerator.getInstance();
            Aerodrome aerodrome = generator.generateAerodrome();
            ResultPrinter.print("Plane before sorting by cost: " + aerodrome.getPlanes().toString());
            AerodromeManager aerodromeManager = new AerodromeManager(aerodrome);
            Aerodrome sortedAerodrome;
            sortedAerodrome = aerodromeManager.sort(SortTypes.BUBBLE);
            ResultPrinter.print("Planes after sorting with bubble sort: " + sortedAerodrome.getPlanes().toString());
            sortedAerodrome = aerodromeManager.sort(SortTypes.INSERTION);
            ResultPrinter.print("Planes after sorting with insert sort: " + sortedAerodrome.getPlanes().toString());
            sortedAerodrome = aerodromeManager.sort(SortTypes.MERGE);
            ResultPrinter.print("Planes after sorting with merge sort: " + sortedAerodrome.getPlanes().toString());
            sortedAerodrome = aerodromeManager.sort(SortTypes.QUICK);
            ResultPrinter.print("Planes after sorting with quick sort: " + sortedAerodrome.getPlanes().toString());
            sortedAerodrome = aerodromeManager.sort(SortTypes.SELECTION);
            ResultPrinter.print("Planes after sorting with selection sort: " + sortedAerodrome.getPlanes().toString());

            Plane myPlane = generator.generatePlane(PlaneTypes.CARGOPLANE);
            aerodrome.addPlane(myPlane);
            ResultPrinter.print("Linear search: " + aerodromeManager.search(myPlane, SearchTypes.LINEAR));
            ResultPrinter.print("Binary search: " + aerodromeManager.search(myPlane, SearchTypes.BINARY));

        } catch (ArrayException|NullObjectException e) {
            e.printStackTrace();
        }
    }
}

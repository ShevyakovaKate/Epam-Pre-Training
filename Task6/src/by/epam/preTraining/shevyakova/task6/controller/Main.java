package by.epam.preTraining.shevyakova.task6.controller;

import by.epam.preTraining.shevyakova.task6.exceptions.CrowdedStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;
import by.epam.preTraining.shevyakova.task6.model.ModelWorker;
import by.epam.preTraining.shevyakova.task6.view.ResultPrinter;

public class Main {

    public static void main(String[] args) {
        try {
            ResultPrinter.print(ModelWorker.isPalindrome("99999"));
        } catch (CrowdedStackException|EmptyContainerException e) {
            e.printStackTrace();
        }
    }
}

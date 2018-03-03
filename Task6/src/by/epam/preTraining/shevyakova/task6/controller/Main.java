package by.epam.preTraining.shevyakova.task6.controller;

import by.epam.preTraining.shevyakova.task6.exceptions.EmptyElementException;
import by.epam.preTraining.shevyakova.task6.exceptions.FullStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;
import by.epam.preTraining.shevyakova.task6.exceptions.IllegalIndexException;
import by.epam.preTraining.shevyakova.task6.model.ModelWorker;
import by.epam.preTraining.shevyakova.task6.view.ResultPrinter;

public class Main {

    public static void main(String[] args) {
        try {
            ResultPrinter.print(ModelWorker.isPalindrome("99999"));
        } catch (FullStackException|EmptyContainerException|EmptyElementException|IllegalIndexException e) {
            e.printStackTrace();
        }
    }
}

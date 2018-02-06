package by.epam.preTrainig.task3.Controller;

import by.epam.preTrainig.task3.Model.NumberWorker;
import by.epam.preTrainig.task3.Validator.Validator;
import by.epam.preTrainig.task3.View.ResultPrinter;

public class Main {

    public static void main(String[] args) {

        int number = 4568;
        if(!Validator.validateNaturalNumber(number)) {
            ResultPrinter.printNotValidNumber();
            return;
        }

        boolean isPerfect = NumberWorker.isPerfectNumber(number);
        ResultPrinter.printIsPerfect(isPerfect);
    }
}

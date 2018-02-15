package by.epam.preTraining.task4.model;

import by.epam.preTraining.task4.exceptions.ZeroNumberException;
import by.epam.preTraining.task4.validator.NumberValidator;

public class PowerWorker {

    public static double powRecursion(double number, int power) throws ZeroNumberException {
        if(NumberValidator.isZeroNumber(number)) {
            throw new ZeroNumberException("Number should not be zero value.");
        }
        if (power == 0) {
            return 1;
        }
        return number * powRecursion(number, power - 1);
    }

    public static double powIteration(double number, int power) throws ZeroNumberException {
        if(NumberValidator.isZeroNumber(number)) {
            throw new ZeroNumberException("Number should not be zero value.");
        }
        double result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }
}

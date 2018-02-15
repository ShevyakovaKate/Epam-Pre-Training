package by.epam.preTraining.task4.model;

import by.epam.preTraining.task4.exceptions.NaturalNumberException;
import by.epam.preTraining.task4.validator.NumberValidator;

public class SumOfDigitsWorker {

    public static int calculateSumOfDigitsRecursion(int number) throws NaturalNumberException {
        if (!NumberValidator.isNaturalNumber(number)) {
            throw new NaturalNumberException("Number is not natural.");
        }
        if (number < 10) {
            return number;
        }
        return number % 10 + calculateSumOfDigitsRecursion(number / 10);
    }

    public static int calculateSumOfDigitsIteration(int number) throws NaturalNumberException {
        if (!NumberValidator.isNaturalNumber(number)) {
            throw new NaturalNumberException("Number is not natural.");
        }
        int sumOfDigits = 0;
        while(number > 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }
        return sumOfDigits;
    }
}

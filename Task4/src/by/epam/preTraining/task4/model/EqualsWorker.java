package by.epam.preTraining.task4.model;

import by.epam.preTraining.task4.exceptions.NaturalNumberException;

public class EqualsWorker {

    public static boolean checkEqualsRecursion(int n, int s) throws NaturalNumberException {
        return SumOfDigitsWorker.calculateSumOfDigitsRecursion(n) == s;
    }

    public static boolean checkEqualsIteration(int n, int s) throws NaturalNumberException {
        return SumOfDigitsWorker.calculateSumOfDigitsIteration(n) == s;
    }
}

package by.epam.preTraining.task4.model;

import by.epam.preTraining.task4.exceptions.NaturalNumberException;
import by.epam.preTraining.task4.validator.NumberValidator;

public class TowerOfHanoi {
    private static StringBuilder result = new StringBuilder();

    public static String calculateHanoiRecursion(int rings, String from, String to, String interim) throws NaturalNumberException{
        if (rings > 0) {
            calculateHanoiRecursion(rings - 1, from, interim, to);
            result.append("\n" + from + " --> " + to);
            calculateHanoiRecursion(rings - 1, interim, to, from);
        }
        return result.toString();
    }

}

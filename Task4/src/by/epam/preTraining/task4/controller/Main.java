package by.epam.preTraining.task4.controller;

import by.epam.preTraining.task4.exceptions.NaturalNumberException;
import by.epam.preTraining.task4.model.*;
import by.epam.preTraining.task4.model.FibonacciWorker;
import by.epam.preTraining.task4.exceptions.ZeroNumberException;
import by.epam.preTraining.task4.view.ResultPrinter;

public class Main {

    public static void main(String[] args) {

        //test application 1 - Sum of digits
        int number = 987987;
        try {
            int calculateSumOfDigitsIterator = SumOfDigitsWorker.calculateSumOfDigitsIteration(number);
            int calculateSumOfDigitsRec = SumOfDigitsWorker.calculateSumOfDigitsRecursion(number);
            ResultPrinter.print(calculateSumOfDigitsIterator);
            ResultPrinter.print(calculateSumOfDigitsRec);
        } catch(NaturalNumberException e){
            e.printStackTrace();
        }

        //test application 2 - Pow
        try {
            double number1 = 2.5;
            int power = 2;
            double powRec = PowerWorker.powRecursion(number1, power);
            double powIterator = PowerWorker.powIteration(number1, power);
            ResultPrinter.print(powRec);
            ResultPrinter.print(powIterator);
        } catch (ZeroNumberException ex) {
            ex.printStackTrace();
        }

        //test application 3 - Equals
        try {
            int n = 456;
            int s  = 456;
            boolean equalsRecursionResult = EqualsWorker.checkEqualsRecursion(n, s);
            boolean equalsIterationResult = EqualsWorker.checkEqualsIteration(n, s);
            ResultPrinter.print(equalsRecursionResult);
            ResultPrinter.print(equalsIterationResult);
        } catch (NaturalNumberException e) {
            e.printStackTrace();
        }

        //test application 4 - Fibonacci
        int number2 = 8;
        int fibonacciNumberRecursion = FibonacciWorker.findFibonacciRecursion(number2);
        int fibonacciNumberIterator = FibonacciWorker.findFibonacciIteration(number2);
        ResultPrinter.print(fibonacciNumberRecursion);
        ResultPrinter.print(fibonacciNumberIterator);

        //test application 5 - Tower Of Hanoi
        String result = TowerOfHanoi.calculateHanoiRecursion(3, "A", "B", "C");
        ResultPrinter.print(result);
    }

}

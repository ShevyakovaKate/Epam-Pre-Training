package by.epam.preTrainig.task3.Controller;

import by.epam.preTrainig.task3.Validator.ValidatorNaturalNumber;
import by.epam.preTrainig.task3.View.ResultPrinter;
import by.epam.preTrainig.task3.Model.NaturalNumberWorker;

public class Main {

    public static void main(String[] args) {

        int number = 6587;
        int a = 45;
        int b = 24;

        if (!ValidatorNaturalNumber.isNatural(number)) {
            ResultPrinter.printNotValidNumber();
            return;
        }

        int maxDigit = NaturalNumberWorker.findMaxDigit(number);
        boolean isPalindrome = NaturalNumberWorker.isPalindrome(number);
        boolean isPrime = NaturalNumberWorker.isPrime(number);
        String divisors = NaturalNumberWorker.getPrimeDivisors(number);
        int gcd = NaturalNumberWorker.gcd(a, b);
        int lcm = NaturalNumberWorker.lcm(a, b);
        int numberOfDifferentDigits = NaturalNumberWorker.getNumberOfDifferentDigits(number);

        ResultPrinter.printMaxDigit(maxDigit);
        ResultPrinter.printIsPalindrome(isPalindrome);
        ResultPrinter.printIsPrime(isPrime);
        ResultPrinter.printPrimeDivisors(divisors);
        ResultPrinter.printGCD(gcd);
        ResultPrinter.printLCM(lcm);
        ResultPrinter.printNumberOfDifferentDigits(numberOfDifferentDigits);

    }
}

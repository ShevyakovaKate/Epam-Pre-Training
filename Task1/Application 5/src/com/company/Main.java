package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 12345;
        int sum = ArithmeticOperationsWorker.calculateTheSumOfDigits(number);
        int multiple = ArithmeticOperationsWorker.calculateTheMultipleOfDigits(number);
        System.out.println(sum + " " + multiple);
    }
}

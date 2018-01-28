package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 123456;
        double arithmeticMean = ArithmeticOperationsWorker.calculateTheArithmeticMean(number);
        double geometricMean = ArithmeticOperationsWorker.calculateTheGeometricMean(number);
        System.out.println(arithmeticMean + " " + geometricMean);
    }
}

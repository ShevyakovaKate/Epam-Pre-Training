package com.company;

public class ArithmeticOperationsWorker {

    public static double calculateTheArithmeticMean(int number) {
        int sum =  number % 10;
        sum += (number / 10) % 10;
        sum += (number / 100) % 10;
        sum += (number / 1000) % 10;
        sum += (number / 10000) % 10;
        sum += (number / 100000) % 10;
        return sum / 6.0;
    }

    public static double calculateTheGeometricMean(int number){
        int multiple =  number % 10;
        multiple *= (number / 10) % 10;
        multiple *= (number / 100) % 10;
        multiple *= (number / 1000) % 10;
        multiple *= (number / 10000) % 10;
        multiple *= (number / 100000) % 10;
        return Math.pow(multiple, 1.0/6);
    }
}



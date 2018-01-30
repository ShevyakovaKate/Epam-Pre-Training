package com.company;

public class ArithmeticOperationsWorker {

    public static int calculateTheSumOfDigits(int number){
        int sum =  number % 10;
        sum += (number / 10) % 10;
        sum += (number / 100) % 10;
        sum += (number / 1000) % 10;
        sum += (number / 10000) % 10;
        return sum;
    }

    public static int calculateTheMultipleOfDigits(int number){
        int multiple =  number % 10;
        multiple *= (number / 10) % 10;
        multiple *= (number / 100) % 10;
        multiple *= (number / 1000) % 10;
        multiple *= (number / 10000) % 10;
        return multiple;
    }
}

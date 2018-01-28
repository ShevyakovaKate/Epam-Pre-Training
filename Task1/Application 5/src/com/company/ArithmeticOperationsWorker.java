package com.company;

public class ArithmeticOperationsWorker {

    public static int calculateTheSumOfDigits(int number){
        int sum =  number % 10;
        for (int i = 0; i < 4; i++){
            number /= 10;
            int nextDigit = number % 10;
            sum += nextDigit;
        }
        return sum;
    }

    public static int calculateTheMultipleOfDigits(int number){
        int multiple =  number % 10;
        for (int i = 0; i < 4; i++){
            number /= 10;
            int nextDigit = number % 10;
            multiple *= nextDigit;
        }
        return multiple;
    }
}

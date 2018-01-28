package com.company;

public class ArithmeticOperationsWorker {

    public static double calculateTheArithmeticMean(int number) {
        int sum = number % 10;
        for (int i = 0; i < 5; i++) {
            number /= 10;
            int nextDigit = number % 10;
            sum += nextDigit;
        }
        return (double) sum / 6.0;
    }

    public static double calculateTheGeometricMean(int number){
        int multiple =  number % 10;
        for (int i = 0; i < 5; i++){
            number /= 10;
            int nextDigit = number % 10;
            multiple *= nextDigit;
        }
        return Math.pow(multiple, 1.0/6);
    }
}



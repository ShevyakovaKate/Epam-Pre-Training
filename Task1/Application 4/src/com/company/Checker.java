package com.company;

public class Checker {

    public static boolean IsIncreasing(int number){
        for (int i = 0; i < 3; i++){
            int a = number % 10;
            number = number / 10;
            int b = number % 10;
            if (a <= b){
                return false;
            }
        }
        return true;
    }
}
package com.company;

public class Reverser {

    public static int reverse(int number){
        int reverseNumber = 0;
        for (int i = 0; i < 7; i++){
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number = number / 10;
        }
        return reverseNumber;
    }
}
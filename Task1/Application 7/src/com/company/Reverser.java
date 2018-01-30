package com.company;

public class Reverser {

    public static int reverse(int number){
        int reverseNumber = number % 10;
        reverseNumber = (reverseNumber * 10) + ((number / 10) % 10);
        reverseNumber = (reverseNumber * 10) + ((number / 100) % 10);
        reverseNumber = (reverseNumber * 10) + ((number / 1000) % 10);
        reverseNumber = (reverseNumber * 10) + ((number / 10000) % 10);
        reverseNumber = (reverseNumber * 10) + ((number / 100000) % 10);
        reverseNumber = (reverseNumber * 10) + ((number / 1000000) % 10);
        return reverseNumber;
    }
}
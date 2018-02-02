package com.company;

public class Checker {

    public static boolean isIncreasing(int number) {
        int a = number % 10;
        int b = (number / 10) % 10;
        int c = (number / 100) % 10;
        int d = (number / 1000) % 10;
        return (a > b && b > c && c > d);
    }
}
package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 6;
        int b = 16;
        System.out.println(a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}


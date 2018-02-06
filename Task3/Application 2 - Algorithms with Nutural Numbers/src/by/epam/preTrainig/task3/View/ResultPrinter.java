package by.epam.preTrainig.task3.View;

public class ResultPrinter {

    public static void printMaxDigit(int maxDigit) {
        System.out.println("Max digit of number is " + maxDigit);
    }

    public static void printIsPalindrome(boolean isPalindrome) {
        String message = isPalindrome ? "The number is palindrome" : "The number is not palindrome";
        System.out.println(message);
    }

    public static void printIsPrime(boolean isPrime) {
        String message = isPrime ? "The number is prime" : "The number is not prime";
        System.out.println(message);
    }

    public static void printPrimeDivisors(String divisors) {
        System.out.println("The prime divisors of number are " + divisors);
    }

    public static void printGCD(int gcd) {
        System.out.println("The greatest common divisor of numbers is " + gcd);
    }

    public static void printLCM(int lcm) {
        System.out.println("The least common multiple of number is " + lcm);
    }

    public static void printNumberOfDifferentDigits(int number) {
        System.out.println("The number of different digits is " + number);
    }

    public static void printNotValidNumber(){
        System.out.println("The number is not natural");
    }


}

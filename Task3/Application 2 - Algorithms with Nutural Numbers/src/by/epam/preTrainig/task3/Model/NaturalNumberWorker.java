package by.epam.preTrainig.task3.Model;

public class NaturalNumberWorker {

    public static int findMaxDigit(int number) {
        int maxDigit = 0;
        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
            }
            number = number / 10;
        }
        return maxDigit;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    private static int reverse(int number) {
        int reverseNumber = 0;
        while (number > 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;
        }
        return reverseNumber;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String getPrimeDivisors(int number) {
        StringBuilder divisors = new StringBuilder();
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && isPrime(i)) {
                divisors.append(i);
                divisors.append(" ");
            }
        }
        return divisors.toString();
    }

    /** Euclidean algorithm*/
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static int getNumberOfDifferentDigits(int number) {
        String differentDigits = "";
        String digit;
        while(number > 0) {
            digit = String.valueOf(number % 10);
            if (!differentDigits.contains(digit)) {
                differentDigits += digit;
            }
            number /= 10;
        }
        return differentDigits.length();
    }

}

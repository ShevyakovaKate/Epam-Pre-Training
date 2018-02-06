package by.epam.preTrainig.task3.Model;

public class NumberWorker {

    public static boolean isPerfectNumber(int number) {
        int sumOfDividers = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDividers += i;
            }
        }
        return number == sumOfDividers;
    }
}

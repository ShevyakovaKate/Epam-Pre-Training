package by.epam.preTraining.task4.model;

public class FibonacciWorker {

    public static int findFibonacciRecursion(int number) {
        if (number == 1) {
            return 0;
        }
        if (number == 2) {
            return 1;
        }
        if (number > 2) {
            return findFibonacciRecursion(number - 1) + findFibonacciRecursion(number - 2);
        }
        return -1;
    }

    public static int findFibonacciIteration(int number) {
        int result = -1;
        if (number == 1) {
            result = 0;
        }
        if (number == 2) {
            result = 1;
        }
        if (number > 2) {
            int fibonacciFirst = 0;
            int fibonacciSecond = 1;
            for (int i = 2; i < number; i++) {
                result = fibonacciFirst + fibonacciSecond;
                fibonacciFirst = fibonacciSecond;
                fibonacciSecond = result;
            }
        }
        return result;
    }

}

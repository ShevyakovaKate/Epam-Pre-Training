package by.epam.preTrainig.task3.View;

public class ResultPrinter {

    public static void printIsPerfect(boolean isPerfect) {
        String message = isPerfect ? "The number is perfect." : "The number is not perfect.";
        System.out.println(message);
    }

    public static void printNotValidNumber() {
        System.out.println("The number is not natural.");
    }
}

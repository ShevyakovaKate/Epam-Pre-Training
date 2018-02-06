package by.epam.preTraining.task3.view;

public class ResearchPrinter {

    public static void printResult(int headNumber, int numberOfTossing) {
        System.out.println("The number of head side is " + headNumber
                + ". The number of tail side is " + (numberOfTossing - headNumber) + ".");
    }
}

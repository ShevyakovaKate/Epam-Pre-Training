package by.epam.preTraining.task3.controller;

import by.epam.preTraining.task3.model.CoinResearcher;
import by.epam.preTraining.task3.view.ResearchPrinter;

public class Main {
    public static void main(String[] args) {
        int numberOfTossing = 1000;
        ResearchPrinter.printResult(CoinResearcher.countNumberOfHead(numberOfTossing), numberOfTossing);
    }
}

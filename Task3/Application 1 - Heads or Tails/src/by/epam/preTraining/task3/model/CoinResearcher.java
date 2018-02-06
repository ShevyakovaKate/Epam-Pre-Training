package by.epam.preTraining.task3.model;

import java.util.Random;

public class CoinResearcher {

    public static int countNumberOfHead(int numberOfTosses) {
        int headSideNumber = 0;
        Random random = new Random();
        for (int i = 0; i < numberOfTosses; i++) {
            if (random.nextBoolean()) {
                headSideNumber++;
            }
        }
        return headSideNumber;
    }
}
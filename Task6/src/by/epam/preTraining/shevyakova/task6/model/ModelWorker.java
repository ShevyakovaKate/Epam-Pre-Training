package by.epam.preTraining.shevyakova.task6.model;

import by.epam.preTraining.shevyakova.task6.containers.StackArrayStaticContainer;
import by.epam.preTraining.shevyakova.task6.exceptions.CrowdedStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;

public class ModelWorker {

    public static boolean isPalindrome(String string) throws CrowdedStackException,EmptyContainerException {
        StackArrayStaticContainer<Character> stackString = new StackArrayStaticContainer<>(string.length());
        for (int i = 0; i < stackString.size(); i--) {
            stackString.push(string.charAt(i));
        }
        for (int i = 0; i < stackString.size(); i++) {
            if(stackString.pop() != string.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

package by.epam.preTraining.shevyakova.task6.model;

import by.epam.preTraining.shevyakova.task6.containers.stack.StackListStaticContainer;
import by.epam.preTraining.shevyakova.task6.exceptions.CrowdedStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;

public class ModelWorker {

    public static boolean isPalindrome(String string) throws CrowdedStackException,EmptyContainerException {
        int length = string.length();
        StackListStaticContainer<Character> stackString = new StackListStaticContainer<>(length);
        for (int i = 0; i < length; i++) {
            stackString.push(string.charAt(i));
        }
        for (int i = 0; i < length; i++) {
            if ((char) stackString.pop() != string.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

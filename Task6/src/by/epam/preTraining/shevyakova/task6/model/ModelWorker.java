package by.epam.preTraining.shevyakova.task6.model;

import by.epam.preTraining.shevyakova.task6.containers.stack.StackArrayDynamicContainer;
import by.epam.preTraining.shevyakova.task6.containers.stack.StackListStaticContainer;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyElementException;
import by.epam.preTraining.shevyakova.task6.exceptions.FullStackException;
import by.epam.preTraining.shevyakova.task6.exceptions.EmptyContainerException;
import by.epam.preTraining.shevyakova.task6.exceptions.IllegalIndexException;

public class ModelWorker {

    public static boolean isPalindrome(String string) throws FullStackException, EmptyContainerException, IllegalIndexException, EmptyElementException {
        int length = string.length();
        StackArrayDynamicContainer<Character> stackString = new StackArrayDynamicContainer<Character>();
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

package by.epam.preTrainig.shevyakova.task7.controller;

import by.epam.preTrainig.shevyakova.task7.model.container.BinaryTree;
import by.epam.preTrainig.shevyakova.task7.model.exceptions.NoSuchValueException;
import by.epam.preTrainig.shevyakova.task7.view.ResultPrinter;

public class Main {

    public static void main(String[] args) {
        try {
            BinaryTree<Integer> tree = new BinaryTree<>();
            tree.add(6);
            tree.add(4);
            tree.add(8);
            tree.add(3);
            tree.add(5);
            tree.add(7);
            tree.add(9);
            ResultPrinter.print("Size of  tree: " + tree.size());
            ResultPrinter.print("Post-order: " + tree.traversePostOrder(tree.getHead(),  new StringBuilder()));
            ResultPrinter.print("In-order: " + tree.traverseInOrder(tree.getHead(),  new StringBuilder()));
            ResultPrinter.print("Pre-order: " + tree.traversePreOrder(tree.getHead(), new StringBuilder()));
            ResultPrinter.print("Is contains 5: " + tree.contains(5));
            tree.remove(5);
            ResultPrinter.print("Pre-order after deleting 5: " + tree.traversePreOrder(tree.getHead(), new StringBuilder()));
            ResultPrinter.print("Is contains 5 after deleting: " + tree.contains(5));
            tree.remove(4);
            ResultPrinter.print("Pre-order after deleting 4: " + tree.traversePreOrder(tree.getHead(), new StringBuilder()));
            tree.remove(8);
            ResultPrinter.print("Pre-order after deleting 8: " + tree.traversePreOrder(tree.getHead(), new StringBuilder()));
            tree.clear();
            ResultPrinter.print("Size of  tree after clearing: " + tree.size());
        } catch (NoSuchValueException e) {
            e.printStackTrace();
        }
    }
}

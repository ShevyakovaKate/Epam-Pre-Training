package by.epam.preTrainig.shevyakova.task7.model.container;

import by.epam.preTrainig.shevyakova.task7.model.exceptions.NoSuchValueException;

import javax.swing.*;

public class BinaryTree<T extends Comparable> {
    Node head;
    int nodeCount;

    class Node<T extends Comparable> {
        Node left;
        Node right;
        T value;

        public Node(T value) {
            this.value = value;
            left = null;
            right = null;
        }

        public int compareTo(Object o) {
            return value.compareTo(o);
        }
    }

    public Node getHead() {
        return head;
    }

    public void add(T value) {
        if (head == null) {
            head = new Node(value);
        } else {
            addRecursive(head, value);
        }
        nodeCount++;
    }

    private void addRecursive(Node node, T value) {
        if (value.compareTo(node.value) < 0) {
            if (node.left == null) {
                node.left = new Node(value);
            } else {
                // в противном случае повторяем для левого поддерева.
                addRecursive(node.left, value);
            }
        } else {
            if (node.right == null) {
                node.right = new Node(value);
            } else {
                addRecursive(node.right, value);
            }
        }
    }

    public boolean contains(T value) {
        return containsRecursive(head, value);
    }

    private boolean containsRecursive(Node current, T value) {
        if(current == null) {
            return false;
        }
        int result = value.compareTo(current.value);
        if (result == 0) {
            return true;
        }
        return result < 0 ? containsRecursive(current.left, value) : containsRecursive(current.right, value);
    }

    public void remove(T value) throws NoSuchValueException {
        removeRecursive(head, value);
    }

    private Node removeRecursive(Node current, T value) throws NoSuchValueException {
        if (current == null) {
           throw new NoSuchValueException("Value dosn't exist in the tree.");
        }

        if (value == current.value) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }
            T smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = removeRecursive(current.right, smallestValue);
            return current;
        }
        if (value.compareTo(current.value) < 0) {
            current.left = removeRecursive(current.left, value);
            return current;
        }
        current.right = removeRecursive(current.right, value);
        return current;
    }

    private T findSmallestValue(Node root) {
        return root.left == null ? (T) root.value : findSmallestValue(root.left);
    }

    public void clear() {
        head = null;
        nodeCount = 0;
    }

    public int size() {
        return nodeCount;
    }

    public String traversePreOrder(Node node, StringBuilder string) {
        if (node != null) {
            string.append(node.value);
            traversePreOrder(node.left, string);
            traversePreOrder(node.right, string);
        }
        return string.toString();
    }

    public String traverseInOrder(Node node, StringBuilder string) {
        if (node != null) {
            traverseInOrder(node.left, string);
            string.append(node.value);
            traverseInOrder(node.right, string);
        }
        return string.toString();
    }

    public String traversePostOrder(Node node, StringBuilder string) {
        if (node != null) {
            traversePostOrder(node.left, string);
            traversePostOrder(node.right, string);
            string.append(node.value);
        }
        return string.toString();
    }
}

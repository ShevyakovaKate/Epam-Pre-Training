package by.epam.preTraining.shevyakova.task6.containers.list;

import by.epam.preTraining.shevyakova.task6.exceptions.EmptyElementException;
import by.epam.preTraining.shevyakova.task6.exceptions.IllegalIndexException;

public class List<T> {
    private Node firstNode;
    private Node lastNode;
    private int nodeCount;

    class Node {
        private T value;
        private Node next;

        Node(T value) {
            this.value = value;
            this.next = null;
        }

        T getValue() {
            return value;
        }
    }

    public List() {
        this.firstNode = null;
        this.lastNode = null;
        this.nodeCount = 0;
    }

    public List(int size) {
        this.firstNode = null;
        this.lastNode = null;
        this.nodeCount = 0;
    }

    public Node get(int index) throws IllegalIndexException {
        Node currentNode = firstNode;
        if (index < 0 || index > size()) {
            throw new IllegalIndexException();
        }
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public void add(T element) throws EmptyElementException {
        if (element == null) {
            throw new EmptyElementException("Element is empty.");
        }
        if (isEmpty()) {
            firstNode = new Node(element);
            lastNode = firstNode;
        } else {
            Node previousElement = lastNode;
            lastNode = new Node(element);
            previousElement.next = lastNode;
        }
        nodeCount++;
    }

    public void add(T element, int index) throws EmptyElementException, IllegalIndexException {
        if (element == null) {
            throw new EmptyElementException("Element is empty.");
        }
        if (index < 0 || index > size()) {
            throw new IllegalIndexException();
        }
        if (index == 0) {
            firstNode = new Node(element);
            firstNode.next = get(index);
        } else {
            Node newElement = new Node(element);
            newElement.next = get(index);
            Node previous = get(index - 1);
            previous.next = newElement;
        }
    }

    public int size() {
        return nodeCount;
    }

    public boolean isEmpty() {
        return nodeCount == 0;
    }

    public void clear() throws IllegalIndexException {
        for (int i = 0; i < nodeCount; i++) {
            remove(i);
        }
        nodeCount = 0;
    }

    public void remove(int index) throws IllegalIndexException {
        if(index < 0 || index > size()) {
            throw new IllegalIndexException();
        }
        if (index == 0) {
            Node temp = firstNode;
            firstNode = null;
            temp.next = firstNode;
        } else {
            Node previous = get(index - 1);
            Node deleting = get(index);
            previous.next = deleting.next;
        }
        nodeCount--;
    }
    @Override
    public String toString() {
        String string = "";
        if (firstNode != null) {
            Node currentNode = firstNode;
            while (currentNode != null) {
                string += "[" + currentNode.value.toString() + "]";
                currentNode = currentNode.next;
            }
        } else {
            string = "null";
        }
        return string;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        List other = (List) obj;
        if (this.nodeCount != other.nodeCount) {
            return false;
        }
        for (int i = 0; i < nodeCount; i++) {
            try {
                if (this.get(i) != other.get(i)) {
                    return false;
                }
            } catch (IllegalIndexException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        for (int i = 0; i < nodeCount; i++) {
            try {
                hash += hash * 31 + this.get(i).hashCode();
            } catch (IllegalIndexException e) {
                e.printStackTrace();
            }
        }
        return hash;
    }
}

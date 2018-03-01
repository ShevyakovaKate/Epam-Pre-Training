package by.epam.preTrainig.shevyakova.task7.model.container;

public class Node<T extends Comparable> {
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

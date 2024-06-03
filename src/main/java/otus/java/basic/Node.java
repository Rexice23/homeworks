package otus.java.basic;

class Node<T> {
    T value;
    Node<T> left;
    Node<T> right;

    Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
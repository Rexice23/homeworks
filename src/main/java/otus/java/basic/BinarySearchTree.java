package otus.java.basic;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> implements SearchTree<T> {
    private Node<T> root;

    public BinarySearchTree(List<T> sortedList) {
        this.root = sortedListTree(sortedList, 0, sortedList.size() - 1);
    }

    private Node<T> sortedListTree(List<T> list, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node<T> node = new Node<>(list.get(mid));
        node.left = sortedListTree(list, start, mid - 1);
        node.right = sortedListTree(list, mid + 1, end);
        return node;
    }

    @Override
    public T find(T element) {
        return findInTree(root, element);
    }

    private T findInTree(Node<T> node, T element) {
        if (node == null) return null;
        if (element.compareTo(node.value) == 0) return node.value;
        else if (element.compareTo(node.value) < 0) return findInTree(node.left, element);
        else return findInTree(node.right, element);
    }

    @Override
    public List<T> getSortedList() {
        List<T> sortedList = new ArrayList<>();
        inTraversalOrder(root, sortedList);
        return sortedList;
    }

    private void inTraversalOrder(Node<T> node, List<T> list) {
        if (node == null) return;
        inTraversalOrder(node.left, list);
        list.add(node.value);
        inTraversalOrder(node.right, list);
    }

}

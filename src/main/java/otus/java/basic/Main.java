package otus.java.basic;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> sortedList = List.of(1, 2, 3, 4, 5, 6, 7);
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(sortedList);

        System.out.println("Найти число 7: " + tree.find(7));
        System.out.println("Найти число 20: " + tree.find(20));
        System.out.println("Отсортированный список: " + tree.getSortedList());

    }

}

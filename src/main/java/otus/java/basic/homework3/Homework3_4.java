package otus.java.basic.homework3;

public class Homework3_4 {
    public static void main(String[] args) {
        int[][] array = {{-5, 40, 0}, {5, 20, 1}, {1, 10, 4}};
        System.out.println("Максимальный элемент массива: " + findMax(array));

    }

    public static int findMax(int array[][]) {
        int maxElement = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }
        }
        return maxElement;
    }
}

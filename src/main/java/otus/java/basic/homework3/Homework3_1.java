package otus.java.basic.homework3;

import java.sql.SQLOutput;

public class Homework3_1 {
    public static void main(String[] args) {
        int[][] array = {{-5, -10}, {3, 20}, {-10, -30}};
        System.out.println("Сумма положительных элементов в массиве = " + sumOfPositiveElements(array));

    }

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}

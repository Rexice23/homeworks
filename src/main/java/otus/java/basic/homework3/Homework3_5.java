package otus.java.basic.homework3;

public class Homework3_5 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {5, 1, 9}, {4, 4, 1}};
        System.out.println("Сумма элементов второй строки массива: " + sumSecondStringMassive(array));
    }

    public static int sumSecondStringMassive(int[][] array) {
        if (array.length < 2) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[1][i];
        }
        return sum;

    }
}



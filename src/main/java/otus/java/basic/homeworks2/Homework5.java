package otus.java.basic.homeworks2;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {
    int[] array = {1, 20, 13, 4, 5, 9, 5, 7};
    printSumLargestHalf(array);
    }
    public static void printSumLargestHalf(int[] array) {
        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        int length = array.length;

        for (int i = 0; i < length / 2; i++) {
            sumLeftHalf += array[i];
        }
        for (int i = length / 2; i < length; i++) {
            sumRightHalf += array[i];
        }
        System.out.println("Сумма правой части массива = " + sumRightHalf +
                "\nСумма левой части массива = " + sumLeftHalf);
        if (sumLeftHalf > sumRightHalf){
            System.out.println("Сумма элементов левой части массива больше.");
        } else if (sumLeftHalf < sumRightHalf){
            System.out.println("Cумма элементов правой части массива больше ");
        } else {
            System.out.println("Суммы обеих половин равны");
        }
    }

}

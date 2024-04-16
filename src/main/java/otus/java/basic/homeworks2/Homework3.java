package otus.java.basic.homeworks2;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        int[] array = new int[20];
        fillArray(15, array);
        System.out.println(Arrays.toString(array));
    }
    public static void fillArray(int number, int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
    }
}

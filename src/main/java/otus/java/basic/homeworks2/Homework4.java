package otus.java.basic.homeworks2;

import java.util.Arrays;

public class Homework4 {
    public static void main(String[] args) {
    int[] array = {1, 0, 5, 10, 15, 13, 10, 8};
    enlargeArrayElements(15, array);
        System.out.println(Arrays.toString(array));
    }
    public static void enlargeArrayElements(int number, int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] += number;
        }
    }
}

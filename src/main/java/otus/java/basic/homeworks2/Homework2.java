package otus.java.basic.homeworks2;

public class Homework2 {
    public static void main(String[] args) {
        int[] array = {2, 5, 9, 0, 8, 4, 7, 10, 2};

        printSumOfElementsWhichThanFive(array);
    }
    public static void printSumOfElementsWhichThanFive(int[] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5){
                sum += array[i];
            }
        }
        System.out.println("Сумма элементов в массиве которые больше 5 = " + sum);
    }
}

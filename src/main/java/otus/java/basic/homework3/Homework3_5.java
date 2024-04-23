package otus.java.basic.homework3;

public class Homework3_5 {
    public static void main(String[] args) {
        int [][] array = {{1,2,3}, {5,5,5}, {4,4,1}};
        System.out.println("Сумма элементов второй строки массива: " + sumSecondStringMassive(array));
    }
    public static int sumSecondStringMassive (int [][] array){
        if (array.length < 2){
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 1) {
                for (int j = 0; j < array[i].length; j++) {
                sum+= array[i][j];
                }
                return sum;
            }
        }
        return sum;
    }
}


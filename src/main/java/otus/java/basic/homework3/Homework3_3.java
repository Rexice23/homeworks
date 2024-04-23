package otus.java.basic.homework3;

public class Homework3_3 {
    public static void main(String[] args) {
        int[][] arrayZeroDiagonal = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        zeroOnDiagonal(arrayZeroDiagonal);
    }

    public static void zeroOnDiagonal(int[][] arrayZeroDiagonal) {
        for (int i = 0; i < 3; i++){
            arrayZeroDiagonal[i][i] = 0;
        }
        for (int i = 0; i < arrayZeroDiagonal.length; i++) {
            for (int j = 0; j < arrayZeroDiagonal[i].length; j++) {
                System.out.print(arrayZeroDiagonal[i][j] + " ");
           }
           System.out.println();
        }
    }
}

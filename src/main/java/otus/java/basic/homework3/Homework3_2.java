package otus.java.basic.homework3;

public class Homework3_2 {
    public static void main(String[] args) {
        drawSquareStars(4);
    }

    public static void drawSquareStars(int size) {
        char[][] squareStars = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                squareStars[i][j] = '*';
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(squareStars[i][j] + " ");
            }
            System.out.println();
        }
    }

}

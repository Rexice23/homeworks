package otus.java.basic.homework3;

public class Homework3_2 {
    public static void main(String[] args) {
        drawSquareStars(4);
    }

    public static void drawSquareStars(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

package otus.java.basic.homeworks.hw3;

public class Homework3 {
    public static void main(String[] args) {
        selectColor();
    }

    public static void selectColor() {
        int data = 1;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else if (data > 20) {
            System.out.println("Зеленый");
        }
    }
}


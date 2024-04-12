package otus.java.basic.homeworks.hw2;

//(2) Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c. Метод должен посчитать их сумму, и если она больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;

public class Homework2 {
    public static void main(String[] args) {
        checkSign(10, -100, -30);
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum <= 0) {
            System.out.println("Сумма отрицательнеая");
        }
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
    }
}

package otus.java.basic.homeworks.hw6;

import java.util.Scanner;

import static otus.java.basic.homeworks.hw1.Homework1.greetings;
import static otus.java.basic.homeworks.hw2.Homework2.checkSign;
import static otus.java.basic.homeworks.hw3.Homework3.selectColor;
import static otus.java.basic.homeworks.hw4.Homework4.compareNumbers;
import static otus.java.basic.homeworks.hw5.Homework5.addOrSubtractAndPrint;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        int currentNumber = scanner.nextInt();
        if (currentNumber == 1) {
            greetings();
        }
        if (currentNumber == 2) {
            checkSign(300, -100, -30);
        }
        if (currentNumber == 3) {
            selectColor();
        }
        if (currentNumber == 4) {
            compareNumbers();
        }
        if (currentNumber == 5) {
            addOrSubtractAndPrint();
        } else {
            System.out.println("Некорректное значение, введите число от 1 до 5");
        }
    }
}

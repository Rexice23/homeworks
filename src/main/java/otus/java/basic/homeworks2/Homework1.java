package otus.java.basic.homeworks2;

public class Homework1 {
    public static void main(String[] args) {
    printStringNumberTimes(3, "Вывод строки");
    }
    public static void printStringNumberTimes(int number, String line){
        for (int i =0; i < number; i++) {
            System.out.println(line);
        }
    }
}



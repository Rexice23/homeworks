package otus.java.basic.homeworks.hw5;

public class Homework5 {
    public static void main(String[] args) {
        addOrSubtractAndPrint(5,10,true);
    }
public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment){
        if (increment){
            System.out.println(initValue + delta);
        } else{
            System.out.println(initValue - delta);
        }
    }
}

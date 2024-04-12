package otus.java.basic.homeworks.hw5;

public class Homework5 {
    public static void main(String[] args) {
        addOrSubtractAndPrint();
    }
public static void addOrSubtractAndPrint(){
        int initValue = 5;
        int delta = 10;
        boolean increment = true;
        if (increment == true){
            System.out.println(initValue + delta);
        } else{
            System.out.println(initValue - delta);
        }
    }
}

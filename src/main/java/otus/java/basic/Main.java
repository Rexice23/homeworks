package otus.java.basic;

import otus.java.basic.animals.Animal;
import otus.java.basic.animals.Cat;
import otus.java.basic.animals.Dog;
import otus.java.basic.animals.Horse;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Мурзик", 5, 5, 50),
                new Dog("Шарик", 5, 5, 50),
                new Horse("Гретта", 5, 5, 50),
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(1);
            animals[i].swim(1);
            animals[i].info();
        }
    }
}

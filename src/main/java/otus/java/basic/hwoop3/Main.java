package otus.java.basic.hwoop3;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(50);
        System.out.println(plate);
        Cat[] cat = {new Cat("Барсик", 10),
                new Cat("Персик", 3),
                new Cat("Бантик", 2)};

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);

        }
        for (int i = 0; i < cat.length; i++) {
            if (cat[i].isHungry()) {
                System.out.println(cat[i].getName() + " " + "голоден");
            } else {
                System.out.println(cat[i].getName() + " " + "сыт");
            }
        }
        System.out.println(plate);
        plate.addFood(70);
        System.out.println(plate);
    }
}


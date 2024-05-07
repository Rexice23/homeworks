package otus.java.basic.animals;

public class Dog extends Animal {
    public Dog(String name, double speedRun, double speedSwim, int stamina) {
        super(name, speedRun, speedSwim, stamina);
    }

    @Override
    public int swim(int distance) {
        if (distance > 0 && this.stamina >= distance * 2) {
            // дистанцию умножаем на 2, собака тратит 2 выносливости на 1 метр плавания
            System.out.println(name + " " + "плывет расстояние в: " + distance + "м");
            this.stamina -= distance * 2;
            System.out.println("Потраченное время: " + distance / this.speedRun + "с");
            return 1; // метка успешного совершение действия
        } else if (distance * 2 > this.stamina) {
            this.stamina = 0;
            System.out.println(name + " " + "плывет расстояние в: " + distance + "м");
            System.out.println("Выносливости не хватило, животное" + name + "устало");
            return -1; // метка неуспешного совершение действия
        } else {
            System.out.println("Дистанция не может быть отрицательной");
            return 0; // отрицательный результат
        }

    }
}




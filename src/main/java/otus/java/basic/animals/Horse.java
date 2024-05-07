package otus.java.basic.animals;

public class Horse extends Animal{
    public Horse(String name, double speedRun, double speedSwim, int stamina) {
        super(name, speedRun, speedSwim, stamina);
    }
    @Override
    public int swim(int distance){
        if (distance > 0 && this.stamina >= distance * 4){
            // дистанцию умножаем на 4, лошадь тратит 4 выносливости на 1 метр плавания
            System.out.println(name + "плывет расстояние в: " + distance + "м");
            this.stamina -= distance * 4;
            System.out.println("Потраченное время: " + distance / this.speedRun + "с");
            return 1; // метка успешного совершение действия
        } else if (distance * 4 > this.stamina){
            this.stamina = 0;
            System.out.println(name + "плывет расстояние в: " + distance + "м");
            System.out.println("Выносливости не хватило, животное" + name + "устало");
            return -1; // метка неуспешного совершение действия
        } else {
            System.out.println("Дистанция не может быть отрицательной");
            return 0; // отрицательный результат
        }

    }
}


package otus.java.basic.animals;

public abstract class Animal {
    String name;
    double speedRun; // м/с
    double speedSwim; // м/с
    int stamina; // единицы

    public Animal(String name, double speedRun, double speedSwim, int stamina) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.stamina = stamina;
    }

    public void info(){
        System.out.println("Кличка: " + name);
        System.out.println("Скорость бега: " + speedRun + " " + "м/с");
        System.out.println("Скорость плавания: " + speedSwim + " " + "м/с");
        System.out.println("Выносливость: " + stamina);
    }
    public int run(int distance){
        if (distance > 0 && this.stamina >= distance){
            System.out.println(name + " " + "бежит расстояние в: " + distance + "м");
            this.stamina -= distance;
            System.out.println("Потраченное время: " + distance / this.speedRun + "с");
            return 1; // метка успешного совершение действия
        } else if (distance > this.stamina){
            System.out.println(name + " " + "бежит расстояние в: " + distance + "м");
            System.out.println("Выносливости не хватило, животное" + name + "устало");
            return -1; // метка неуспешного совершение действия
        } else {
            System.out.println("Дистанция не может быть отрицательной");
            return 0; // отрицательный результат
        }
    }
    public abstract int swim(int distance);
}

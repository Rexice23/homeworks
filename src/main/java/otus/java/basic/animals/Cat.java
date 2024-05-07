package otus.java.basic.animals;

public class Cat extends Animal {
    public Cat(String name, double speedRun, double speedSwim, int stamina) {
        super(name, speedRun, speedSwim, stamina);
    }
    @Override
    public int swim(int distance){
        System.out.println("Коты не умеют плавать");
        return 0; // метка неуспешного результата
    }
}

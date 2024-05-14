package otus.java.basic.hwoop3;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.isHungry = true;
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }

    public void eat (Plate plate){
        if (plate.decreaseFood(appetite)){
            isHungry = false;
            System.out.println(name + " " + "поел");
        } else {
            System.out.println(name + " " + "не хватило еды");
        }
    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return isHungry;
    }
}

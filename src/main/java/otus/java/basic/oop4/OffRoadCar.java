package otus.java.basic.oop4;

public class OffRoadCar implements Transport {

    private int fuel;

    public OffRoadCar(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public String getType() {
        return "внедорожник";
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (this.fuel < 0) {
            System.out.println("Топливо не может быть отрицательным");
        }
        if (this.fuel >= distance) {
            this.fuel -= distance;
            System.out.println("Внедорожник проехал дистанцию в" + " " + distance + " км" + " по " + terrain.getName());
            return true;
        } else {
            System.out.println("Топлива не хватило");
            return false;
        }
    }
}


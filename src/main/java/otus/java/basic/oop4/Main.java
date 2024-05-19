package otus.java.basic.oop4;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Ваня");
        Bicycle bicycle = new Bicycle();
        Car car = new Car(60);
        Horse horse = new Horse(10);
        OffRoadCar offRoadCar = new OffRoadCar(100);

        human.useTransport(bicycle);
        human.move(10, Terrain.SWAMP);
        human.move(10, Terrain.PLAIN);
        human.move(50, Terrain.DENSE_FOREST);
        human.leaveTransport();

        human.useTransport(car);
        human.move(10, Terrain.SWAMP);
        human.move(10, Terrain.PLAIN);
        human.move(10, Terrain.DENSE_FOREST);
        human.leaveTransport();

        human.useTransport(horse);
        human.move(10, Terrain.SWAMP);
        human.move(10, Terrain.PLAIN);
        human.move(10, Terrain.DENSE_FOREST);
        human.leaveTransport();

        human.useTransport(offRoadCar);
        human.move(10, Terrain.SWAMP);
        human.move(10, Terrain.PLAIN);
        human.move(10, Terrain.DENSE_FOREST);
        human.leaveTransport();
    }
}

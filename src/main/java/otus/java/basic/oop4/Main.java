package otus.java.basic.oop4;

public class Main {
    public static void main(String[] args) {
    Human human = new Human ("Ваня");
    Bicycle bicycle = new Bicycle(10);
    Car car = new Car(60);
    Horse horse = new Horse(100);
    OffRoadCar offRoadCar = new OffRoadCar(50);


    human.getOnTransport(bicycle);
    human.move(10, Terrain.SWAMP);
    human.move(10, Terrain.PLAIN);
    human.move(50, Terrain.DENSE_FOREST);
    human.getOffTransport();

    human.getOnTransport(car);
    human.move(10, Terrain.SWAMP);
    human.move(10, Terrain.PLAIN);
    human.move(10, Terrain.DENSE_FOREST);
    human.getOffTransport();

    human.getOnTransport(horse);
    human.move(10, Terrain.SWAMP);
    human.move(10, Terrain.PLAIN);
    human.move(10, Terrain.DENSE_FOREST);
    human.getOffTransport();

    human.getOnTransport(offRoadCar);
    human.move(10, Terrain.SWAMP);
    human.move(10, Terrain.PLAIN);
    human.move(10, Terrain.DENSE_FOREST);
    human.getOffTransport();
    }
}

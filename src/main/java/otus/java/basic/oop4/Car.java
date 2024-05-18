package otus.java.basic.oop4;

import java.sql.SQLOutput;

public class Car implements Transport {

    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }



    @Override
    public String getType() {
        return "машина";
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (terrain == Terrain.DENSE_FOREST || terrain ==  Terrain.SWAMP){
            System.out.println("Машина не может ехать по " + terrain.getName());
            return false;
        }
        if (this.fuel < 0 ){
            System.out.println("Топливо не может быть отрицательным");
        }
        if (this.fuel >= distance) {
            this.fuel -= distance;
            System.out.println("Машина проехала дистанцию в" + " " + distance  + " км" + " по " + terrain.getName());
            return true;
        } else {
            System.out.println("Топлива не хватило");
            return false;
        }
    }
}

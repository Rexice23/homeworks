package otus.java.basic.oop4;

public class Bicycle implements Transport {

    @Override
    public String getType() {
        return "велосипед";
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (terrain == Terrain.SWAMP) {
            System.out.println("Велосипед не может ехать по болоту");
            return false;
        } else {
            System.out.println("Велосипед проехал дистанцию в" + " " + distance + " км" + " по " + terrain.getName());
            return true;
        }
    }
}


package otus.java.basic.oop4;

public class Bicycle implements Transport{

    private int riderStrength;

    public Bicycle(int riderStrength) {
        this.riderStrength = riderStrength;
    }

    @Override
    public String getType() {
        return "велосипед";
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (terrain == Terrain.SWAMP){
            System.out.println("Велосипед не может ехать по болоту");
            return false;
        }
        if (riderStrength < 0 ) {
            System.out.println("Движение невозможно при отрицательной силе выносливости");
            return false;
        }
        if (this.riderStrength >= distance) {
            this.riderStrength -= distance;
            System.out.println("Велосипед проехал дистанцию в" + " " + distance  + " км" + " по " + terrain.getName());
            return true;
        } else {
            System.out.println("Сил не хватило");
            return false;
        }
    }
}

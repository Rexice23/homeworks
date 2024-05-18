package otus.java.basic.oop4;

public class Horse implements Transport {

    private int strength;

    public Horse(int strength) {
        this.strength = strength;
    }

    @Override
    public String getType() {
        return "лошадь";
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (terrain == Terrain.SWAMP){
            System.out.println("Лошадь не может скакать по болоту");
            return false;
        }
        if (strength < 0 ) {
            System.out.println("Движение невозможно при отрицательной силе выносливости");
            return false;
        }
        if (this.strength >= distance) {
            this.strength -= distance;
            System.out.println("Лошадь проскакала дистанцию в" + " " + distance  + " км" + " по " + terrain.getName());
            return true;
        } else {
            System.out.println("Сил не хватило");
            return false;
        }
    }
}

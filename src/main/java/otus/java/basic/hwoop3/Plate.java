package otus.java.basic.hwoop3;

public class Plate {
    private int maxFood;

    private int currentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }
    public void addFood (int amountFood){
        if (currentFood + amountFood <= maxFood){
            currentFood += amountFood;
        } else {
            currentFood = maxFood;
        }
    }
    public boolean decreaseFood (int amountFood){
        if (currentFood - amountFood >= 0){
            currentFood -= amountFood;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "maxFood=" + maxFood +
                ", currentFood=" + currentFood +
                '}';
    }
}

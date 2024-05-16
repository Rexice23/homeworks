package otus.java.basic.hwoop3;

public class Plate {
    private int maxFood;

    private int currentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;

    }
    public void addFood (int amount){
        if (amount >= 0 && currentFood + amount <= maxFood){
            currentFood += amount;
        } else {
            System.out.println("Нельзя положитель отрицательное количество еды");
            currentFood = maxFood;
        }
    }
    public boolean decreaseFood (int amount){
        if (amount >= 0 && currentFood - amount >= 0){
            currentFood -= amount;
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

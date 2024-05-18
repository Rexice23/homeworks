package otus.java.basic.oop4;

public class Human {
    private String name;

    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
    }
    public void setCurrentTransport(Transport currentTransport) {
        this.currentTransport = currentTransport;
    }
    public void getOnTransport (Transport transport) {
        if (this.currentTransport == null) {
            this.currentTransport = transport;
            System.out.println(this.name + " использует " + transport.getType());
        } else {
            System.out.println(this.name + "уже использует транспорт");
        }
    }
    public void getOffTransport(){
        if (this.currentTransport != null) {
            System.out.println(this.name + " покинул транспорт " + this.currentTransport.getType());
            this.currentTransport = null;
        } else {
            System.out.println(this.name + " уже не использует транспорт");
        }
    }
    public boolean move (int distance, Terrain terrain){
        if (distance < 0) {
            System.out.println("Дистанция не может быть отрицательной");
            return false;
        }
        if (this.currentTransport != null){
            currentTransport.move(distance, terrain);
            return true;
        } else {
            System.out.println("Человек идет пешком");
            return true;
        }
    }
}

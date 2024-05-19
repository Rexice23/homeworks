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

    public void useTransport(Transport transport) {
        if (this.currentTransport == null) {
            this.currentTransport = transport;
            System.out.println(this.name + " использует: " + transport.getType());
        } else {
            //System.out.println(this.name + "уже использует транспорт");
            System.out.println("Чтобы использовать " + transport.getType() + " покиньте текущий транспорт: " + currentTransport.getType());
        }
    }

    public void leaveTransport() {
        if (this.currentTransport != null) {
            System.out.println(this.name + " покинул транспорт: " + this.currentTransport.getType());
            this.currentTransport = null;
        } else {
            System.out.println(this.name + " уже не использует транспорт: " + currentTransport.getType());
        }
    }

    public boolean move(int distance, Terrain terrain) {
        if (distance < 0) {
            throw new IllegalStateException("Дистанция не может быть отрицательной");
        }
        if (this.currentTransport != null) {
            currentTransport.move(distance, terrain);
            return true;
        } else {
            System.out.println("Человек идет пешком");
            return true;
        }
    }
}

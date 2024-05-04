package otus.java.basic.oophomework1;

public class Box {
    private final int height; // высота коробки
    private final int width; // ширина коробки
    private String color; // цвет коробки
    private boolean wasOpen; // состояние коробки открыта/закрыта
    private String item; // предмет для коробки

    // конструктор для класса Box
    public Box(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
        this.item = null;
        wasOpen = false;
    }

    //метод для открытия коробки
    public void openBox() {
        if (!wasOpen) {
            wasOpen = true;
            System.out.println("Вы открыли коробку");
        } else {
            System.out.println("Вы уже открыли коробку");
        }
    }

    // метод для закрытия коробки
    public void closeBox() {
        if (wasOpen) {
            wasOpen = false;
            System.out.println("Вы закрыли коробку");
        } else {
            System.out.println("Вы уже закрыли коробку");
        }
    }

    // метод для перекрашивания коробки
    public void recolourBox(String newColor) {
        System.out.println("Вы перекрасили коробку в " + newColor + " " + "цвет");
        color = newColor;
    }

    // метод для складывания предмета в коробку
    public void putItemInBox(String newItem) {
        if (!wasOpen) {
            System.out.println("Нельзя положить предмет, коробка закрыта");
        } else if (item != null) {
            System.out.println("Нельзя положить предмет, в коробке уже есть другой предмет");
        } else {
            item = newItem;
            System.out.println("В коробку добавлен предмет: " + item);
        }
    }

    // метод для вытаскивания предмета из коробки
    public void dropItemInBox() {
        if (!wasOpen) {
            System.out.println("Нельзя удалить предмет, коробка закрыта");
        } else if (item == null) {
            System.out.println("Нельзя вытащить пердмет, в коробке пусто");
        } else {
            System.out.println("Из коробки вытащен предмет: " + " " + item);
            item = null;
        }
    }

    // метод для печати информации о коробке
    public void printBoxInfo() {
        System.out.println("___________________________");
        System.out.println("Высота коробки: " + height);
        System.out.println("Ширина коробки: " + width);
        System.out.println("Цвет коробки: " + color);
        if (!wasOpen) {
            System.out.println("Коробка закрыта");
        } else {
            System.out.println("Коробка открыта");
        }
        System.out.println("В коробке лежит: " + item);
        System.out.println("__________________________");


    }

}

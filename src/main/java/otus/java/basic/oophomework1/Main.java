package otus.java.basic.oophomework1;

public class Main {
    public static void main(String[] args) {
        oopBox();
        oopUser();
    }

    private static void oopBox() {
        Box box = new Box(10, 20, "Зеленый");
        box.openBox();
        box.printBoxInfo();
        box.putItemInBox("Книга");
        box.printBoxInfo();
        box.recolourBox("Синий");
        box.printBoxInfo();
        box.dropItemInBox();
        box.printBoxInfo();
    }

    private static void oopUser() {
        // создаем массив пользователей
        User[] users = {
                new User("Иванов", "Иван", "Иванович", 2000, "ivan@example.com"),
                new User("Петров", "Петр", "Петрович", 1975, "petr@example.com"),
                new User("Сидоров", "Сергей", "Сергеевич", 1990, "sergey@example.com"),
                new User("Смирнов", "Степан", "Степанович", 1960, "stepan@example.com"),
                new User("Васильев", "Василий", "Васильевич", 1950, "vasiliy@example.com"),
                new User("Николаев", "Николай", "Николаевич", 1945, "nikolay@example.com"),
                new User("Алексеев", "Алексей", "Алексеевич", 1935, "aleksey@example.com"),
                new User("Михайлов", "Михаил", "Михайлович", 1925, "mikhail@example.com"),
                new User("Новиков", "Никита", "Новикович", 1915, "nikita@example.com"),
                new User("Федоров", "Федор", "Федорович", 1905, "fedor@example.com"),
        };

        for (int i = 0; i < users.length; i++) {
            if (users[i].getBirthYear() <= 1984) {
                users[i].printInfo();
            }
        }
    }
}

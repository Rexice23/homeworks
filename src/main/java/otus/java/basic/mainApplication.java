package otus.java.basic;

public class mainApplication {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Сергей", "53-52-92");
        phoneBook.add("Иван", "53-22-92");
        phoneBook.add("Михаил", "53-92-22");

        System.out.println(phoneBook);

        System.out.println("Номер(а) телефона контакта Сергей: " + phoneBook.find("Сергей"));
        System.out.println("Номер 53-52-92 содержится в телефонной книге: "
                + phoneBook.containsPhoneNumber("53-52-92"));
        System.out.println("Номер 52-92-93 содержится в телефонной книге: "
                + phoneBook.containsPhoneNumber("53-92-93"));
    }
}

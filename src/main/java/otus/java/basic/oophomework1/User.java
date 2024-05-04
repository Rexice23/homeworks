package otus.java.basic.oophomework1;

public class User{
    // фамилия
    private String lastName;
    // имя
    private String firstName;
    // отчество
    private String middleName;
    // эл-почта
    private String email;
    // год рождения
    private int birthYear;



    // Геттеры для полей User
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getMiddleName(){
        return middleName;
    }
    public String getEmail(){
        return email;
    }
    public int getBirthYear(){
        return birthYear;
    }
    // cеттеры для User
    public void setBirthYear(int birthYear){
            this.birthYear = birthYear;
    }
    public void  setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public User(String lastName, String firstName, String middleName, int birthYear, String email){
    this.lastName = lastName;
    this.firstName = firstName;
    this.middleName = middleName;
    this.birthYear = birthYear;
    this.email = email;
    }

    public void printInfo(){
       String fio = lastName + " " + firstName + " " + middleName;
        System.out.println("_____________________________");
        System.out.println("ФИО: " + fio);
        System.out.println("Год рождения: " + birthYear);
        System.out.println("Почта: " + email);
    }
}

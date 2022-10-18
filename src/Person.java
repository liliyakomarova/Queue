import java.util.ArrayList;
public class Person {
    private String name;
    private String surname;
    private int amountOfTickets;
    public Person(String name, String surname, int amountOfTickets) {
        this.name = name;
        this.surname = surname;
        this.amountOfTickets = amountOfTickets;
    }
    public void setName(String Name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSurname(String Surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }
    public boolean isTickets() {
        if (amountOfTickets != 0) {
            amountOfTickets = amountOfTickets - 1;
            return true;
        } else {
            return false;
        }
    }
}
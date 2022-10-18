import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            Person s = queue.poll();
            if (s.isTickets()) {
                System.out.println(s.getName() + " " + s.getSurname() + " прокатился на аттракционе");
                queue.add(s);
            } else {
                System.out.println(s.getName() + " " + s.getSurname() + "," + " у вас нет билетов, купите другой, если хотите прокатиться");
            }
        }
    }
    public static List<Person> generateClients() {
        ArrayList<Person> clients = new ArrayList<>();
        clients.add(new Person("Ольга", "Бузова", 3));
        clients.add(new Person("Филипп", "Киркоров", 1));
        clients.add(new Person("Лолита", "Милявская", 2));
        clients.add(new Person("Николай", "Расторгуев", 5));
        clients.add(new Person("Сергей", "Жуков", 1));
        return clients;
    }
}
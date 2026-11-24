
import java.util.HashMap;

public class RepoClass {

    private HashMap<Integer, Person> map = new HashMap<>();

    public boolean addPerson(int id, String name, int age, String address) {

        if (id <= 0) {
            return false;
        }

        if (map.containsKey(id)) {
            return false;
        }

        try {
            Person person = new Person(name, age, address);
            map.put(id, person);
            return true;
        } 
        catch (IllegalArgumentException e) {
            return false;
        }
    }

    public void displayAll() {

        if (map.isEmpty()) {
            System.out.println("No persons available");
            return;
        }

        for (Person person : map.values()) {
            person.displayPersonDetails();
        }
    }
}

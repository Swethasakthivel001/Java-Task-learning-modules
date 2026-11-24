
import java.util.HashSet;
import java.util.Set;

public class CityManager {

    private final Set<String> cities;

    public CityManager() {
        cities = new HashSet<>();
    }

    public void addCity(String city) {

        boolean added = cities.add(city);

        if (added) {
            System.out.println(city + " added successfully.");
        } else {
            System.out.println(city + " already exists. Duplicate ignored.");
        }
    }

    public void displayCities() {

        if (cities.isEmpty()) {
            System.out.println("No cities available.");
            return;
        }

        System.out.println("\nUnique city names:");

        for (String city : cities) {
            System.out.println(city);
        }
    }

    public int getCityCount() {
        return cities.size();
    }
}

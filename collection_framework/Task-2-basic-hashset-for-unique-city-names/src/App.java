import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CityManager manager = new CityManager();

        System.out.print("Enter number of cities: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        if (count < 0) {
            System.out.println("Number of cities cannot be negative.");
            scanner.close();
            return;
        }

        for (int i = 0; i < count; i++) {

            System.out.print("Enter city name " + (i + 1) + ": ");

            String city = scanner.nextLine().trim();

            if (city.isEmpty()) {
                System.out.println("City name cannot be empty.");
                i--;
                continue;
            }

            manager.addCity(city);
        }

        manager.displayCities();

        System.out.println("\nTotal unique cities: "
                + manager.getCityCount());

        scanner.close();
    }
}

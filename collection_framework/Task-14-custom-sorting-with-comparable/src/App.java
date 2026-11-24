
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Movie> movies = new ArrayList<>();

        System.out.print("Enter number of movies: ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {

            System.out.println("\nEnter details for Movie " + (i + 1));

            System.out.print("Enter movie title: ");
            String title = sc.nextLine();

            System.out.print("Enter release year: ");
            int year = sc.nextInt();

            System.out.print("Enter movie rating: ");
            double rating = sc.nextDouble();
            sc.nextLine();

            movies.add(new Movie(title, year, rating));
        }

        Collections.sort(movies);

        System.out.println("\nMovies sorted by rating (Ascending):");

        for (Movie movie : movies) {
            System.out.println(movie);
        }

        sc.close();
    }
}

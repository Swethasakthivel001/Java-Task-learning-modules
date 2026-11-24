
public class Movie implements Comparable<Movie> {

    private String title;
    private int releaseYear;
    private double rating;

    public Movie(String title, int releaseYear, double rating) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public int compareTo(Movie other) {
        return Double.compare(this.rating, other.rating);
    }

    @Override
    public String toString() {
        return "Title: " + title
                + ", Release Year: " + releaseYear
                + ", Rating: " + rating;
    }
}

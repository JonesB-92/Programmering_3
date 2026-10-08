package opgave02;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoviesApp {

    public static List<Movie> readMovies(String filename) throws IOException {
        List<Movie> movies = new ArrayList<>();

        try (Scanner in = new Scanner(new File(filename))) {
            while (in.hasNextLine()) {
                String nameLine = in.nextLine();
                String yearLine = in.nextLine();
                String directorsLine = in.nextLine();
                String producersLine = in.nextLine();
                String actorsLine = in.nextLine();
                movies.add(new Movie(getString(nameLine),
                        Integer.parseInt(getString(yearLine)),
                        getList(directorsLine), getList(producersLine),
                        getList(actorsLine)));
            }
        }
        return movies;
    }

    private static String getString(String line) {
        int colon = line.indexOf(":");
        return line.substring(colon + 1).trim();
    }

    private static List<String> getList(String line) {
        return Stream.of(getString(line).split(", "))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) throws IOException {


        List<Movie> movieList = readMovies("C:\\Users\\j0int\\OneDrive\\Datamatiker\\IntelliJ Kodning\\Idea Projects\\Programmering_3\\Dag_08_Streams\\src\\opgave02\\movies.txt");
//        for (Movie m : movieList) {
//            System.out.println(m.getTitle());
//        }

//        movieList.stream().forEach(e -> System.out.println(e.getTitle()));

        System.out.println("\nNumber of movies: " + movieList.size());

        //  The number of movies starting with "H"
        System.out.println("\nThe number of movies starting with \"H\": " + movieList.stream().filter(e -> e.getTitle().startsWith("H")).count());

        // The title of the movies starting with "X"
//        System.out.println("\nThe title of the movies starting with \"X\": ");
//        movieList.stream().filter(e -> e.getTitle().startsWith("X")).forEach(e -> System.out.println(e.getTitle()));

        // The number of films where the director is also an actor
        System.out.println("\nThe number of films where the director is also an actor: ");
        System.out.println(movieList.stream()
                .filter(e -> e.getDirectors().stream().anyMatch(e.getActors()::contains))
                .count());
        // ELLER
        System.out.println(movieList.stream()
                .filter(e -> !Collections.disjoint(e.getActors(), e.getDirectors()))
                .count());

        // The number of actors in the film with the most actors
        System.out.println("\nThe number of actors in the film with the most actors:");
        System.out.println(movieList.stream()
                .max(Comparator.comparingInt(e -> e.getActors().size()))
                .get().getActors().size());

        // The title of the film with the most actors
        System.out.println("\nThe title of the film with the most actors: ");
        System.out.println(movieList.stream()
                .max(Comparator.comparingInt(e -> e.getActors().size()))
                .get().getTitle());
        //ELLER
        System.out.println(movieList.stream()
                .reduce((c, m) -> m.getActors().size() > c.getActors().size() ? c : m));

        // \nNumber of films divided by first letter in the film title
        System.out.println("\nNumber of films divided by first letter in the film title");
        System.out.println(movieList.stream().
                collect((Collectors.groupingBy(e -> e.getTitle().substring(0,1), Collectors.counting()))));

        // \nNumber of movies whose title starts with "The "
        System.out.println("\nNumber of movies whose title starts with \"The\"");
        System.out.println(movieList.stream()
                .filter(e -> e.getTitle().toLowerCase(Locale.ROOT).startsWith("the")).count());
    }
}

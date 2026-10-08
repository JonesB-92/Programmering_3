package opgave02;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private final String title;
    private final int year;
    private final List<String> directors;
    private final List<String> producers;
    private final List<String> actors;

    public Movie(String title, int year, List<String> directors,
                 List<String> producers, List<String> actors) {
        this.title = title;
        this.year = year;
        this.directors = directors;
        this.producers = producers;
        this.actors = actors;
    }

    public List<String> getActors() {
        return new ArrayList<>(actors);
    }

    public List<String> getDirectors() {
        return new ArrayList<>(directors);
    }

    public List<String> getProducers() {
        return new ArrayList<>(producers);
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "\nName: " + title
                + "\nYear: " + year
                + "\nDirected by: " + directors
                + "\nProduced by: " + producers
                + "\nActors: " + actors;
    }
}

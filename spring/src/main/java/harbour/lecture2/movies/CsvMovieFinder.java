package harbour.lecture2.movies;

import java.util.List;

public class CsvMovieFinder implements MovieFinder {


    public CsvMovieFinder(String pathToCSV) {
    }

    @Override
    public List<Movie> findAll() {
        final var e1 = new Movie();
        e1.setTitle("Twilight");
        e1.setGenre("ACTION");
        return List.of(
            e1
        );
    }
}

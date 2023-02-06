package harbour.lecture2.movies;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class FakeMovieFinder implements MovieFinder {

    public FakeMovieFinder() {
        System.out.println("Fake movie finder was created");
    }

    @Override
    public List<Movie> findAll() {

        Movie movie = new Movie();
        movie.setGenre("ACTION");
        movie.setTitle("Die Hard");

        return List.of(movie);
    }
}

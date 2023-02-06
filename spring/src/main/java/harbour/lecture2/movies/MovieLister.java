package harbour.lecture2.movies;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
class MovieLister {

    private final MovieFinder finder;

    public MovieLister(MovieFinder finder) {
        this.finder = finder;

        System.out.println(String.format("New movie lister was created with finder of type: %s", finder.getClass()));
    }

    public List<Movie> moviesByGenre(String genre) {

        List<Movie> allMovies = finder.findAll();

        List<Movie> result = new ArrayList<>();

        for (var movie : allMovies) {
            if (movie.getGenre()
                     .equals(genre)) {
                result.add(movie);
            }
        }
        return result;
    }
}

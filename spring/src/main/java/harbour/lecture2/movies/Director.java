package harbour.lecture2.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {

    private final Movie movie;

    @Autowired
    public Director(Movie movie) {
        this.movie = movie;

        System.out.println("Director was created");
    }
}

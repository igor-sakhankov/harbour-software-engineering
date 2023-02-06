package harbour.lecture2.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Imdb {

    @Autowired
    MovieLister movieLister;


    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(MoviesConfig.class);

        final var bean = context.getBean(MovieLister.class);

        final var imdb = context.getBean(Imdb.class);

        System.out.println(imdb.movieLister.moviesByGenre("ACTION"));

    }

}

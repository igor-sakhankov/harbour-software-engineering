package harbour.lecture2.movies;

public class ServiceLocator {

    private static final FakeMovieFinder mf = new FakeMovieFinder();

    public static MovieFinder getFinder() {
        return mf;
    }
}

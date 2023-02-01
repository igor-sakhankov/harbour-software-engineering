package com.harbour.lecture2.movies;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class DirectorLister {

    private final MovieFinder finder;

    public DirectorLister() {
        finder = ServiceLocator.getFinder();
    }

    public Set<Director> getAllDirectors() {

        List<Movie> allMovies = finder.findAll();

        return allMovies.stream()
                        .map(m -> m.director)
                        .collect(Collectors.toSet());
    }
}

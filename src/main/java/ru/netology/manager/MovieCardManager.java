package ru.netology.manager;

import ru.netology.domain.MovieCard;

public class MovieCardManager {

    private MovieCard[] movies = new MovieCard[0];
    private int numberOfMovies = 10;

    public MovieCardManager() {
    }

    public MovieCardManager(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public void add(MovieCard movie) {

        int length = movies.length + 1;
        MovieCard[] tmp = new MovieCard[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public MovieCard[] getAll() {
        int resultLength;
        if (movies.length < numberOfMovies) {
            resultLength = movies.length;
        } else {
            resultLength = numberOfMovies;
        }

        MovieCard[] result = new MovieCard[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = resultLength - i - 1;
            result[i] = movies[index];

        }
        return result;
    }
}






























package ru.netology.domain;

public class MovieCard {
    private int id;
    private int movieId;
    private String movieName;
    private String genre;
    private boolean premiere;

    public MovieCard(int id, int movieId, String movieName, String genre, boolean premiere) {
        this.id = id;
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
        this.premiere = premiere;
    }

    // ++ getters/setters
}


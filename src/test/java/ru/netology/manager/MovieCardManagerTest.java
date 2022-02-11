package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieCard;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class MovieCardManagerTest {

    @Test
    public void shouldShowAllAddedMovies() {
        MovieCardManager manager = new MovieCardManager();
        MovieCard bloodshot = new MovieCard(1, 1, "bloodshot", "action", false);
        MovieCard onward = new MovieCard(2, 2, "onward", "cartoon", false);
        MovieCard otelBelgrad = new MovieCard(3, 3, "otelBelgrad", "comedy", false);
        MovieCard theGentlemen = new MovieCard(4, 4, "theGentlemen", "action", false);
        MovieCard theInvisibleMan = new MovieCard(5, 5, "theInvisibleMan", "thriller", false);
        MovieCard trollsWorldTour = new MovieCard(6, 6, "trollsWorldTour", "cartoon", true);
        MovieCard nomerOdin = new MovieCard(7, 7, "nomerOdin", "comedy", true);
        MovieCard legend = new MovieCard(8, 8, "legend", "fantasy", true);
        MovieCard theBestMovie = new MovieCard(9, 9, "theBestMovie", "comedy", false);
        MovieCard up = new MovieCard(10, 10, "up", "cartoon", false);

        manager.add(bloodshot);
        manager.add(onward);
        manager.add(otelBelgrad);
        manager.add(theGentlemen);
        manager.add(theInvisibleMan);
        manager.add(trollsWorldTour);
        manager.add(nomerOdin);
        manager.add(legend);
        manager.add(theBestMovie);
        manager.add(up);
        MovieCard[] actual = manager.getall();
        MovieCard[] expected = new MovieCard[]{up, theBestMovie, legend, nomerOdin, trollsWorldTour, theInvisibleMan, theGentlemen, otelBelgrad, onward, bloodshot};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAllAddedMoviesWithConstrFour() {
        MovieCardManager manager = new MovieCardManager(4);
        MovieCard bloodshot = new MovieCard(1, 1, "bloodshot", "action", false);
        MovieCard onward = new MovieCard(2, 2, "onward", "cartoon", false);
        MovieCard otelBelgrad = new MovieCard(3, 3, "otelBelgrad", "comedy", false);
        MovieCard theGentlemen = new MovieCard(4, 4, "theGentlemen", "action", false);
        MovieCard theInvisibleMan = new MovieCard(5, 5, "theInvisibleMan", "thriller", false);
        MovieCard trollsWorldTour = new MovieCard(6, 6, "trollsWorldTour", "cartoon", true);
        MovieCard nomerOdin = new MovieCard(7, 7, "nomerOdin", "comedy", true);
        MovieCard legend = new MovieCard(8, 8, "legend", "fantasy", true);
        MovieCard theBestMovie = new MovieCard(9, 9, "theBestMovie", "comedy", false);
        MovieCard up = new MovieCard(10, 10, "up", "cartoon", false);

        manager.add(bloodshot);
        manager.add(onward);
        manager.add(otelBelgrad);
        manager.add(theGentlemen);
        manager.add(theInvisibleMan);
        manager.add(trollsWorldTour);
        manager.add(nomerOdin);
        manager.add(legend);
        manager.add(theBestMovie);
        manager.add(up);

        MovieCard[] actual = manager.getall();
        MovieCard[] expected = new MovieCard[]{theGentlemen, otelBelgrad, onward, bloodshot};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAllAddedMoviesWithExceedingConstr() {
        MovieCardManager manager = new MovieCardManager(15);
        MovieCard bloodshot = new MovieCard(1, 1, "bloodshot", "action", false);
        MovieCard onward = new MovieCard(2, 2, "onward", "cartoon", false);
        MovieCard otelBelgrad = new MovieCard(3, 3, "otelBelgrad", "comedy", false);
        MovieCard theGentlemen = new MovieCard(4, 4, "theGentlemen", "action", false);
        MovieCard theInvisibleMan = new MovieCard(5, 5, "theInvisibleMan", "thriller", false);
        MovieCard trollsWorldTour = new MovieCard(6, 6, "trollsWorldTour", "cartoon", true);
        MovieCard nomerOdin = new MovieCard(7, 7, "nomerOdin", "comedy", true);
        MovieCard legend = new MovieCard(8, 8, "legend", "fantasy", true);
        MovieCard theBestMovie = new MovieCard(9, 9, "theBestMovie", "comedy", false);


        manager.add(bloodshot);
        manager.add(onward);
        manager.add(otelBelgrad);
        manager.add(theGentlemen);
        manager.add(theInvisibleMan);
        manager.add(trollsWorldTour);
        manager.add(nomerOdin);
        manager.add(legend);
        manager.add(theBestMovie);


        MovieCard[] actual = manager.getall();
        MovieCard[] expected = new MovieCard[]{theBestMovie, legend, nomerOdin, trollsWorldTour, theInvisibleMan, theGentlemen, otelBelgrad, onward, bloodshot};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAllAddedMoviesWithEmptyConstr() {
        MovieCardManager manager = new MovieCardManager(0);
        MovieCard bloodshot = new MovieCard(1, 1, "bloodshot", "action", false);
        MovieCard onward = new MovieCard(2, 2, "onward", "cartoon", false);
        MovieCard otelBelgrad = new MovieCard(3, 3, "otelBelgrad", "comedy", false);
        MovieCard theGentlemen = new MovieCard(4, 4, "theGentlemen", "action", false);
        MovieCard theInvisibleMan = new MovieCard(5, 5, "theInvisibleMan", "thriller", false);
        MovieCard trollsWorldTour = new MovieCard(6, 6, "trollsWorldTour", "cartoon", true);
        MovieCard nomerOdin = new MovieCard(7, 7, "nomerOdin", "comedy", true);
        MovieCard legend = new MovieCard(8, 8, "legend", "fantasy", true);
        MovieCard theBestMovie = new MovieCard(9, 9, "theBestMovie", "comedy", false);


        manager.add(bloodshot);
        manager.add(onward);
        manager.add(otelBelgrad);
        manager.add(theGentlemen);
        manager.add(theInvisibleMan);
        manager.add(trollsWorldTour);
        manager.add(nomerOdin);
        manager.add(legend);
        manager.add(theBestMovie);


        MovieCard[] actual = manager.getall();
        MovieCard[] expected = new MovieCard[]{};
        assertArrayEquals(expected, actual);
    }
}


/*
    @BeforeEach
    public void setUp() {
        manager.add(bloodshot);
        manager.add(onward);
        manager.add(otelBelgrad);
        manager.add(theGentlemen);
        manager.add(theInvisibleMan);
        manager.add(trollsWorldTour);
        manager.add(nomerOdin);
        manager.add(legend);
        manager.add(theBestMovie);
        manager.add(up);
    }
*/
    /*private MovieCardManager manager = new MovieCardManager();
    private MovieCard bloodshot = new MovieCard(1, 1, "bloodshot", "action", false);
    private MovieCard onward = new MovieCard(2, 2, "onward", "cartoon", false);
    private MovieCard otelBelgrad = new MovieCard(3, 3, "otelBelgrad", "comedy", false);
    private MovieCard theGentlemen = new MovieCard(4, 4, "theGentlemen", "action", false);
    private MovieCard theInvisibleMan = new MovieCard(5, 5, "theInvisibleMan", "thriller", false);
    private MovieCard trollsWorldTour = new MovieCard(6, 6, "trollsWorldTour", "cartoon", true);
    private MovieCard nomerOdin = new MovieCard(7, 7, "nomerOdin", "comedy", true);
    private MovieCard legend = new MovieCard(8, 8, "legend", "fantasy", true);
    private MovieCard theBestMovie = new MovieCard(9, 9, "theBestMovie", "comedy", false);
    private MovieCard up = new MovieCard(10, 10, "up", "cartoon", false);*/



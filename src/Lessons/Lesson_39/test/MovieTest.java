package Lessons.Lesson_39.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import teacher_code.hash_table.Movie;

public class MovieTest {
    @Test
    public void testEqualityOfMovies() {
        Movie movie1 = new Movie("movie", 100);
        Movie movie2 = new Movie("movie", 100);
        Movie movie3 = new Movie("movie", 101);
        Movie movie4 = new Movie("movie4", 100);

        Assertions.assertTrue(movie1.equals(movie2), "movie1.equals(movie2) are equals");
        Assertions.assertFalse(movie1.equals(movie3), "movie1.equals(movie3) are not equals");
        Assertions.assertFalse(movie1.equals(movie4), "movie1.equals(movie4) are not equals");

        Assertions.assertFalse(movie1.equals(null));
    }

    @Test
    public void testHashCodes() {
        Movie movie1 = new Movie("movie", 100);
        Movie movie2 = new Movie("movie", 100);
        Movie movie3 = new Movie("movie1", 100);
        Movie movie4 = new Movie("movie", 101);
        Movie movie5 = new Movie("movie5", 101);



        Assertions.assertEquals(movie1.hashCode(), movie1.hashCode());
        Assertions.assertEquals(movie1.hashCode(), movie2.hashCode());
        Assertions.assertNotEquals(movie1.hashCode(), movie3.hashCode());
        Assertions.assertNotEquals(movie1.hashCode(), movie4.hashCode());
        Assertions.assertNotEquals(movie1.hashCode(), movie5.hashCode());

        int movie1HashCode = movie1.hashCode();

        Assertions.assertEquals(movie1HashCode, movie1.hashCode());

        movie1.setMovieName("movie2");
        Assertions.assertNotEquals(movie1HashCode, movie1.hashCode());

        movie1HashCode = movie1.hashCode();
        movie1.setDurationMinutes(200);
        Assertions.assertNotEquals(movie1HashCode, movie1.hashCode());
    }
}

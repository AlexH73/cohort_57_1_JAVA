package Lessons.Lesson_39.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import teacher_code.hash_table.CustomHashTable;
import teacher_code.hash_table.Movie;

import java.util.ArrayList;

public class CustomHashTableTest {
    private static ArrayList<Movie> listOfMovies = new ArrayList<>();

    @BeforeEach
    public void setUp(){
        listOfMovies.add(new Movie("movie1", 100));
        listOfMovies.add(new Movie("movie1", 100));
        listOfMovies.add(new Movie("movie1", 100));
        listOfMovies.add(new Movie("movie1", 101));
        listOfMovies.add(new Movie("movie2", 100));
        listOfMovies.add(new Movie("movie3", 103));
    }

    @Test
    public void testContains(){
        CustomHashTable table = new CustomHashTable();

        Assertions.assertFalse(table.contains(listOfMovies.get(0)));

        Assertions.assertTrue(table.add(listOfMovies.get(0)));
        Assertions.assertFalse(table.add(listOfMovies.get(0)));
        Assertions.assertFalse(table.add(listOfMovies.get(1)));

        Assertions.assertTrue(table.add(listOfMovies.get(3)));
        Assertions.assertTrue(table.add(listOfMovies.get(4)));
        Assertions.assertTrue(table.add(listOfMovies.get(5)));

        Assertions.assertEquals(4, table.size());
    }
}

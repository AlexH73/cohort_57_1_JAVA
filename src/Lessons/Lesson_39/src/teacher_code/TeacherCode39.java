package Lessons.Lesson_39.src.teacher_code;

import Lessons.Lesson_39.src.teacher_code.hash_table.Movie;

import java.util.*;

public class TeacherCode39 {
    public static void main(String[] args) {
        Movie terminator = new Movie("Terminator", 120);
        Movie titanic = new Movie("Titanic", 180);
        Movie avatar = new Movie("Avatar", 200);
        Movie hobbit = new Movie("Hobbit", 210);
        Movie ironMan = new Movie("Iron Man", 130);
        Movie superMan = new Movie("Superman", 140);

        System.out.println("terminator.hashCode() = " + terminator.hashCode());
        System.out.println("titanic.hashCode() =    " + titanic.hashCode());
        System.out.println("avatar.hashCode() =     " + avatar.hashCode());
        System.out.println("hobbit.hashCode() =     " + hobbit.hashCode());
        System.out.println("ironMan.hashCode() =    " + ironMan.hashCode());
        System.out.println("superMan.hashCode() =   " + superMan.hashCode());

        //Movie[] movies = new Movie[5]; //[Movie, Movie, Movie, Movie, Movie]
        List<Movie> movies[] = new List[5]; // [null, null, null, null, null]
        //
        init(movies); // [List<Movie>, List<Movie>, List<Movie>, List<Movie>, List<Movie>]


        int terminatorIndex = Math.abs(terminator.hashCode() % movies.length);
        int titanicIndex = Math.abs(titanic.hashCode() % movies.length);
        int avatarIndex = Math.abs(avatar.hashCode() % movies.length);
        int hobbitIndex = Math.abs(hobbit.hashCode() % movies.length);
        int ironManIndex = Math.abs(ironMan.hashCode() % movies.length);
        int superManIndex = Math.abs(superMan.hashCode() % movies.length);


        System.out.println("terminatorIndex = " + terminatorIndex);
        System.out.println("titanicIndex = " + titanicIndex);
        System.out.println("avatarIndex = " + avatarIndex);
        System.out.println("hobbitIndex = " + hobbitIndex);
        System.out.println("ironManIndex = " + ironManIndex);
        System.out.println("superManIndex = " + superManIndex);

        movies[terminatorIndex].add(terminator);
        movies[titanicIndex].add(titanic);
        movies[avatarIndex].add(avatar);
        movies[hobbitIndex].add(hobbit);
        movies[ironManIndex].add(ironMan);
        movies[superManIndex].add(superMan);

        showContext(movies);

    }

    private static void init(List<Movie> movies[]) {
//        for (List<Movie> movie : movies) {
//            movie = new LinkedList<>();
//        }

        for (int i = 0; i < movies.length; i++) {
            movies[i] = new LinkedList<>();
        }
    }

    private static void showContext(List<Movie> movies[]) {
        for (int i = 0; i < movies.length; i++) {
            System.out.printf("movies[%d] = %s\n", i, movies[i].toString());
        }
    }
}

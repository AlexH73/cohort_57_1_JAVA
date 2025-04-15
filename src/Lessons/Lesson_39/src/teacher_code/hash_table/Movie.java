package Lessons.Lesson_39.src.teacher_code.hash_table;

import java.util.Random;

// объект кдасса Movie будет использован в классе CustomHashTable
// для понимания на практике хеш-таблиц и практического применения
// методов equals и hashCode
public class Movie {
    private String movieName;
    private int durationMinutes;

    public Movie(String movieName, int durationMinutes) {
        this.movieName = movieName;
        this.durationMinutes = durationMinutes;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null && !(o instanceof Movie)) {
            return false;
        }

        Movie movie = (Movie) o;

        return this.movieName.equals(movie.movieName) && this.durationMinutes == movie.durationMinutes;
    }

    @Override
    public int hashCode() {
        int hashCode = 31 * movieName.hashCode() + 31 * durationMinutes;

        return hashCode;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", durationMinutes=" + durationMinutes +
                '}';
    }
}

package Lessons.Lesson_47.practice.models;

import java.util.Objects;
import java.util.UUID;

// Модель
public class Reader {
    private final String id;
    private String firstName;
    private String lastName;
    private int birthYear;

    public Reader(String id, String firstName, String lastName, int birthYear) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public Reader(String firstName, String lastName, int birthYear) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return birthYear == reader.birthYear && Objects.equals(firstName, reader.firstName) && Objects.equals(lastName, reader.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthYear);
    }
}


package Lessons.Lesson_47.practice.models;

import java.util.Objects;
import java.util.UUID;

// Модель
public class Author {
    private final String id;
    private String firstName;
    private String lastName;
    private int birthYear;

    public String serialize() {
        StringBuilder str = new StringBuilder();

        str.append(this.id);
        str.append(",");
        str.append(this.firstName);
        str.append(",");
        str.append(this.lastName);
        str.append(",");
        str.append(this.birthYear);
        str.append("\n");

        return str.toString();
    }

    public static Author deserialize(String str) {
        String[] parts = str.strip().split(",");

        return new Author(
                parts[0],
                parts[1],
                parts[2],
                Integer.parseInt(parts[3])
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return birthYear == author.birthYear && Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthYear);
    }

    public Author(String id, String firstName, String lastName, int birthYear) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public Author(String firstName, String lastName, int birthYear) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
}
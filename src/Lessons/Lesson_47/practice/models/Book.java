package Lessons.Lesson_47.practice.models;

import java.util.Objects;
import java.util.UUID;

// Модель
public class Book {
    private final String id;
    private String title;
    private int yearOfPublication;
    private Author author;
    private Reader reader;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", author=" + author +
                ", reader=" + reader +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(reader, book.reader);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, yearOfPublication, author, reader);
    }

    public Book(String id, String title, int yearOfPublication, Author author, Reader reader) {
        this.id = id;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
        this.reader = reader;
    }

    public Book(String title, int yearOfPublication, Author author, Reader reader) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
        this.reader = reader;
    }
}

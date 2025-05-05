package Lessons.Lesson_47.practice.interfaces;

import Lessons.Lesson_47.practice.models.Book;

import java.util.List;

// Слой доступа к данным (Data Access Layer)
public interface BookRepository {
    void addBook(Book book);
    List<Book> findAllBooks();
}


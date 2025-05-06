package Lessons.Lesson_47.practice.interfaces;


import Lessons.Lesson_47.practice.models.Author;

import java.util.List;

// Слой доступа к данным (Data Access Layer)
public interface AuthorRepository {
    void addAuthor(Author author);
    List<Author> findAllAuthors();
}


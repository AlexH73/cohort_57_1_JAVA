package Lessons.Lesson_47.practice.repositories;


import Lessons.Lesson_47.practice.interfaces.AuthorRepository;
import Lessons.Lesson_47.practice.models.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepositoryImpl implements AuthorRepository {

    @Override
    public void addAuthor(Author author) {

    }

    @Override
    public List<Author> findAllAuthors() {
        return List.of();
    }
}

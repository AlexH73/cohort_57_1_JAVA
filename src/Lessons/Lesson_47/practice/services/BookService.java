package Lessons.Lesson_47.practice.services;


import Lessons.Lesson_47.practice.interfaces.BookRepository;

//Слой бизнес-логики
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}

package Lessons.Lesson_47.practice.interfaces;


import Lessons.Lesson_47.practice.models.Reader;

import java.util.List;

// Слой доступа к данным (Data Access Layer)
public interface ReaderRepository {
    void registerReader(Reader reader);
    List<Reader> findAllReaders();
}


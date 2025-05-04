package Lessons.Lesson_47.example;

import java.util.List;

// ===================== REPOSITORY =====================
public interface ContactRepository {
    void save(Contact contact);
    Contact findById(Long id);
    List<Contact> findAll();
    void deleteById(Long id);
}

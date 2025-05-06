package Lessons.Lesson_47.example;

import java.util.List;

// ===================== SERVICE =====================
public interface ContactService {
    void addContact(Contact contact);
    Contact getContact(Long id);
    List<Contact> listContacts();
    void deleteContact(Long id);
}

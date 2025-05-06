package Lessons.Lesson_47.example;

import java.util.List;

public class ContactServiceImpl implements ContactService {
    private final ContactRepository repository;

    public ContactServiceImpl(ContactRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addContact(Contact contact) {
        if (contact.getName() == null || contact.getName().isBlank()) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        repository.save(contact);
    }

    @Override
    public Contact getContact(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Contact> listContacts() {
        return repository.findAll();
    }

    @Override
    public void deleteContact(Long id) {
        repository.deleteById(id);
    }
}
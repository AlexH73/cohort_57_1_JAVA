package Lessons.Lesson_47.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryContactRepository implements ContactRepository {
    private final Map<Long, Contact> storage = new HashMap<>();

    @Override
    public void save(Contact contact) {
        storage.put(contact.getId(), contact);
    }

    @Override
    public Contact findById(Long id) {
        return storage.get(id);
    }

    @Override
    public List<Contact> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void deleteById(Long id) {
        storage.remove(id);
    }
}

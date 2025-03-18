package Lessons.Lesson_32.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook implements PhoneBookInterface {
    private Map<String, String> phoneBook;

    public PhoneBook() {
        this.phoneBook = new TreeMap<>();
    }

    @Override
    public boolean addContact(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)){
            return false;
        }
        this.phoneBook.put(name, phoneNumber);
        return phoneBook.containsKey(name);
    }

    @Override
    public String getPhoneNumber(String name) {
        return "";
    }

    @Override
    public boolean updatePhoneNumber(String name, String newPhoneNumber) {
        return false;
    }

    @Override
    public boolean removeContact(String name) {
        return false;
    }

    @Override
    public boolean containsContact(String name) {
        return false;
    }

    @Override
    public boolean containsPhoneNumber(String phoneNumber) {
        return false;
    }

    @Override
    public Map<String, String> getAllContacts() {
        return Map.of();
    }

    @Override
    public void clearPhoneBook() {

    }

    @Override
    public boolean isPhoneBookEmpty() {
        return false;
    }
}

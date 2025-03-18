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

/**
     * Обновляет номер телефона для существующего контакта.
            * Если контакт не найден, метод ничего не делает.
     *
    * @param name имя контакта
     * @param newPhoneNumber новый номер телефона
     * @return true, если номер был обновлён, false, если контакт не найден
     */
    @Override
    public boolean updatePhoneNumber(String name, String newPhoneNumber) {
        if (phoneBook.containsKey(name)){
            phoneBook.put(name, newPhoneNumber);
            return phoneBook.containsValue(newPhoneNumber);
        }
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

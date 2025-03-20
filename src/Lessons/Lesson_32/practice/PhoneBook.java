package Lessons.Lesson_32.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook implements PhoneBookInterface {
    private Map<String, String> phoneBook;

    public PhoneBook() {
        this.phoneBook = new TreeMap<>();
    }

    /**
     * Добавляет новый контакт в записную книжку.
     * Если контакт с таким именем уже существует, метод не должен изменять его.
     *
     * @param name имя контакта
     * @param phoneNumber номер телефона
     * @return true, если контакт успешно добавлен, false, если контакт с таким именем уже существует
     */
    @Override
    public boolean addContact(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            return false;
        }
        this.phoneBook.put(name, phoneNumber);
        return phoneBook.containsKey(name);
    }

    /**
     * Получает номер телефона по имени контакта.
     *
     * @param name имя контакта
     * @return номер телефона, если контакт найден, иначе null
     */
    @Override
    public String getPhoneNumber(String name) {
        String numberPhone = phoneBook.get(name);
        return numberPhone;
    }

    /**
     * Обновляет номер телефона для существующего контакта. Если контакт не найден, метод ничего не делает.
     *
     * @param name           имя контакта
     * @param newPhoneNumber новый номер телефона
     * @return true, если номер был обновлён, false, если контакт не найден
     */
    @Override
    public boolean updatePhoneNumber(String name, String newPhoneNumber) {
        if (phoneBook.containsKey(name)) {
            phoneBook.put(name, newPhoneNumber);
            return phoneBook.containsValue(newPhoneNumber);
        }
        return false;
    }

    /**
     * Удаляет контакт из записной книжки.
     *
     * @param name имя контакта, который нужно удалить
     * @return true, если контакт был удалён, false, если контакт не найден
     */
    @Override
    public boolean removeContact(String name) {
        if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
            return true;
        }
        return false;
    }

    /**
     * Проверяет, содержится ли в записной книжке контакт с указанным именем.
     *
     * @param name имя контакта
     * @return true, если контакт найден, иначе false
     */
    @Override
    public boolean containsContact(String name) {
        return phoneBook.containsKey(name);
    }

    /**
     * Проверяет, содержится ли в записной книжке указанный номер телефона.
     *
     * @param phoneNumber номер телефона
     * @return true, если номер найден, иначе false
     */
    @Override
    public boolean containsPhoneNumber(String phoneNumber) {
        return phoneBook.containsValue(phoneNumber);
    }

    /**
     * Выводит список всех контактов и их номеров телефонов.
     *
     * @return `Map` со всеми контактами
     */
    @Override
    public Map<String, String> getAllContacts() {
        return Map.of();
    }

    /**
     * Очищает записную книжку, удаляя все контакты.
     */
    @Override
    public void clearPhoneBook() {
        phoneBook.clear();
    }

    /**
     * Проверяет, является ли записная книжка пустой.
     *
     * @return true, если записная книжка не содержит контактов, иначе false
     */
    @Override
    public boolean isPhoneBookEmpty() {
        return phoneBook.isEmpty();
    }
}

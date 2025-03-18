package Lessons.Lesson_32.practice;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // Добавление контактов
        phoneBook.addContact("Иван", "+7-900-123-45-67");
        phoneBook.addContact("Мария", "+7-901-234-56-78");
        phoneBook.addContact("Алексей", "+7-902-345-67-89");

        // Попытка добавить существующий контакт
        boolean isAdded = phoneBook.addContact("Иван", "+7-999-999-99-99");
        System.out.println("Контакт добавлен? " + isAdded); // false

        // Обновление номера
        phoneBook.updatePhoneNumber("Мария", "+7-903-456-78-90");

        // Проверка наличия номера
        System.out.println("Есть ли номер +7-902-345-67-89? " +
                phoneBook.containsPhoneNumber("+7-902-345-67-89")); // true

        // Вывод всех контактов (отсортированных)
        System.out.println("Все контакты: " + phoneBook.getAllContacts());
    }
}

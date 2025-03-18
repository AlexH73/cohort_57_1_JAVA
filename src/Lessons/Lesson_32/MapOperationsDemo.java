package Lessons.Lesson_32;

import java.util.HashMap;
import java.util.Map;

public class MapOperationsDemo {
    public static void main(String[] args) {
        // 1. Создание HashMap (телефонная книга)
        Map<String, String> phoneBook = new HashMap<>();

        // 2. Добавление записей
        phoneBook.put("Иван", "+49-900-123-45-67");
        phoneBook.put("Мария", "+49-901-234-56-78");
        phoneBook.put("Алексей", "+49-902-345-67-89");

        System.out.println("Исходная телефонная книга: " + phoneBook);

        // 3. Получение номера телефона по имени
        String phoneNumber = phoneBook.get("Мария");
        System.out.println("Номер Марии: " + phoneNumber);

        // 4. Попытка получить номер несуществующего контакта
        System.out.println("Номер Ольги: " + phoneBook.getOrDefault("Ольга", "Контакт не найден"));

        // 5. Обновление номера телефона
        phoneBook.put("Иван", "+49-900-999-99-99");
        System.out.println("Обновленный номер Ивана: " + phoneBook.get("Иван"));

        // 6. Удаление контакта
        phoneBook.remove("Алексей");
        System.out.println("Телефонная книга после удаления Алексея: " + phoneBook);

        // 7. Проверка наличия ключа (есть ли контакт "Мария")
        System.out.println("Есть ли Мария в списке? " + phoneBook.containsKey("Мария"));

        // 8. Проверка наличия значения (есть ли номер "+49-900-999-99-99")
        System.out.println("Есть ли номер +49-900-999-99-99 в списке? " + phoneBook.containsValue("+49-900-999-99-99"));

        // 9. Вывод всех контактов (ключи)
        System.out.println("Все контакты: " + phoneBook.keySet());

        // 10. Вывод всех номеров (значения)
        System.out.println("Все номера телефонов: " + phoneBook.values());

        // 11. Перебор всех записей с помощью forEach
        System.out.println("Полный список контактов:");
        phoneBook.forEach((name, phone) -> System.out.println(name + " -> " + phone));

        // 12. Очистка всех записей
        phoneBook.clear();
        System.out.println("Телефонная книга после очистки: " + phoneBook);

        // 13. Проверка на пустоту
        System.out.println("Телефонная книга пуста? " + phoneBook.isEmpty());
    }
}

package Homework.lesson_21;

public class MessageUsage {
    /**
     * <h1>Задание 2: Улучшение класса Message</h1>
     *    1. Добавить новый метод isFrom(String username), который проверяет,
     *    отправлено ли сообщение указанным пользователем.<br>
     *    2. Добавить метод shortPreview(int maxLength), который возвращает первые maxLength
     *    символов сообщения + "...", если оно длиннее указанного лимита.<br>
     *    3. Создать несколько объектов Message и протестировать новый функционал.<br>
     */
    public static void main(String[] args) {
        // Создаем несколько объектов Message
        Message message1 = new Message();
        message1.sender = "Alexander";
        message1.timestamp = "20:18";
        message1.receiver = "Yulianna";
        message1.text = "Hello, Yulianna!";

        Message message2 = new Message();
        message2.sender = "Yulianna";
        message2.timestamp = "20:20";
        message2.receiver = "Alexander";
        message2.text = "Hi, Alexander! How are you?";

        Message message3 = new Message();
        message3.sender = "Alexander";
        message3.timestamp = "20:22";
        message3.receiver = "Yulianna";
        message3.text = "I'm fine, thanks! Just wanted to say hello.";

        // Объект с более длинным сообщением
        Message message4 = new Message();
        message4.sender = "Alexander";
        message4.timestamp = "20:25";
        message4.receiver = "Yulianna";
        message4.text = "This is a much longer message that exceeds the usual length. It is intended to test the shortPreview method to ensure it works correctly.";

        // Выводим информацию обо всех сообщениях
        System.out.println("\nAll messages:");
        Message[] arrayMessage = {message1, message2, message3, message4};

        // Используем цикл для вывода информации о каждом сообщении
        for (int i = 0; i < arrayMessage.length; i++) {
            System.out.println("\nMessage " + (i + 1) + ":");
            // Используем метод displayMessage с параметром maxLength = 30
            System.out.println(arrayMessage[i].displayMessage(30));
            // Проверяем отправителя сообщения
            System.out.println("Is message" + (i + 1) + " from Alexander? " + arrayMessage[i].isFrom("Alexander"));
            // Выводим строковое представление объекта
            System.out.println("toString: " + arrayMessage[i]);
        }
    }
}

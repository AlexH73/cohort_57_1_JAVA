package Homework.lesson_21;
// [x]TODO: Создать класс Message
// [x]1. Добавить поля:
//    - `sender` (String) - Имя отправителя
//    - `receiver` (String) - Имя получателя
//    - `text` (String) - Текст сообщения
//    - `timestamp` (String) - Время отправки сообщения
// [x]2. Реализовать метод `displayMessage()`, который выводит сообщение в формате:
//    "[12:30] John → Alice: Привет, как дела?"
public class Message {
    String sender;
    String receiver;
    String text;
    String timestamp;

    // Метод для проверки отправителя
    public boolean isFrom(String username) {
        return sender.equals(username);
    }

    // Метод для получения короткой версии сообщения
    public String shortPreview(int maxLength) {
        if (text.length() > maxLength) {
            return text.substring(0, maxLength) + "...";
        } else {
            return text;
        }
    }

    // Метод для отображения короткой версии сообщения
    public String displayMessage(int maxLength) {
        String messageText = shortPreview(maxLength);
        return "["
                + timestamp + "] " +
                sender + " → " +
                receiver + ": " +
                messageText;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Message {" + "From: " + sender +
                " To: " + receiver +
                " Time: " + timestamp +
                "}";
    }
}

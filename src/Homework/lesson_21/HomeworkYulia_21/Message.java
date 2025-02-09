// Задание 2: Улучшение класса Message
//добавить новый метод isFrom(String username), который проверяет, отправлено ли сообщение указанным пользователем.
//Добавить метод shortPreview(int maxLength), который возвращает первые maxLength символов сообщения + "...", если оно длиннее указанного лимита.
//Создать несколько объектов Message и протестировать новый функционал.

package Homework.lesson_21.HomeworkYulia_21;

public class Message {
    String sender;
    String recipient;
    String text;

    public Message(String sender, String recipient, String text) {
        this.sender = sender;
        this.recipient = recipient;
        this.text = text;
    }

    public boolean isFrom(String userName) {
        return sender.equalsIgnoreCase(userName);
    }

    public String shortPreview(int maxLength) {
        if (text.length() > maxLength) {
            return text.substring(0, maxLength) + "...";
        }
        return text;
    }

    public void displayMessage() {
        System.out.println("Отправитель:" + sender);
        System.out.println("Получатель:" + recipient);
        System.out.println("Сообщение:" + text);
        System.out.println("________________________");


    }
}

package Hausaufgaben.Hausaufgaben_21.Message;

/*
Задание 2: Улучшение класса Message.
Добавить новый метод isFrom(String username), который проверяет, отправлено ли сообщение указанным пользователем.
Добавить метод shortPreview(int maxLength), который возвращает первые maxLength символов сообщения + "...", если оно длиннее указанного лимита.
Создать несколько объектов Message и протестировать новый функционал.
 */
public class Message {
    String sender;
    String receiver;
    String text;
    String timestampt;

    public boolean isFrom(String username) {
        return sender.equals(username);
    }

    public String shortPreview(int maxLength) {
        if (text.length() <= maxLength) {
            return text;
        } else {
            return text.substring(0, maxLength) + "...";
        }
    }
}



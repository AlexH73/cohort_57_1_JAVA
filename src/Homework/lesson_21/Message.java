
package Homework.lesson_21;
/*Задание 2: Улучшение класса Message
Добавить новый метод isFrom(String username), который проверяет, отправлено ли сообщение
указанным пользователем.
Добавить метод shortPreview(int maxLength), который возвращает первые maxLength символов
сообщения + "...",
если оно длиннее указанного лимита.
Создать несколько объектов Message и протестировать новый функционал.*/
public class Message {
    String sender;
    String text;
    String username;


//Конструктор класса Message
    public Message(String sender, String text) {
        this.sender = sender;
        this.text = text;
    }
    // метод isFrom(String username), который проверяет, отправлено ли сообщение
    //указанным пользователем.
    public boolean isFrom(String username) {
        return sender.equals(username);
    }
// метод shortPreview(int maxLength), который возвращает первые maxLength символов
//сообщения + "...",
//если оно длиннее указанного лимита.
    public String shortPreview(int maxLength) {
        if (text.length() > maxLength) {
            return text.substring(0, maxLength)  + "...";
        } else {
            return text;
        }
    }
//Дополнительный метод для вывода полной информации о сообщении
    public void displayMessage() {
        System.out.println("отправитель: " + sender);
        System.out.println("Сообщение: " + text);
        System.out.println("-----------------------------");
    }

}

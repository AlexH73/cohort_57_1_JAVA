package Homerwork.Practica.Practica21;
//    - `sender` (String) - Имя отправителя
//    - `receiver` (String) - Имя получателя
//    - `text` (String) - Текст сообщения
//    - `timestamp` (String) - Время отправки сообщения
// 2. Реализовать метод `displayMessage()`, который выводит сообщение в формате:
//    "[12:30] John → Alice: Привет, как дела?"
public class Message {
    String sender;
    String receiver;
    String text;
    String timestamp;

    public Message(String sender, String receiver, String text, String timestamp) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.timestamp = timestamp;
    }

    //Метод для отображения сообщения
    public void displayMessage() {
        System.out.println("[" + timestamp + "]" + sender + " → " + receiver + ": " + text);
    }
}

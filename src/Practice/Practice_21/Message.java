package Practice.Practice_21;

// TODO: Создать класс Message
// [х]1. Добавить поля:
//    - `sender` (String) - Имя отправителя
//    - `receiver` (String) - Имя получателя
//    - `text` (String) - Текст сообщения
//    - `timestamp` (String) - Время отправки сообщения
// [x]2. Реализовать метод `displayMessage()`, который выводит сообщение в формате:
//    "[12:30] John → Alice: Привет, как дела?"

class Message {
    String sender;
    String receiver;
    String text;
    String timestamp;

    public String displayMessage() {
        String messageOutput = "["
            + timestamp + "] " +
                sender + " → " +
                receiver + ":" +
                text;
        return messageOutput;
    }
}

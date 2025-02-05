package Homework.Homework_21;

public class MessageUsage {
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
/*
        // Тестируем новые методы
        System.out.println("displayMessage() = " + message1.displayMessage());
        System.out.println("Is message1 from Alexander? " + message1.isFrom("Alexander"));
        System.out.println("Short preview of message1: " + message1.shortPreview(10));

        System.out.println("\ndisplayMessage() = " + message2.displayMessage());
        System.out.println("Is message2 from Alexander? " + message2.isFrom("Alexander"));
        System.out.println("Short preview of message2: " + message2.shortPreview(10));

        System.out.println("\ndisplayMessage() = " + message3.displayMessage());
        System.out.println("Is message3 from Alexander? " + message3.isFrom("Alexander"));
        System.out.println("Short preview of message3: " + message3.shortPreview(10));

        System.out.println("\ndisplayMessage() = " + message4.displayMessage());
        System.out.println("Is message4 from Alexander? " + message4.isFrom("Alexander"));
        System.out.println("Short preview of message4: " + message4.shortPreview(10));
*/
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
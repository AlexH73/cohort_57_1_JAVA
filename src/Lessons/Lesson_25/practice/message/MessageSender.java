package Lessons.Lesson_25.practice.message;

public class MessageSender {




    public static void sendMessage(SMSmessage message) {
        // спецефическая логика
        System.out.println("СМС сообщение " + message + "\nбыло отправлено");
    }

    public static void sendMessage(EmailMessage message) {
        // спецефическая логика
        System.out.println("E-mail сообщение " + message + "\nбыло отправлено");
    }

    public static void sendMessage(Message message) {
        // общая логика
        System.out.println("Сообщение " + message + "\nбыло отправлено");

    }
}

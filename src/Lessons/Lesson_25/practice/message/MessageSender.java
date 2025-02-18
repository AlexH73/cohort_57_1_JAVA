package Lessons.Lesson_25.practice.message;

public class MessageSender {
    public static void main(String[] args) {
        Message smsMessage = new SMSmessage("132", "1245333", "sfsdfds");
        Message emailMessage = new EmailMessage("ilias@gmail.com", "ait@telran.com", "hello");
        Message whatsAppMessage = new WhatsAppMessage("ilias", "2342324", "hi!");

        sendMessage(smsMessage);
        sendMessage(emailMessage);
        sendMessage(whatsAppMessage);

        SMSmessage smsMessage_child = new SMSmessage ("132", "1245333", "sfsdfds");
        EmailMessage emailMessage_child = new EmailMessage ("ilias@gmail.com", "ait@telran.com", "hello");
        WhatsAppMessage whatsAppMessage_child = new WhatsAppMessage ("ilias", "2342324", "hi!");

        sendMessage(smsMessage_child);
        sendMessage(emailMessage_child);
        sendMessage(whatsAppMessage_child);
    }

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

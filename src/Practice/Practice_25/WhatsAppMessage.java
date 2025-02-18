package Practice.Practice_25;

public class WhatsAppMessage extends Message{
    public WhatsAppMessage(String text, String sender, String receiver) {
        super(text, sender, receiver);
    }

    @Override
    public void send() {
        System.out.println("Отправка WhatsApp-сообщения: " + text + " от " + sender + " к " + receiver);
    }
}

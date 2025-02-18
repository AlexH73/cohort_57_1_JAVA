package Practice.Practice_25;

public class EmailMessage extends Message{
    public EmailMessage(String text, String sender, String receiver) {
        super(text, sender, receiver);
    }

    @Override
    public void send() {
        System.out.println("Отправка Email: " + text + " от " + sender + " к " + receiver);
    }
}

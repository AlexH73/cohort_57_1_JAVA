package Practice.Practice_25;

public class SMSMessage extends Message{
    public SMSMessage(String text, String sender, String receiver) {
        super(text, sender, receiver);
    }

    @Override
    public void send() {
        System.out.println("Отправка SMS: " + text + " от " + sender + " к " + receiver);
    }
}

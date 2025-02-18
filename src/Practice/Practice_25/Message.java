package Practice.Practice_25;

public class Message {
    protected String text;
    protected String sender;
    protected String receiver;

    public Message(String text, String sender, String receiver) {
        this.text = text;
        this.sender = sender;
        this.receiver = receiver;
    }

    // Метод send() будет переопределён в подклассах
    public void send() {
        System.out.println("Отправка сообщения...");
    }
}

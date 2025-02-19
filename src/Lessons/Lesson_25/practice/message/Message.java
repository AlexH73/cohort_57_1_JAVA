package Lessons.Lesson_25.practice.message;

// базовый класс от которого все будут наследоваться
public class Message {
    // sender - отправитель
    // recepient - получатель
    // text - текст сообщения
    private String sender;
    private String recepient;
    private String text;

    public Message(String sender, String recepient, String text) {
        this.sender = sender;
        this.recepient = recepient;
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecepient() {
        return recepient;
    }

    public void setRecepient(String recepient) {
        this.recepient = recepient;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String showMessageInfo() {
        return "Message{" +
                "sender='" + sender + '\'' +
                ", recepient='" + recepient + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}

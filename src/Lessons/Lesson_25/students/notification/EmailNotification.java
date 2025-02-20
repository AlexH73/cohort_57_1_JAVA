package Lessons.Lesson_25.students.notification;

public class EmailNotification extends Notification{
    public EmailNotification(String message, String recipient, String timestamp) {
        super(message, recipient, timestamp);
    }

    @Override
    public void send() {
        System.out.println("Отправка Email: " + getMessage() + " на адрес " + getRecipient() + " в " + getTimestamp());
    }
}

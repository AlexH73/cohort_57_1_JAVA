package Lessons.Lesson_25.students.notification;

public class SMSNotification extends Notification{
    public SMSNotification(String message, String recipient, String timestamp) {
        super(message, recipient, timestamp);
    }

    @Override
    public void send() {
        System.out.println("Отправка SMS: " + getMessage() + " на номер " + getRecipient() + " в " + getTimestamp());
    }
}

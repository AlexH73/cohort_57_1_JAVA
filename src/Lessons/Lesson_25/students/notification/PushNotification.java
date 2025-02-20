package Lessons.Lesson_25.students.notification;

public class PushNotification extends Notification{
    public PushNotification(String message, String recipient, String timestamp) {
        super(message, recipient, timestamp);
    }

    @Override
    public void send() {
        System.out.println("Отправка Push-уведомления: " + getMessage() + " на устройство " + getRecipient() + " в " + getTimestamp());
    }
}

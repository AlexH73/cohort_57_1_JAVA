package Lessons.Lesson_25.students.notification;

public class Main {
    public static void main(String[] args) {
        Notification[] notifications = new Notification[3];

        notifications[0] = new PushNotification("Ваш заказ отправлен!", "Device123", "2025-02-18 10:00");
        notifications[1] = new EmailNotification("Подтвердите ваш email", "user@example.com", "2025-02-18 10:05");
        notifications[2] = new SMSNotification("Ваш код: 1234", "+1234567890", "2025-02-18 10:10");

        for (Notification notification : notifications) {
            notification.send();
        }

    }
}

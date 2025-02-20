package Lessons.Lesson_25.students.notification;

public class Notification {
    private String message, recipient, timestamp;

    public Notification(String message, String recipient, String timestamp) {
        this.message = message;
        this.recipient = recipient;
        this.timestamp = timestamp;
    }

    // Метод send(), который будет переопределён в подклассах
    public void send() {
        System.out.println("Отправка уведомления: " + message + " получателю " + recipient + " в " + timestamp);
    }

    //Геттеры
    public String getMessage() {
        return message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getTimestamp() {
        return timestamp;
    }
}

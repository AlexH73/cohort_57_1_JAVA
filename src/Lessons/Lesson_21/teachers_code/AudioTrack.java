package Lessons.Lesson_21.teachers_code;

import java.awt.Image;

/* Задание 1: Доработка класса AudioTrack */
public class AudioTrack {
    String title;
    String artist;
    int durationInSeconds;
    String genre;
    Image cover;

    // Конструктор без @Override, оскільки він не перевизначає метод
    public AudioTrack(String title, String artist, int durationInSeconds, String genre, Image cover) {
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
        this.genre = genre;
        this.cover = cover;
    }

    // Перевантажений конструктор для створення об'єкта без зображення
    public AudioTrack(String title, String artist, int durationInSeconds, String genre) {
        this(title, artist, durationInSeconds, genre, null);
    }

    public boolean isLongTrack() {
        return durationInSeconds > 300;
    }

    public void displayTrackInfo() {
        System.out.println("Название: " + title);
        System.out.println("Исполнитель: " + artist);
        System.out.println("Жанр: " + genre);
        System.out.println("Длительность: " + durationInSeconds + " секунд");
        System.out.println("Длинный трек? " + (isLongTrack() ? "Да" : "Нет"));
    }

    // Метод main не може бути перевизначеним, прибираємо @Override
    public static void main(String[] args) {
        AudioTrack audioTrack1 = new AudioTrack("Sonne", "Rammstein", 250, "Rock");
        AudioTrack audioTrack2 = new AudioTrack("Scandal", "Tina Karol", 280, "Pop");

        audioTrack1.displayTrackInfo();
        System.out.println();
        audioTrack2.displayTrackInfo();
    }
}

/* Задание 2: Улучшение класса Message */
class Message {
    String sender;
    String receiver;
    String text;
    String timestamp;

    public Message(String sender, String receiver, String text, String timestamp) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.timestamp = timestamp;
    }

    public void displayMessage() {
        System.out.println("[" + timestamp + "] " + sender + " → " + receiver + ": " + text);
    }

    public boolean isFrom(String username) {
        return sender.equals(username);
    }

    public String shortPreview(int maxLength) {
        return text.length() > maxLength ? text.substring(0, maxLength) + "..." : text;
    }

    public static void main(String[] args) {
        Message message1 = new Message("John", "Alice", "Hello, how are you?", "12:30");
        Message message2 = new Message("Alice", "John", "I'm fine, thank you!", "12:32");

        message1.displayMessage();
        message2.displayMessage();

        System.out.println("Message from John? " + message1.isFrom("John")); // true
        System.out.println("Short preview: " + message1.shortPreview(5)); // "Hello..."
    }
}

/* Задание 3: Расширение класса Task */
class Task {
    String title;
    String description;
    String status;
    int priority;

    public Task(String title, String description, String status, int priority) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public boolean isHighPriority() {
        return priority < 3;
    }

    public void displayTask() {
        String priorityDescription = switch (priority) {
            case 1 -> "Высокий";
            case 2 -> "Средний";
            default -> "Низкий";
        };

        System.out.println("Задача: " + title);
        System.out.println("Описание: " + description);
        System.out.println("Статус: " + status);
        System.out.println("Приоритет: " + priorityDescription);
        System.out.println("Высокий приоритет? " + (isHighPriority() ? "Да" : "Нет"));
    }

    public static void main(String[] args) {
        Task task1 = new Task("Задача 1", "Описание задачи 1", "В процессе", 1);
        Task task2 = new Task("Задача 2", "Описание задачи 2", "Новая", 3);

        task1.displayTask();
        System.out.println();
        task2.displayTask();
    }
}

package Lessons.Lesson_21.teachers_code;

import java.awt.Image;

/*Задание 1: Доработка класса AudioTrack
Добавить новый метод isLongTrack(), который возвращает true, если длительность трека больше 300 секунд (5 минут),
и false в противном случае.
Изменить метод displayTrackInfo(), чтобы он также выводил результат метода isLongTrack().
Протестировать класс, создав несколько объектов AudioTrack и вызвав все методы.
 */

public class AudioTrack {

    String title;
    String artist;
    int durationInSeconds;
    String genre;
    Image cover;

   public AudioTrack(String title, String artist, int durationInSeconds, String genre, Image cover) {
    this.title =title;
    this.artist =artist;
    this.durationInSeconds =durationInSeconds;
    this.genre =genre;
}

        public boolean isLongTrack() {
            return durationInSeconds > 300;

        }

        public void displayTrackInfo() {
            System.out.println("Название" + title);
            System.out.println("Исполнитель" + artist);
            System.out.println("Жанр" + genre);
            System.out.println("Длительность" + durationInSeconds + "секунд");
            System.out.println("Длинный трек?" + (isLongTrack() ? "Да" : "Нет"));
        }

        public static void main(String[] args) {
            AudioTrack audioTrack1 = new AudioTrack("Sonne", "Rammstein", 250, "Rock");
            AudioTrack audioTrack2 = new AudioTrack("Scandal", "Tina Karol", 280, "Pop");

            audioTrack1.displayTrackInfo();
            System.out.println();
            audioTrack2.displayTrackInfo();
        }

}

/*Задание 2: Улучшение класса Message
Добавить новый метод isFrom(String username), который проверяет, отправлено ли сообщение указанным пользователем.
Добавить метод shortPreview(int maxLength), который возвращает первые maxLength символов сообщения + "...", если оно длиннее указанного лимита.
Создать несколько объектов Message и протестировать новый функционал.
*/

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
        if (text.length() > maxLength) {
            return text.substring(0, maxLength) + "...";
        }
        return text;
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

/*Задание 3: Расширение класса Task
Добавить поле priority (целое число), которое обозначает приоритет задачи (чем меньше число, тем выше приоритет).
Реализовать метод isHighPriority(), который возвращает true, если приоритет задачи меньше 3, и false в противном случае.
В методе displayTask() добавить вывод приоритета и его классификацию (например, "Высокий", "Средний", "Низкий").
Протестировать код создав несколько задач.
*/

class Task {
    // Поля
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
        String priorityDescription;
        if (priority == 1) {
            priorityDescription = "Высокий";
        } else if (priority == 2) {
            priorityDescription = "Средний";
        } else {
            priorityDescription = "Низкий";
        }

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

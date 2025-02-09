package Homework.lesson_21.HomeworkYulia_21;

public class Main21 {
    public static void main(String[] args) {
// Вывод для 1 задачи:

        AudioTrack track1 = new AudioTrack("Imagine", "John Lennon", 183, "Rock");
        AudioTrack track2 = new AudioTrack("Земля в иллюминаторе", "Зодиак", 310, "Электронная музыка");
        AudioTrack track3 = new AudioTrack("Тучи", "Иванушки International", 265, "Поп");
        AudioTrack track4 = new AudioTrack("Я свободен", "Кипелов", 335, "Хард-рок");
        AudioTrack track5 = new AudioTrack("Если у вас нету тети", "Олег Анофриев", 140, "Ретро");

        track1.displayTrackInfo();
        track2.displayTrackInfo();
        track3.displayTrackInfo();
        track4.displayTrackInfo();
        track5.displayTrackInfo();


// Вывод для 2 задачи:

        Message msg1 = new Message("Елена", "Катя", "Привет, как дела?");
        Message msg2 = new Message("Настя", "Света", "Пойдем прогуляемся!");
        Message msg3 = new Message("Николай", "Алексей", "Во сколько пойдем сегодня на тренировку?");

        System.out.println("Сообщение от Елена?" + msg1.isFrom("Елена"));
        System.out.println("Сообщение от Настя?" + msg2.isFrom("Настя"));
        System.out.println("Сообщение от Николай?" + msg3.isFrom("Николай"));


        System.out.println("Превью сообщения 1 (10 символов): " + msg1.shortPreview(10));
        System.out.println("Превью сообщения 2 (15 символов): " + msg2.shortPreview(15));
        System.out.println("Превью сообщения 3 (20 символов): " + msg3.shortPreview(20));

        // Вывод всех сообщений
        System.out.println("\nПолные сообщения:");
        msg1.displayMessage();
        msg2.displayMessage();
        msg3.displayMessage();


        // Вывод для 3 задачи:

        Task task1 = new Task("Сдать домашку", "Завершить и отправить домашку до дедлайна", 1);
        Task task2 = new Task("Купить продукты", "овощи, фрукты, гречка, кофе", 4);
        Task task3 = new Task("Позвонить родителям", "Обсудить детали поездки", 3);
        Task task4 = new Task("Посмотреть 22 урок по программированию", "Вечером повторить", 2);

        // Вывод информации о задачах
        System.out.println("\nСписок задач:");
        task1.displayTask();
        task2.displayTask();
        task3.displayTask();
        task4.displayTask();


    }
}

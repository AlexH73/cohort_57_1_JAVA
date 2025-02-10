package Homework.lesson_21;

public class TaskTest {
    public static void main(String[] args) {
        //Создаем несколько объектов Task с разными приоритетами
        Task task1 = new Task("Сделать отчет" , 1);
        Task task2 = new Task("Позвонить клиенту" , 3);
        Task task3 = new Task("Подготовить презентацию" , 7);
        Task task4 = new Task("Обновить документацию" , 2);

        // Вызываем метод displayTask() для каждого объекта, чтобы увидеть информацию
        task1.displayTask();
        task2.displayTask();
        task3.displayTask();
        task4.displayTask();
    }
}

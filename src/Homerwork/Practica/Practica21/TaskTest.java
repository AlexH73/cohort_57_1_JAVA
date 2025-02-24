package Homerwork.Practica.Practica21;

public class TaskTest {
    public static void main(String[] args) {
        //Тестируем класс
        Task task = new Task("Разработка", "написать код", "Новая");
        task.displayTask();
        System.out.println("-----------------------");

        //Обновляем статус
        task.updateStatus("В процессе");
        task.displayTask();
    }
}

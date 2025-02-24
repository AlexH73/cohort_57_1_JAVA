package Homerwork.Practica.Practica21;
// TODO: Определить поля

// TODO: Реализовать метод `updateStatus(String newStatus)`

// TODO: Реализовать метод `displayTask()`
public class Task {
    String title;
    String description;
    String status;

    public Task(String title, String description, String status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }

    //Метод для обновления статуса задачи
    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Статус задачи обновлен: " + newStatus);
    }

    //Метод для отображения информации щ задаче
    public void displayTask() {
        System.out.println("Название: " + title);
        System.out.println("Описание: " + description);
        System.out.println("Статус: " + status);
    }
}

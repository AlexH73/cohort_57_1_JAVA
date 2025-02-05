package Practice.Practice_21;

// TODO: [х]Создать класс Task
// 1.[х]Добавить поля:
//    [х]- `title` (String) - Название задачи
//    [х]- `description` (String) - Краткое описание задачи
//    [х]- `status` (String) - Статус задачи (например, "Новая", "В процессе", "Выполнена")
// 2.[х]Реализовать метод `updateStatus(String newStatus)`, который обновляет статус задачи.
// 3.[х]Реализовать метод `displayTask()`, который выводит всю информацию о задаче.

class Task {
    String title;
    String description;
    String status;

    // Конструктор класса Task
    public Task(String taskTitle, String taskDescription, String taskStatus) {
        title = taskTitle;
        description = taskDescription;
        status = taskStatus;
    }

    // Метод для обновления статуса задачи
    public void updateStatus(String newStatus) {
        status = newStatus;
    }

    // Метод для отображения информации о задаче
    public void displayTask() {
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
    }

    @Override
    public String toString() {
        return "Task {" + "Title: " + title  +
                " Status: " + status  +
                "}";
    }
}

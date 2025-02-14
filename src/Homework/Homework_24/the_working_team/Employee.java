package Homework.Homework_24.the_working_team;

// TODO: Переопределить метод `work()` в подклассах и использовать `super`.
// 1. `Employee` (базовый класс) содержит `work()`, который выводит "Работник выполняет свою работу."
// 2. `Manager` переопределяет `work()` и добавляет "Проводит встречи."
// 3. `Developer` переопределяет `work()` и добавляет "Пишет код."

public class Employee {
    private String name;
    private String position;

    // Конструктор
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Метод work()
    public void work() {
        System.out.println("\nРаботник выполняет свою работу.");
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }
}

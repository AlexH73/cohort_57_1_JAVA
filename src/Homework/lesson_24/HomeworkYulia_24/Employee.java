// // TODO: Переопределить метод `work()` в подклассах и использовать `super`.
/// / 1. `Employee` (базовый класс) содержит `work()`, который выводит "Работник выполняет свою работу."
/// / 2. `Manager` переопределяет `work()` и добавляет "Проводит встречи."
/// / 3. `Developer` переопределяет `work()` и добавляет "Пишет код."


package Homework.lesson_24.HomeworkYulia_24;

public class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void work() {
        System.out.println(name + "-работник выполняет свою работу.");
    }
}

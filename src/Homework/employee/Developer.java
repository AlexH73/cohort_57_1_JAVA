package Homework.employee;

//TODO: Переопределить метод `work()` в подклассах и использовать `super`.
// 1. `Employee` (базовый класс) содержит `work()`, который выводит "Работник выполняет свою работу."
// 2. `Manager` переопределяет `work()` и добавляет "Проводит встречи."
// 3. `Developer` переопределяет `work()` и добавляет "Пишет код."


class Developer extends Employee {

    public Developer(String name, String position) {
        super(name, position);
    }
    @Override
    public void work() {
        super.work();
        System.out.println("Пишет код");
    }
}
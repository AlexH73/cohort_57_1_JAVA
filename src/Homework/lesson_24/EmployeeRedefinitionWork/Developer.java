package Homework.lesson_24.EmployeeRedefinitionWork;
// 3. `Developer` переопределяет `work()` и добавляет "Пишет код."

//Подкласс Developer, наследуется от Employee
public class Developer extends Employee {

    //Конструктор
    public Developer(String name) {
        super(name, "Разработчик");
    }
    //Переопределенный метод work()
    @Override
    public void work() {
        super.work(); //Вызывает метод work() родительского класса
        System.out.println("Пишет код.");
    }
}

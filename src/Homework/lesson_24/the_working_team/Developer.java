package Homework.lesson_24.the_working_team;

public class Developer extends Manager {

    // Конструктор
    public Developer(String name, String position) {
        super(name, position);
    }

    // Переопределение метода work()
    @Override
    public void work() {
        // System.out.println("\nРаботник выполняет свою работу.");

        // подразумевался вызов метода из родительского класса, так как надо учиться переиспользовать код.
        // Логики может быть чем 1-2 строки, зачем ее переписывать?
        super.work();
        System.out.println("Пишет код.");
    }
}

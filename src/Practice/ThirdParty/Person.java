package Practice.ThirdParty;

public class Person {
    /**
     * <h1>Класс Person</h1>
     * <b>Создать класс Person, который содержит: </b>
     * <p>
     * переменные fullName, age;<br>
     * методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".<br>
     * Добавьте два конструктора  - Person() и Person(fullName, age).<br>
     * Создайте два объекта этого класса. Один объект инициализируется конструктором Person(),
     * другой - Person(fullName, age).<br>
     * Вызовите методы move() и talk().<br>
     */
    private String fullName;
    private int age;

    // Конструктор без параметров
    public Person() {
    }

    // Конструктор с параметрами
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Метод для движения
    public void move() {
        System.out.println(fullName + " движется");
    }

    // Метод для разговора
    public void talk() {
        System.out.println(fullName + " говорит");
    }

    // Геттер для поля fullName
    public String getFullName() {
        return fullName;
    }

    // Сеттер для поля fullName
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // Геттер для поля age
    public int getAge() {
        return age;
    }

    // Сеттер для поля age
    public void setAge(int age) {
        this.age = age;
    }
}

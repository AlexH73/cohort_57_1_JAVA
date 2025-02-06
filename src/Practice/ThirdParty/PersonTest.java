package Practice.ThirdParty;

public class PersonTest {
    public static void main(String[] args) {
        // Создание объектов класса Person
        Person person1 = new Person();
        Person person2 = new Person("Иван Иванов", 30);

        // Инициализация полей для person1
        person1.setFullName("Алексей Петров");
        person1.setAge(25);

        // Вызов методов move и talk для person1
        person1.move();
        person1.talk();

        // Вызов методов move и talk для person2
        person2.move();
        person2.talk();

    }
}

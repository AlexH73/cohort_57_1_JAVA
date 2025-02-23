package Practice.Practice_26.veterinary_clinic;

/**
 * Класс, представляющий человека.
 */
public class Person {
    private String name;
    private int age;
    private String phoneNumber;

    /**
     * Конструктор для инициализации полей.
     *
     * @param name        Имя человека.
     * @param age         Возраст человека.
     * @param phoneNumber Номер телефона человека.
     */
    public Person(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Получить имя человека.
     *
     * @return Имя человека.
     */
    public String getName() {
        return name;
    }

    /**
     * Получить возраст человека.
     *
     * @return Возраст человека.
     */
    public int getAge() {
        return age;
    }

    /**
     * Получить номер телефона человека.
     *
     * @return Номер телефона человека.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Переопределение метода toString() для вывода информации о человеке.
     *
     * @return Строковое представление объекта Person.
     */
    @Override
    public String toString() {
        return Color.CYAN +  name + ", " + age + " лет, Тел: " + phoneNumber + Color.RESET;
    }
}
package Practice.Practice_26.veterinary_clinic;

/**
 * Класс, представляющий животное.
 */
public class Animal {
    private String name;
    private int age;
    private Client owner;

    /**
     * Конструктор для инициализации полей.
     *
     * @param name  Имя животного.
     * @param age   Возраст животного.
     * @param owner Владелец животного.
     */
    public Animal(String name, int age, Client owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    /**
     * Получить имя животного.
     *
     * @return Имя животного.
     */
    public String getName() {
        return name;
    }

    /**
     * Получить возраст животного.
     *
     * @return Возраст животного.
     */
    public int getAge() {
        return age;
    }

    /**
     * Получить владельца животного.
     *
     * @return Владелец животного.
     */
    public Client getOwner() {
        return owner;
    }

    /**
     * Переопределение метода toString() для вывода информации о животном.
     *
     * @return Строковое представление объекта Animal.
     */
    @Override
    public String toString() {
        return VetClinicSystem.Color.PURPLE +  name + ", " + age +
                " лет, Владелец: " + owner.getName() + VetClinicSystem.Color.RESET;
    }
}
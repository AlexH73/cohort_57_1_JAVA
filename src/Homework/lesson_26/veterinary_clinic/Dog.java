package Homework.lesson_26.veterinary_clinic;

/**
 * Класс, представляющий собаку.
 */
class Dog extends Animal {
    /**
     * Конструктор для инициализации полей.
     *
     * @param name  Имя собаки.
     * @param age   Возраст собаки.
     * @param owner Владелец собаки.
     */
    public Dog(String name, int age, Client owner) {
        super(name, age, owner);
    }

    /**
     * Метод, имитирующий лай собаки.
     */
    public void bark() {
        System.out.println(getName() + " гавкает!");
    }
}
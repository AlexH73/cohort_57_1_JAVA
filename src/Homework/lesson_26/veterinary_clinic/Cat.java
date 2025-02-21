package Homework.lesson_26.veterinary_clinic;

/**
 * Класс, представляющий кошку.
 */
class Cat extends Animal {
    /**
     * Конструктор для инициализации полей.
     *
     * @param name  Имя кошки.
     * @param age   Возраст кошки.
     * @param owner Владелец кошки.
     */
    public Cat(String name, int age, Client owner) {
        super(name, age, owner);
    }

    /**
     * Метод, имитирующий мяуканье кошки.
     */
    public void meow() {
        System.out.println(getName() + " мяукает!");
    }
}
package Homework.Homework_24.part1_animal;

public class Dog extends Animal { ;

    // Конструктор
    public Dog(String name, int age) {
        super(name, age);
    }

    // Переопределение метода makeSound() для класса Dog
    @Override
    public void makeSound() {
        System.out.println("Собака по кличке " + getName() + " говорит 'Гав!'");
    }
}

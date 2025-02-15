package Homework.lesson_24;
//Подкласс Dog, который наследует Animal
 public class DogAnimal extends Animal{

    //Конструктор
    public DogAnimal(String name, int age) {
        super(name, age);
    }
    //Переопределенный метод makeSound() {
    @Override
    public void makeSound() {
        System.out.println("Гав!");
    }

}

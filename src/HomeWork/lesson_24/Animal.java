package HomeWork.lesson_24;

public class Animal {
    private String name;
    private int age;

    public void makeSound(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal " +
                ", name = " + name +
                ", age = " + age;
    }
}

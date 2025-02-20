package Practice.Practice_26.veterinary_clinic;

public class Animal {
    private String name;
    private int age;
    private Client owner;

    public Animal(String name, int age, Client owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public Client getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return name + ", " + age + " лет, Владелец: " + owner.getName();
    }
}
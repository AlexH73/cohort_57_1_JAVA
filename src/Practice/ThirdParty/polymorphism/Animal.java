package Practice.ThirdParty.polymorphism;

abstract class Animal {
    protected String name;    // Имя животного
    protected String species; // Вид животного
    protected int age;        // Возраст

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public abstract String makeSound();  // Абстрактный метод

    public String getInfo() {
        return "Животное {" +
                "имя='" + name + '\'' +
                ", вид='" + species + '\'' +
                ", возраст=" + age + "лет" +
                '}';
    }
}
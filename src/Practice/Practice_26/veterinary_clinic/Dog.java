package Practice.Practice_26.veterinary_clinic;

class Dog extends Animal{
    public Dog(String name, int age, Client owner) {
        super(name, age, owner);
    }

    public void bark() {
        System.out.println(getName() + " гавкает!");
    }
}
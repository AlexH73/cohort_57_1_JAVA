package Practice.Practice_26.veterinary_clinic;

class Cat extends Animal{
    public Cat(String name, int age, Client owner) {
        super(name, age, owner);
    }

    public void meow() {
        System.out.println(getName() + " мяукает!");
    }

}
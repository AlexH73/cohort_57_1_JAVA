package Practice.ThirdParty.polymorphism.zoo;

class Elephant extends Animal {
    public Elephant(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    public String makeSound() {
        return this.species + " по имени " + this.name + " издает звук \"УУУУУ!!\"";
    }

}
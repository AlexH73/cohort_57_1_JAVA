package Practice.ThirdParty.polymorphism;

class Monkey extends Animal {
    public Monkey(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    public String makeSound () {
        return this.species + " по имени " + this.name + " издает звук \"Ooh Ooh Aah Aah!!\"";
    }

}
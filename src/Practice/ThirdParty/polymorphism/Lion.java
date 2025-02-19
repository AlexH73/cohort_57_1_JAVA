package Practice.ThirdParty.polymorphism;

class Lion extends Animal {
    public Lion(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    public String makeSound() {
        return this.species + " по имени " + this.name + " издает звук \"РРРРР!!\"";
    }
}
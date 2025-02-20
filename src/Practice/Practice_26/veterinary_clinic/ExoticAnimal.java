package Practice.Practice_26.veterinary_clinic;

class ExoticAnimal extends Animal {
    private String species;

    public ExoticAnimal(String name, int age, Client owner, String species) {
        super(name, age, owner);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }
}
package Lessons.Lesson_26.student_code;

public class ExoticAnimal extends Animal {
    private String species;

    public ExoticAnimal(String name, int age, Client owner, String species) {
        super(name, age, owner);
        this.species = species;
    }

    @Override
    public String toString() {
        String baseInformation = super.toString();
        return baseInformation + ", Вид:" + species;

    }
}



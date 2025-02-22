package Lessons.Lesson_26.student_code;
public class Veterinarian extends Person{
    private String specialization;

    public Veterinarian(String name, int age, String phoneNumber, String specialization) {
        super(name, age, phoneNumber);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        String baseInformanion = super.toString();
        return baseInformanion  +
                ", Специальность: " + specialization;

    }
}


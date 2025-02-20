package Lessons.Lesson_26.student_code;
/*✔ Veterinarian – наследует Person, добавляет поле specialization.*/
public class Veterinarian extends Person{
    private String specialization;

    public Veterinarian(int age, String name, String phoneNumber, String specialization) {
        super(age, name, phoneNumber);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        String baseInformanion = super.toString();
        return baseInformanion  +
                " , specialization='" + specialization;

    }
}


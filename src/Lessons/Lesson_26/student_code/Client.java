package Lessons.Lesson_26.student_code;

public class Client extends Person{
    private String pets;

    public Client(int age, String name, int phoneNumber, String pets) {
        super(age,name,phoneNumber);
        this.pets =pets;
    }

    public String getPets() {
        return pets;
    }

    public void setPets(String pets) {
        this.pets = pets;
    }
}

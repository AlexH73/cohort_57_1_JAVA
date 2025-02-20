package Lessons.Lesson_26.student_code;

public class Appointment {
    private String date;
    private Animal animal;
    private Veterinarian veterinarian;
    private String diagnosis;

    public Appointment(String date, Animal animal, Veterinarian veterinarian, String diagnosis) {
        this.date = date;
        this.animal = animal;
        this.veterinarian = veterinarian;
        this.diagnosis = "Keine Diagnose";
    }

    public void conductCheckup(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "date='" + date + '\'' +
                ", animal=" + animal +
                ", veterinarian=" + veterinarian +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}

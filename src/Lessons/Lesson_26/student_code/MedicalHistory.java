package Lessons.Lesson_26.student_code;

import java.util.Arrays;

/*✔ MedicalHistory – хранит список Appointment для конкретного животного.
✔ Метод addAppointment(), который добавляет новый визит питомца в историю.*/
public class MedicalHistory {
    private Animal animal;
    private Appointment[] appointments;

    public MedicalHistory(Animal animal, Appointment[] appointments) {
        this.animal = animal;
        this.appointments = appointments;
    }
    public MedicalHistory(Animal animal, Appointment appointment) {
        this.animal = animal;
        this.appointments = new Appointment[1];
        this.appointments[0] = appointment;
    }

    public void addAppointment(Appointment appointment) {
        //int[] newArray = Arrays.copyOf(originalArray, newLength);
        appointments = Arrays.copyOf(appointments, appointments.length + 1);
        appointments[appointments.length - 1] = appointment;
    }


}

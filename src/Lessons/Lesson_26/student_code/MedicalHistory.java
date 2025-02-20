package Lessons.Lesson_26.student_code;

import java.util.Arrays;

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
        appointments = Arrays.copyOf(appointments, appointments.length + 1);
        appointments[appointments.length - 1] = appointment;
    }
}

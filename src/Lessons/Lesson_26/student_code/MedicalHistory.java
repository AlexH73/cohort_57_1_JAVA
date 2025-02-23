package Lessons.Lesson_26.student_code;

class MedicalHistory {
    private Appointment[] appointments;
    private int appointmentCount;
    private static final int MAX_APPOINTMENTS = 100;

    public MedicalHistory() {
        this.appointments = new Appointment[MAX_APPOINTMENTS];
        this.appointmentCount = 0;
    }

    public boolean addAppointment(Appointment appointment) {
        if (appointmentCount < MAX_APPOINTMENTS) {
            appointments[appointmentCount++] = appointment;
            return true;
        } else {
            System.out.println("Невозможно добавить больше записей в историю.");
            return false;
        }
    }
}

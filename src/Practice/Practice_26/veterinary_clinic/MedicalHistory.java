package Practice.Practice_26.veterinary_clinic;

/**
 * Класс, представляющий медицинскую историю животного.
 */
class MedicalHistory {
    private Appointment[] appointments;
    private int appointmentCount;
    private static final int MAX_APPOINTMENTS = 100;

    /**
     * Конструктор для инициализации массива записей.
     */
    public MedicalHistory() {
        this.appointments = new Appointment[MAX_APPOINTMENTS];
        this.appointmentCount = 0;
    }

    /**
     * Добавить запись о приеме в медицинскую историю.
     *
     * @param appointment Запись о приеме.
     * @return true, если запись добавлена успешно, иначе false.
     */
    public boolean addAppointment(Appointment appointment) {
        if (appointmentCount < MAX_APPOINTMENTS) {
            appointments[appointmentCount++] = appointment;
            System.out.println(Color.GREEN + "Добавлена запись о приеме:  " +
                    Color.RESET + appointment);
            return true;
        } else {
            System.out.println(Color.RED +
                    "Невозможно добавить больше записей в историю." + Color.RESET);
            return false;
        }
    }

    /**
     * Показать всю медицинскую историю.
     */
    public void showHistory() {
        if (appointmentCount == 0) {
            System.out.println(Color.RED + "Медицинская история пуста." + Color.RESET);
        } else {
            System.out.println(Color.BLUE + "\n=== Медицинская история ===" + Color.RESET);
            for (int i = 0; i < appointmentCount; i++) {
                System.out.println(appointments[i]);
            }
        }
    }
}
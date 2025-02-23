package Homework.lesson_26.veterinary_clinic;

/**
 * Класс, представляющий запись о приеме.
 */
class Appointment {
    private String date;
    private Animal animal;
    private Veterinarian veterinarian;
    private String diagnosis;

    /**
     * Конструктор для инициализации полей.
     *
     * @param date        Дата приема.
     * @param animal      Животное, пришедшее на прием.
     * @param veterinarian Ветеринар, проводящий прием.
     */
    public Appointment(String date, Animal animal, Veterinarian veterinarian) {
        this.date = date;
        this.animal = animal;
        this.veterinarian = veterinarian;
        this.diagnosis = "Не установлен";
    }

    /**
     * Провести осмотр и установить диагноз.
     *
     * @param diagnosis Диагноз, установленный при осмотре.
     */
    public void conductCheckup(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * Переопределение метода toString() для вывода информации о приеме.
     *
     * @return Строковое представление записи о приеме.
     */
    @Override
    public String toString() {
        return "Дата: " + VetClinicSystem.Color.YELLOW.code + date + VetClinicSystem.Color.RESET.code +
                ", Животное: " + VetClinicSystem.Color.CYAN.code + animal.getName() + VetClinicSystem.Color.RESET.code +
                ", Врач: " + VetClinicSystem.Color.CYAN.code + veterinarian.getName() + VetClinicSystem.Color.RESET.code +
                ", Диагноз: " + VetClinicSystem.Color.PURPLE.code + diagnosis + VetClinicSystem.Color.RESET.code;
    }
}
package Practice.Practice_26.veterinary_clinic;

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
        return "Дата: " + Color.YELLOW + date + Color.RESET +
                ", Животное: " + Color.CYAN + animal.getName() + Color.RESET +
                ", Врач: " + Color.CYAN + veterinarian.getName() + Color.RESET +
                ", Диагноз: " + Color.PURPLE + diagnosis + Color.RESET;
    }
}
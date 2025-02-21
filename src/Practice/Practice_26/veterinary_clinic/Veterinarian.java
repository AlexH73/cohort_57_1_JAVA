package Practice.Practice_26.veterinary_clinic;

/**
 * Класс, представляющий ветеринара.
 */
class Veterinarian extends Person {
    private String specialization;

    /**
     * Конструктор для инициализации полей.
     *
     * @param name          Имя ветеринара.
     * @param age           Возраст ветеринара.
     * @param phoneNumber   Номер телефона ветеринара.
     * @param specialization Специализация ветеринара.
     */
    public Veterinarian(String name, int age, String phoneNumber, String specialization) {
        super(name, age, phoneNumber);
        this.specialization = specialization;
    }

    /**
     * Получить специализацию ветеринара.
     *
     * @return Специализация ветеринара.
     */
    public String getSpecialization() {
        return specialization;
    }
}
package Practice.Practice_26.veterinary_clinic;

/**
 * Класс, представляющий экзотическое животное.
 */
class ExoticAnimal extends Animal {
    private String species;

    /**
     * Конструктор для инициализации полей.
     *
     * @param name    Имя животного.
     * @param age     Возраст животного.
     * @param owner   Владелец животного.
     * @param species Вид животного.
     */
    public ExoticAnimal(String name, int age, Client owner, String species) {
        super(name, age, owner);
        this.species = species;
    }

    /**
     * Получить вид животного.
     *
     * @return Вид животного.
     */
    public String getSpecies() {
        return species;
    }
}
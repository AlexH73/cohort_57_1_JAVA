package Homework.lesson_26.veterinary_clinic;

/**
 * Класс, представляющий клиента ветеринарной клиники.
 */
class Client extends Person {
    private Animal[] pets;
    private static final int MAX_PETS = 5;
    private int petCount;

    /**
     * Конструктор для инициализации полей.
     *
     * @param name        Имя клиента.
     * @param age         Возраст клиента.
     * @param phoneNumber Номер телефона клиента.
     */
    public Client(String name, int age, String phoneNumber) {
        super(name, age, phoneNumber);
        this.pets = new Animal[MAX_PETS];
        this.petCount = 0;
    }

    /**
     * Добавить питомца к клиенту.
     *
     * @param pet Питомец для добавления.
     * @return true, если питомец добавлен успешно, иначе false.
     */
    public boolean addPet(Animal pet) {
        if (petCount < MAX_PETS) {
            pets[petCount++] = pet;
            System.out.println(VetClinicSystem.Color.GREEN + "Питомец " + pet.getName() +
                    " добавлен к клиенту " + getName() + VetClinicSystem.Color.RESET);
            return true;
        } else {
            System.out.println(VetClinicSystem.Color.RED +
                    "Невозможно добавить больше питомцев к клиенту " +
                    getName() + VetClinicSystem.Color.RESET);
            return false;
        }
    }

    /**
     * Получить массив питомцев клиента.
     *
     * @return Массив питомцев.
     */
    public Animal[] getPets() {
        return pets;
    }
}
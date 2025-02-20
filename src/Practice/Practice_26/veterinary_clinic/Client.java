package Practice.Practice_26.veterinary_clinic;

class Client extends Person {
    private Animal[] pets;
    private static final int MAX_PETS = 5;
    private int petCount;

    public Client(String name, int age, String phoneNumber) {
        super(name, age, phoneNumber);
        this.pets = new Animal[MAX_PETS]; // Убедимся, что pets инициализирован
        this.petCount = 0;
        System.out.println("Клиент создан: " + name + ", питомцы: " + pets.length);
    }

    public boolean addPet(Animal pet) {
        if (pets == null) { // Проверка на null
            System.out.println("Ошибка: pets не инициализирован!");
            return false;
        }
        if (petCount < MAX_PETS) {
            pets[petCount++] = pet;
            return true;
        } else {
            System.out.println("Невозможно добавить больше питомцев.");
            return false;
        }
    }
}

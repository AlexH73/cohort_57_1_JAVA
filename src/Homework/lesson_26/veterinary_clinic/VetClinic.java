package Homework.lesson_26.veterinary_clinic;

/**
 * Класс, представляющий ветеринарную клинику.
 */
class VetClinic {
    private Client[] clients;
    private Veterinarian[] veterinarians;
    private int clientCount;
    private int vetCount;

    /**
     * Конструктор для инициализации массивов клиентов и ветеринаров.
     */
    public VetClinic() {
        this.clients = new Client[10];
        this.veterinarians = new Veterinarian[5];
        this.clientCount = 0;
        this.vetCount = 0;
    }

    /**
     * Зарегистрировать клиента в клинике.
     *
     * @param client Клиент для регистрации.
     */
    public void registerClient(Client client) {
        if (clientCount < clients.length) {
            clients[clientCount++] = client;
            System.out.println("Клиент " + VetClinicSystem.Color.YELLOW + client.getName() +
                    VetClinicSystem.Color.GREEN + " зарегистрирован в клинике." + VetClinicSystem.Color.RESET);
        } else {
            System.out.println(VetClinicSystem.Color.RED + "Клиника не может принять больше клиентов." +
                    VetClinicSystem.Color.RESET);
        }
    }

    /**
     * Добавить ветеринара в клинику.
     *
     * @param vet Ветеринар для добавления.
     */
    public void addVeterinarian(Veterinarian vet) {
        if (vetCount < veterinarians.length) {
            veterinarians[vetCount++] = vet;
            System.out.println("Ветеринар " + VetClinicSystem.Color.YELLOW + vet.getName() +
                    VetClinicSystem.Color.GREEN + " добавлен в клинику." + VetClinicSystem.Color.RESET);
        } else {
            System.out.println(VetClinicSystem.Color.RED +
                    "Клиника не может принять больше ветеринаров." + VetClinicSystem.Color.RESET);
        }
    }

    /**
     * Найти ветеринара по специализации.
     *
     * @param specialization Специализация ветеринара.
     * @return Ветеринар, если найден, иначе null.
     */
    public Veterinarian findVeterinarianBySpecialization(String specialization) {
        for (Veterinarian vet : veterinarians) {
            if (vet != null && vet.getSpecialization().equals(specialization)) {
                return vet;
            }
        }
        return null;
    }

    /**
     * Назначить встречу животного с ветеринаром.
     *
     * @param animal      Животное для осмотра.
     * @param veterinarian Ветеринар для встречи.
     * @param date        Дата встречи.
     */
    public void scheduleAppointment(Animal animal, Veterinarian veterinarian, String date) {
        if (veterinarian.getSpecialization().contains("Собаки") && animal instanceof Dog ||
                veterinarian.getSpecialization().contains("Кошки") && animal instanceof Cat ||
                veterinarian.getSpecialization().contains("Экзотические") && animal instanceof ExoticAnimal) {
            System.out.println("Запись: " + VetClinicSystem.Color.CYAN + animal.getName() + " к " + veterinarian.getName() +
                    " на " + VetClinicSystem.Color.YELLOW + date + VetClinicSystem.Color.RESET);
        } else {
            System.out.println(VetClinicSystem.Color.RED + "Ошибка: Врач " +
                    veterinarian.getName() + " не специализируется на данном виде животных." +
                    VetClinicSystem.Color.RESET);
        }
    }
}
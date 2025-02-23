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
        // я понимаю, что мы в перспективе перейдем к List и вы уже понимаете эти стркутуры данных,
        // но при этом нет механизма увеличения размера
        // ((((((((((((Решено)))))))))))))
        this.clients = new Client[10];
        this.veterinarians = new Veterinarian[5];
        this.clientCount = 0;
        this.vetCount = 0;
    }

    /**
     * Увеличить размер массива клиентов при необходимости.
     */
    private void expandClientArray() {
        Client[] newClients = new Client[clients.length * 2];
        System.arraycopy(clients, 0, newClients, 0, clients.length);
        clients = newClients;
    }

    /**
     * Увеличить размер массива ветеринаров при необходимости.
     */
    private void expandVeterinarianArray() {
        Veterinarian[] newVets = new Veterinarian[veterinarians.length * 2];
        System.arraycopy(veterinarians, 0, newVets, 0, veterinarians.length);
        veterinarians = newVets;
    }

    /**
     * Зарегистрировать клиента в клинике.
     *
     * @param client Клиент для регистрации.
     */
    public void registerClient(Client client) {
        if (clientCount >= clients.length) {
            expandClientArray();
        }
        clients[clientCount++] = client;
        System.out.println("Клиент " + VetClinicSystem.Color.YELLOW.code + client.getName() +
                VetClinicSystem.Color.GREEN.code + " зарегистрирован в клинике." + VetClinicSystem.Color.RESET.code);
    }

    /**
     * Добавить ветеринара в клинику.
     *
     * @param vet Ветеринар для добавления.
     */
    public void addVeterinarian(Veterinarian vet) {
        if (vetCount >= veterinarians.length) {
            expandVeterinarianArray();
        }
        veterinarians[vetCount++] = vet;
        System.out.println("Ветеринар " + VetClinicSystem.Color.YELLOW.code + vet.getName() +
                VetClinicSystem.Color.GREEN.code + " добавлен в клинику." + VetClinicSystem.Color.RESET.code);
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
     * @param animal       Животное для осмотра.
     * @param veterinarian Ветеринар для встречи.
     * @param date         Дата встречи.
     */
    public void scheduleAppointment(Animal animal, Veterinarian veterinarian, String date) {
        if (veterinarian.getSpecialization().contains("Собаки") && animal instanceof Dog ||
                veterinarian.getSpecialization().contains("Кошки") && animal instanceof Cat ||
                veterinarian.getSpecialization().contains("Экзотические") && animal instanceof ExoticAnimal) {
            System.out.println("Запись: " + VetClinicSystem.Color.CYAN.code + animal.getName() + " к " + veterinarian.getName() +
                    " на " + VetClinicSystem.Color.YELLOW.code + date + VetClinicSystem.Color.RESET.code);
        } else {
            System.out.println(VetClinicSystem.Color.RED.code + "Ошибка: Врач " +
                    veterinarian.getName() + " не специализируется на данном виде животных." +
                    VetClinicSystem.Color.RESET.code);
        }
    }
}
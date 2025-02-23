package Practice.Practice_26.veterinary_clinic;

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
        System.out.println("Клиент " + Color.YELLOW + client.getName() +
                Color.GREEN + " зарегистрирован в клинике." + Color.RESET);
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
        System.out.println("Ветеринар " + Color.YELLOW + vet.getName() +
                Color.GREEN + " добавлен в клинику." + Color.RESET);
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
            System.out.println("Запись: " + Color.CYAN + animal.getName() + " к " + veterinarian.getName() +
                    " на " + Color.YELLOW + date + Color.RESET);
        } else {
            System.out.println(Color.RED + "Ошибка: Врач " +
                    veterinarian.getName() + " не специализируется на данном виде животных." +
                    Color.RESET);
        }
    }
}
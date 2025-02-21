package Practice.Practice_26.veterinary_clinic;

class VetClinic {
    private Client[] clients;
    private Veterinarian[] veterinarians;
    private int clientCount;
    private int vetCount;

    public VetClinic() {
        this.clients = new Client[10];
        this.veterinarians = new Veterinarian[5];
        this.clientCount = 0;
        this.vetCount = 0;
    }

    public void registerClient(Client client) {
        if (clientCount < clients.length) {
            clients[clientCount++] = client;
            System.out.println("Клиент " + client.getName() + " зарегистрирован в клинике.");
        } else {
            System.out.println("Клиника не может принять больше клиентов.");
        }
    }

    public void addVeterinarian(Veterinarian vet) {
        if (vetCount < veterinarians.length) {
            veterinarians[vetCount++] = vet;
            System.out.println("Ветеринар " + vet.getName() + " добавлен в клинику.");
        } else {
            System.out.println("Клиника не может принять больше ветеринаров.");
        }
    }

    public Veterinarian findVeterinarianBySpecialization(String specialization) {
        for (Veterinarian vet : veterinarians) {
            if (vet != null && vet.getSpecialization().equals(specialization)) {
                return vet;
            }
        }
        return null;
    }

    public void scheduleAppointment(Animal animal, Veterinarian veterinarian, String date) {
        if (veterinarian.getSpecialization().contains("Собаки") && animal instanceof Dog ||
                veterinarian.getSpecialization().contains("Кошки") && animal instanceof Cat ||
                veterinarian.getSpecialization().contains("Экзотические") && animal instanceof ExoticAnimal) {
            System.out.println("Запись: " + animal.getName() + " к " + veterinarian.getName() + " на " + date);
        } else {
            System.out.println("Ошибка: Врач " + veterinarian.getName() + " не специализируется на данном виде животных.");
        }
    }
}
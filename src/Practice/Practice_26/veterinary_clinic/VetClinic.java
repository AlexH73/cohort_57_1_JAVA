package Practice.Practice_26.veterinary_clinic;

class VetClinic {
    private Client[] clients = new Client[10];
    private Veterinarian[] veterinarians = new Veterinarian[5];
    private int clientCount = 0;
    private int vetCount = 0;

    public void registerClient(Client client) {
        if (clientCount < clients.length) {
            clients[clientCount++] = client;
        }
    }

    public void addVeterinarian(Veterinarian vet) {
        if (vetCount < veterinarians.length) {
            veterinarians[vetCount++] = vet;
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
            System.out.println("Ошибка: Врач " + veterinarian.getName() + " не специализируется на данном животном.");
        }
    }
}

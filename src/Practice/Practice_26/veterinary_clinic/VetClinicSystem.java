package Practice.Practice_26.veterinary_clinic;

class VetClinicSystem {
    public static void main(String[] args) {
        VetClinic clinic = new VetClinic();

        Client client1 = new Client("Иван Петров", 35, "123-456-789");
        Client client2 = new Client("Анна Смирнова", 28, "987-654-321");
        Client client3 = new Client("Сергей Иванов", 40, "111-222-333");

        Dog dog1 = new Dog("Бобик", 5, client1);
        Dog dog2 = new Dog("Шарик", 2, client3);
        Cat cat1 = new Cat("Мурка", 3, client2);
        ExoticAnimal parrot = new ExoticAnimal("Кеша", 2, client1, "Попугай");
        ExoticAnimal snake = new ExoticAnimal("Гадюка", 4, client3, "Змея");

        client1.addPet(dog1);
        client1.addPet(parrot);
        client2.addPet(cat1);
        client3.addPet(dog2);
        client3.addPet(snake);

        Veterinarian vet1 = new Veterinarian("Доктор Айболит", 45, "555-1234", "Собаки и кошки");
        Veterinarian vet2 = new Veterinarian("Доктор Зоолог", 50, "555-5678", "Экзотические животные");
        Veterinarian vet3 = new Veterinarian("Доктор Грызунов", 38, "555-9999", "Грызуны");

        clinic.registerClient(client1);
        clinic.registerClient(client2);
        clinic.registerClient(client3);
        clinic.addVeterinarian(vet1);
        clinic.addVeterinarian(vet2);
        clinic.addVeterinarian(vet3);

        clinic.scheduleAppointment(dog1, vet1, "2025-03-01");
        clinic.scheduleAppointment(cat1, vet1, "2025-03-02");
        clinic.scheduleAppointment(parrot, vet2, "2025-03-03");
        clinic.scheduleAppointment(dog2, vet1, "2025-03-04");
        clinic.scheduleAppointment(snake, vet2, "2025-03-05");
    }
}

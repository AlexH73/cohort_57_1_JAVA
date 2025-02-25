package Lessons.Lesson_26.student_code;

public class Main {
    public static void main(String[] args) {
        VetClinic clinic = new VetClinic();
        Client client1 = new Client("Иван Петров", 35, "123-456-789");
        Client client2 = new Client("Анна Смирнова", 28, "987-654-321");

        Dog dog1 = new Dog("Бобик", 5, client1);
        Cat cat1 = new Cat("Мурка", 3, client2);
        ExoticAnimal parrot = new ExoticAnimal("Кеша", 2, client1, "Попугай");

        client1.addPet(dog1);
        client1.addPet(parrot);
        client2.addPet(cat1);

        Veterinarian vet1 = new Veterinarian("Доктор Айболит", 45, "555-1234", "Собаки и кошки");
        Veterinarian vet2 = new Veterinarian("Доктор Зоолог", 50, "555-5678", "Экзотические животные");

        clinic.registerClient(client1);
        clinic.registerClient(client2);
        clinic.addVeterinarian(vet1);
        clinic.addVeterinarian(vet2);

        clinic.scheduleAppointment(dog1, vet1, "2025-03-01");
        clinic.scheduleAppointment(cat1, vet1, "2025-03-02");
        clinic.scheduleAppointment(parrot, vet2, "2025-03-03");

        clinic.showAllAppointments();
    }
}

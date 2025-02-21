package Practice.Practice_26.veterinary_clinic;

public class VetClinicSystem {
    public static void main(String[] args) {
        System.out.println("=== Регистрация клиентов и питомцев ===");
        VetClinic clinic = new VetClinic();

        Client client1 = new Client("Иван Петров", 35, "123-456-789");
        Client client2 = new Client("Анна Смирнова", 28, "987-654-321");
        Client client3 = new Client("Сергей Иванов", 40, "111-222-333");
        Client client4 = new Client("Мария Кузнецова", 30, "222-333-444");
        Client client5 = new Client("Олег Никифоров", 25, "333-444-555");

        Dog dog1 = new Dog("Бобик", 5, client1);
        Dog dog2 = new Dog("Шарик", 2, client3);
        Cat cat1 = new Cat("Мурка", 3, client2);
        Cat cat2 = new Cat("Барсик", 4, client4);
        ExoticAnimal parrot = new ExoticAnimal("Кеша", 2, client1, "Попугай");
        ExoticAnimal snake = new ExoticAnimal("Гадюка", 4, client3, "Змея");
        ExoticAnimal turtle = new ExoticAnimal("Черепаха", 10, client5, "Пресноводная");

        client1.addPet(dog1);
        client1.addPet(parrot);
        client2.addPet(cat1);
        client3.addPet(dog2);
        client3.addPet(snake);
        client4.addPet(cat2);
        client5.addPet(turtle);

        clinic.registerClient(client1);
        clinic.registerClient(client2);
        clinic.registerClient(client3);
        clinic.registerClient(client4);
        clinic.registerClient(client5);

        System.out.println("\n=== Добавление ветеринаров ===");

        Veterinarian vet1 = new Veterinarian("Доктор Айболит", 45, "555-1234", "Собаки и кошки");
        Veterinarian vet2 = new Veterinarian("Доктор Зоолог", 50, "555-5678", "Экзотические животные");
        Veterinarian vet3 = new Veterinarian("Доктор Грызунов", 38, "555-9999", "Грызуны");
        Veterinarian vet4 = new Veterinarian("Доктор Котиков", 42, "555-1111", "Кошки");

        clinic.addVeterinarian(vet1);
        clinic.addVeterinarian(vet2);
        clinic.addVeterinarian(vet3);
        clinic.addVeterinarian(vet4);

        System.out.println("\n=== Запись на прием ===");

        clinic.scheduleAppointment(dog1, vet1, "2025-03-01");
        clinic.scheduleAppointment(cat1, vet1, "2025-03-02");
        clinic.scheduleAppointment(parrot, vet2, "2025-03-03");
        clinic.scheduleAppointment(dog2, vet1, "2025-03-04");
        clinic.scheduleAppointment(snake, vet2, "2025-03-05");
        clinic.scheduleAppointment(turtle, vet2, "2025-03-06");
        clinic.scheduleAppointment(cat2, vet4, "2025-03-07");
        clinic.scheduleAppointment(dog1, vet3, "2025-03-08"); // Ошибка: неправильная специализация



        // Врачи
        Veterinarian vet21 = new Veterinarian("Иванов Иван Иванович", 55, "333-4445", "Собаки");
        Veterinarian vet22 = new Veterinarian("Петрова Анна Сергеевна", 33,"111-7778","Кошки");
        Veterinarian vet23 = new Veterinarian("Иванов Иван Иванович", 55, "333-4445", "Собаки"); // Дубликат имени, для проверки обработки ошибок
        Veterinarian vet24 = new Veterinarian("Доктор Айболит", 45, "555-1234", "Собаки и кошки");
        Veterinarian vet5 = new Veterinarian("Доктор Зоолог", 50, "555-5678", "Экзотические животные");
        Veterinarian vet6 = new Veterinarian("Доктор Грызунов", 38, "555-9999", "Грызуны");

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
/*

        System.out.println("===============================================");


        VetClinic clinic2 = new VetClinic();

        // Клиенты
        Client client25 = new Client("Иван Петров", 35, "123-456-789");
        Client client26 = new Client("Анна Смирнова", 28, "987-654-321");
        Client client27 = new Client("Сергей Иванов", 40, "111-222-333");

        // Животные
        Cat cat5 = new Cat("Мурка", 3, client1);
        Dog dog5 = new Dog("Бобик", 5, client1);
        Cat cat6 = new Cat("Снежок", 1, client1);
        Dog dog6 = new Dog("Рекс", 8, client1);
        Cat cat7 = new Cat("Мурка", 2, client1);
        Dog dog7 = new Dog("Бобик", 5, client1);
        Dog dog8 = new Dog("Шарик", 2, client3);
        Cat cat9 = new Cat("Мурка", 3, client2);
        ExoticAnimal parrot1 = new ExoticAnimal("Кеша", 2, client1, "Попугай");
        ExoticAnimal snake1 = new ExoticAnimal("Гадюка", 4, client3, "Змея");

        client1.addPet(dog1);
        client1.addPet(parrot);
        client2.addPet(cat1);
        client3.addPet(dog2);
        client3.addPet(snake);

        // Врачи
        Veterinarian vet7 = new Veterinarian("Иванов Иван Иванович", 55, "333-4445", "Собаки");
        Veterinarian vet8 = new Veterinarian("Петрова Анна Сергеевна", 33, "111-7778", "Кошки");
        Veterinarian vet9 = new Veterinarian("Иванов Иван Иванович", 55, "333-4445", "Собаки");
        Veterinarian vet10 = new Veterinarian("Доктор Айболит", 45, "555-1234", "Собаки и кошки");
        Veterinarian vet11 = new Veterinarian("Доктор Зоолог", 50, "555-5678", "Экзотические животные");
        Veterinarian vet12 = new Veterinarian("Доктор Грызунов", 38, "555-9999", "Грызуны");

        // Регистрация клиентов
        try {
            clinic.registerClient(client1);
            System.out.println(Color.GREEN + "Клиент " + client1.getName() + " успешно зарегистрирован." + Color.RESET);
            clinic.registerClient(client2);
            System.out.println(Color.GREEN + "Клиент " + client2.getName() + " успешно зарегистрирован." + Color.RESET);
            clinic.registerClient(client3);
            System.out.println(Color.GREEN + "Клиент " + client3.getName() + " успешно зарегистрирован." + Color.RESET);
        } catch (IllegalArgumentException e) {
            System.out.println(Color.RED + "Ошибка регистрации клиента: " + e.getMessage() + Color.RESET);
        }

        // Добавление ветеринаров
        try {
            clinic.addVeterinarian(vet1);
            System.out.println(Color.GREEN + "Ветеринар " + vet1.getName() + " успешно добавлен." + Color.RESET);
            clinic.addVeterinarian(vet2);
            System.out.println(Color.GREEN + "Ветеринар " + vet2.getName() + " успешно добавлен." + Color.RESET);
            // Попытка добавить ветеринара с тем же именем (для проверки обработки ошибок)
            clinic.addVeterinarian(vet3);
            System.out.println(Color.GREEN + "Ветеринар " + vet3.getName() + " успешно добавлен." + Color.RESET); // Не должно выполниться
        } catch (IllegalArgumentException e) {
            System.out.println(Color.RED + "Ошибка добавления ветеринара: " + e.getMessage() + Color.RESET);
        }

        // Запись на прием
        try {
            clinic.scheduleAppointment(dog1, vet1, "2025-03-01");
            System.out.println(Color.GREEN + "Запись на прием для " + dog1.getName() + " к " + vet1.getName() + " на 2025-03-01 успешно создана." + Color.RESET);
            clinic.scheduleAppointment(cat1, vet1, "2025-03-02");
            System.out.println(Color.GREEN + "Запись на прием для " + cat1.getName() + " к " + vet1.getName() + " на 2025-03-02 успешно создана." + Color.RESET);
            clinic.scheduleAppointment(parrot, vet2, "2025-03-03");
            System.out.println(Color.GREEN + "Запись на прием для " + parrot.getName() + " к " + vet2.getName() + " на 2025-03-03 успешно создана." + Color.RESET);
            clinic.scheduleAppointment(dog2, vet1, "2025-03-04");
            System.out.println(Color.GREEN + "Запись на прием для " + dog2.getName() + " к " + vet1.getName() + " на 2025-03-04 успешно создана." + Color.RESET);
            clinic.scheduleAppointment(snake, vet2, "2025-03-05");
            System.out.println(Color.GREEN + "Запись на прием для " + snake.getName() + " к " + vet2.getName() + " на 2025-03-05 успешно создана." + Color.RESET);
        } catch (IllegalArgumentException e) {
            System.out.println(Color.RED + "Ошибка записи на прием: " + e.getMessage() + Color.RESET);
        }
    }

    // Цвета для консоли (ANSI escape codes)
    public static class Color {
        public static final String RESET = "\u001B[0m";
        public static final String RED = "\u001B[31m";
        public static final String GREEN = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
        public static final String BLUE = "\u001B[34m";
        public static final String PURPLE = "\u001B[35m";
        public static final String CYAN = "\u001B[36m";
        public static final String WHITE = "\u001B[37m";*/
    }
}

package Homework.lesson_26.veterinary_clinic;

/**
 * Главный класс для тестирования системы ветеринарной клиники.
 */
public class VetClinicSystem {
    public static void main(String[] args) {
        System.out.println("\n" + Color.BLUE.code + "=== Регистрация клиентов и питомцев ===" + Color.RESET.code);
        VetClinic clinic = new VetClinic();

        // Создание клиентов
        Client client1 = new Client("Иван Петров", 35, "123-456-789");
        Client client2 = new Client("Анна Смирнова", 28, "987-654-321");
        Client client3 = new Client("Сергей Иванов", 40, "111-222-333");
        Client client4 = new Client("Мария Кузнецова", 30, "222-333-444");
        Client client5 = new Client("Олег Никифоров", 25, "333-444-555");

        // Создание животных
        Dog dog1 = new Dog("Бобик", 5, client1);
        Dog dog2 = new Dog("Шарик", 2, client3);
        Cat cat1 = new Cat("Мурка", 3, client2);
        Cat cat2 = new Cat("Барсик", 4, client4);
        ExoticAnimal parrot = new ExoticAnimal("Кеша", 2, client1, "Попугай");
        ExoticAnimal snake = new ExoticAnimal("Гадюка", 4, client3, "Змея");
        ExoticAnimal turtle = new ExoticAnimal("Черепаха", 10, client5, "Пресноводная");

        // Добавление животных к клиентам
        client1.addPet(dog1);
        client1.addPet(parrot);
        client2.addPet(cat1);
        client3.addPet(dog2);
        client3.addPet(snake);
        client4.addPet(cat2);
        client5.addPet(turtle);

        // Регистрация клиентов в клинике
        clinic.registerClient(client1);
        clinic.registerClient(client2);
        clinic.registerClient(client3);
        clinic.registerClient(client4);
        clinic.registerClient(client5);

        // Создание и добавление ветеринаров
        System.out.println(Color.BLUE.code + "\n=== Добавление ветеринаров ===" + Color.RESET.code);
        Veterinarian vet1 = new Veterinarian("Доктор Айболит", 45, "555-1234", "Собаки и кошки");
        Veterinarian vet2 = new Veterinarian("Доктор Зоолог", 50, "555-5678", "Экзотические животные");
        Veterinarian vet3 = new Veterinarian("Доктор Грызунов", 38, "555-9999", "Грызуны");
        Veterinarian vet4 = new Veterinarian("Доктор Котиков", 42, "555-1111", "Кошки");

        clinic.addVeterinarian(vet1);
        clinic.addVeterinarian(vet2);
        clinic.addVeterinarian(vet3);
        clinic.addVeterinarian(vet4);

        // Запись животных на прием к ветеринарам
        System.out.println(Color.BLUE.code + "\n=== Запись на прием ===" + Color.RESET.code);
        clinic.scheduleAppointment(dog1, vet1, "2025-03-01");
        clinic.scheduleAppointment(cat1, vet1, "2025-03-02"); // Ошибка: неправильная специализация
        clinic.scheduleAppointment(parrot, vet2, "2025-03-03");
        clinic.scheduleAppointment(dog2, vet1, "2025-03-04");
        clinic.scheduleAppointment(snake, vet2, "2025-03-05");
        clinic.scheduleAppointment(turtle, vet2, "2025-03-06");
        clinic.scheduleAppointment(cat2, vet4, "2025-03-07");
        clinic.scheduleAppointment(dog1, vet3, "2025-03-08"); // Ошибка: неправильная специализация

        System.out.println(Color.BLUE.code + "\n=== Добавление записи в медицинскую историю ===" + Color.RESET.code);

        // Создание медицинской истории и добавление записей
        MedicalHistory medicalHistory = new MedicalHistory();
        Appointment appointment1 = new Appointment("2025-03-01", dog1, vet1);
        appointment1.conductCheckup("Здоров");
        Appointment appointment2 = new Appointment("2025-03-02", cat1, vet1);
        appointment2.conductCheckup("Легкая простуда");
        Appointment appointment3 = new Appointment("2025-03-03", parrot, vet2);
        appointment3.conductCheckup("Травма крыла");
        Appointment appointment4 = new Appointment("2025-03-04", dog2, vet1);
        appointment4.conductCheckup("Здоров");
        Appointment appointment5 = new Appointment("2025-03-05", snake, vet2);
        appointment5.conductCheckup("Здоров");
        Appointment appointment6 = new Appointment("2025-03-06", turtle, vet2);
        appointment6.conductCheckup("Недостаток кальция");
        Appointment appointment7 = new Appointment("2025-03-07", cat2, vet4);
        appointment7.conductCheckup("Здоров");

        medicalHistory.addAppointment(appointment1);
        medicalHistory.addAppointment(appointment2);
        medicalHistory.addAppointment(appointment3);
        medicalHistory.addAppointment(appointment4);
        medicalHistory.addAppointment(appointment5);
        medicalHistory.addAppointment(appointment6);
        medicalHistory.addAppointment(appointment7);

        // Демонстрация истории приемов
        medicalHistory.showHistory();
    }

    // Цвета для консоли (ANSI escape codes)
//    public static class Color {
//        public static final String RESET = "\u001B[0m";
//        public static final String RED = "\u001B[31m";
//        public static final String GREEN = "\u001B[32m";
//        public static final String YELLOW = "\u001B[33m";
//        public static final String BLUE = "\u001B[34m";
//        public static final String PURPLE = "\u001B[35m";
//        public static final String CYAN = "\u001B[36m";
//    }

    // вместо static class
    public enum Color {
        RESET("\u001B[0m"),
        RED("\u001B[31m"),
        GREEN("\u001B[32m"),
        YELLOW("\u001B[33m"),
        CYAN("\u001B[36m"),
        PURPLE("\u001B[35m"),
        BLUE("\u001B[34m");

        protected final String code;

        Color(String code) {
            this.code = code;
        }

        public String toString() {
            return code;
        }
    }
}

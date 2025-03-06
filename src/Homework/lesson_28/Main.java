package Homework.lesson_28;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем программистов
        Programmer alice = new Programmer("Alice");
        Programmer bob = new Programmer("Bob");

        // Тестируем добавление технологий
        System.out.println("Тест 1: Добавление технологий");
        alice.addTechnology("Java");
        alice.addTechnology("Git");
        alice.addTechnology("Java"); // Попытка дубликата
        bob.addTechnology("JavaScript");
        bob.addTechnology("Git");

        // Проверяем список технологий Alice
        List<String> aliceTech = alice.getTechnologies();
        System.out.println("Технологии Alice: " + aliceTech +
                " (Ожидается: [Java, Git]) → " +
                (aliceTech.size() == 2 ? "Passed" : "Failed"));

        // Проверяем защиту от модификации
        aliceTech.add("Python");
        System.out.println("Тест 2: Защита списка технологий");
        System.out.println("Список после модификации: " + alice.getTechnologies() +
                " (Ожидается: [Java, Git]) → " +
                (alice.getTechnologies().size() == 2 ? "Passed" : "Failed"));

        // Проверяем знание технологий
        System.out.println("\nТест 3: Проверка знаний");
        System.out.println("Alice знает Java? " + alice.knowsTechnology("Java") +
                " (Ожидается: true) → " +
                (alice.knowsTechnology("Java") ? "Passed" : "Failed"));
        System.out.println("Bob знает Python? " + bob.knowsTechnology("Python") +
                " (Ожидается: false) → " +
                (!bob.knowsTechnology("Python") ? "Passed" : "Failed"));

        // Работа со списком программистов
        ProgrammersList devTeam = new ProgrammersList();
        devTeam.addProgrammer(alice);
        devTeam.addProgrammer(bob);

        // Поиск по технологии
        System.out.println("\nТест 4: Поиск программистов с Git");
        List<Programmer> gitExperts = devTeam.getProgrammersWithTechnology("Git");
        System.out.println("Найдено: " + gitExperts.stream().map(Programmer::getName).toList() +
                " (Ожидается: [Alice, Bob]) → " +
                (gitExperts.size() == 2 ? "Passed" : "Failed"));

        // Поиск несуществующей технологии
        System.out.println("Тест 5: Поиск по несуществующей технологии");
        List<Programmer> pythonExperts = devTeam.getProgrammersWithTechnology("Python");
        System.out.println("Найдено: " + pythonExperts.size() +
                " (Ожидается: 0) → " +
                (pythonExperts.isEmpty() ? "Passed" : "Failed"));
    }
}

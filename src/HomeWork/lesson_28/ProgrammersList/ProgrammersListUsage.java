/*
package Homework.lesson_28.ProgrammersList;

public class ProgrammersListUsage {
        public static void main(String[] args) {
            ProgrammersList programmersList = new ProgrammersList();

            // Создаем программистов
            Programmer programmer1 = new Programmer("Иван", List.of("Java", "Python"));
            Programmer programmer2 = new Programmer("Петр", List.of("C++", "Java"));
            Programmer programmer3 = new Programmer("Анна", List.of("Python", "JavaScript"));

            // Добавляем программистов в список
            programmersList.addProgrammer(programmer1);
            programmersList.addProgrammer(programmer2);
            programmersList.addProgrammer(programmer3);

            // Получаем программистов, владеющих Java
            List<Programmer> javaProgrammers = programmersList.getProgrammersByTechnology("Java");

            // Выводим результаты
            System.out.println("Программисты, владеющие Java:");
            for (Programmer programmer : javaProgrammers) {
                System.out.println(programmer.getName());
            }
        }

}
*/
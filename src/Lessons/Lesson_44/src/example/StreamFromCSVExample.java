package Lessons.Lesson_44.src.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFromCSVExample {

    private static final String csvFilePath = "people.csv"; // путь к CSV файлу

    public static void main(String[] args) {
        List<PersonInner> people = readPeopleFromCSV(csvFilePath);

        System.out.println("Все люди:");
        people.forEach(System.out::println);

        findPersonWithMaxSalaryOver18(people);
    }

    /**
     * Чтение людей из CSV-файла.
     * Пропускает заголовок, обрабатывает строки в объекты PersonInner.
     */
    public static List<PersonInner> readPeopleFromCSV(String path) {
        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            return lines.skip(1) // пропустить первую строку (заголовок)
                    .map(line -> line.split(",")) // разбить строку по запятым
                    .filter(parts -> parts.length == 3) // базовая проверка
                    .map(parts -> new PersonInner(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2])))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("Ошибка чтения CSV файла: " + e.getMessage(), e);
        }
    }

    public static List<PersonInner> readPeopleFromCSVWithLoop(String path) {
        File file = new File(path);
        List<PersonInner> persons = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            boolean isFirst = true;
            while (line != null) {
                if(isFirst) {
                    isFirst = false;
                    continue;
                }
                String[] content = line.split(",");
                if (content.length == 3) {
                    PersonInner personInner = new PersonInner(content[0], Integer.parseInt(content[1]),Integer.parseInt(content[2]));
                    persons.add(personInner);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }

        return persons;
    }


    /**
     * Найти человека старше 18 лет с максимальной зарплатой.
     */
    public static void findPersonWithMaxSalaryOver18(List<PersonInner> people) {
        Optional<PersonInner> bestPerson = people.stream()
                .filter(person -> person.getAge() > 18)
                .max(Comparator.comparing(PersonInner::getSalary));

        System.out.println("Человек старше 18 с максимальной зарплатой:");
        bestPerson.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Нет подходящего человека.")
        );
    }

    /**
     * Вложенный класс PersonInner.
     */
    private static class PersonInner {
        private String name;
        private int age;
        private int salary;

        public PersonInner(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "PersonInner{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
        }
    }
}

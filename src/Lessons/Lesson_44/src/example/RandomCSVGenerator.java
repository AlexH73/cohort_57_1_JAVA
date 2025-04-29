package Lessons.Lesson_44.src.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomCSVGenerator {

    private static final List<String> names = List.of(
            "Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Hank", "Isabel", "John",
            "Kevin", "Laura", "Mike", "Nina", "Oscar", "Paula", "Quentin", "Rachel", "Steve", "Tina",
            "Ulysses", "Vera", "Walt", "Xenia", "Yuri", "Zara", "Adam", "Bella", "Cody", "Diana",
            "Ethan", "Fiona", "George", "Holly", "Ian", "Jenny", "Kyle", "Lily", "Mason", "Nora",
            "Owen", "Penny", "Quinn", "Rita", "Sam", "Tracy", "Uma", "Victor", "Wendy", "Xander",
            "Yasmine", "Zack"
    );

    private static final Random random = new Random();

    public static void main(String[] args) {
        String fileName = "src/Lessons/Lesson_44/src/example/people.csv"; // имя файла для записи
        int numberOfPeople = 34; // сколько людей сгенерировать

        generateRandomCSV(fileName, numberOfPeople);
        generateRandomCSVWithStream(fileName.replace(".csv", "_stream.csv"), numberOfPeople);
    }


    /**
     * Генерация случайного CSV файла с данными PersonInner (обычный цикл)
     */
    public static void generateRandomCSV(String fileName, int numberOfRecords) {
        Path filePath = Path.of(fileName);
        try {
            StringBuilder builder = new StringBuilder();
            builder.append("name,age,salary\n"); // заголовок CSV

            for (int i = 0; i < numberOfRecords; i++) {
                String name = names.get(random.nextInt(names.size()));
                int age = 15 + random.nextInt(26); // возраст от 15 до 40
                int salary = 2000 + random.nextInt(7001); // зарплата от 2000 до 9000
                builder.append(name).append(",").append(age).append(",").append(salary).append("\n");
            }

            new File(fileName).createNewFile();
            Files.writeString(filePath, builder.toString());
            System.out.println("CSV файл успешно создан: " + filePath.toAbsolutePath());

        } catch (IOException e) {
            throw new RuntimeException("Ошибка записи файла: " + e.getMessage(), e);
        }
    }

    /**
     * Генерация случайного CSV файла с данными PersonInner (через Stream API)
     */
    public static void generateRandomCSVWithStream(String fileName, int numberOfRecords) {
        Path filePath = Path.of(fileName);
        try {
            String content = IntStream.range(0, numberOfRecords)
                    .mapToObj(i -> {
                        String name = names.get(random.nextInt(names.size()));
                        int age = 15 + random.nextInt(26);
                        int salary = 2000 + random.nextInt(7001);
                        return name + "," + age + "," + salary;
                    })
                    .collect(Collectors.joining("\n", "name,age,salary\n", "\n")); // добавляем заголовок и переносы строк

            new File(fileName).createNewFile();
            Files.writeString(filePath, content);
            System.out.println("CSV файл через Stream API успешно создан: " + filePath.toAbsolutePath());

        } catch (IOException e) {
            throw new RuntimeException("Ошибка записи файла через Stream API: " + e.getMessage(), e);
        }
    }
}

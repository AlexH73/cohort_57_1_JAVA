package Lessons.Lesson_44.src.practice.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) throws IOException {
        // Создание стрима из коллекции
        Collection<String> collection = Arrays.asList("f5", "b6", "z7");
        Stream<String> collectionStream = collection.stream();
        // collectionStream.forEach(System.out::println);

        // Создание стрима из значений
        Stream<String> valuesStream = Stream.of("f5", "b6", "z7");
        // valuesStream.forEach(System.out::println);

        // Создание стрима из примитивов
        IntStream intStream = IntStream.of(9, 8, 7);
        // intStream.forEach(System.out::println);
        DoubleStream doubleStream = DoubleStream.of(2.4, 8.9);
        // doubleStream.forEach(System.out::println);

        // Создание стрима из массива
        String[] array = {"f5", "b6", "z7"};
        Stream<String> arrayStream = Arrays.stream(array);
        // arrayStream.forEach(System.out::println);

        // Создание стрима из файла
        Path path = Paths.get("doc.txt");
        try (Stream<String> fileStream = Files.lines(path)) {
            // fileStream.forEach(System.out::println);
        }

        // Создание стрима с помощью Stream.builder
        Stream<String> builderStream = Stream.<String>builder().add("f5").add("b6").build();
        // builderStream.forEach(System.out::println);
    }
}


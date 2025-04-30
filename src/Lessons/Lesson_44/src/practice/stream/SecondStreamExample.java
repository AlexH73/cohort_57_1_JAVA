package Lessons.Lesson_44.src.practice.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondStreamExample {

    static void conveyorSrteam() {
        List<String> collection = Arrays.asList("e22", "a12", "b14", "c16", "d18", "e22");

        // filter: фильтрация элементов по определенному условию
        long count = collection.stream().filter("e22"::equals).count();
        System.out.println(count);  // Вывод: 2

        // sorted: сортировка элементов (в данном случае, в лексикографическом порядке)
        List<String> sortedList = collection.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);  // Вывод: [a12, b14, c16, d18, e22, e22]

        // limit: ограничение количества элементов
        List<String> limitedList = collection.stream().limit(3).collect(Collectors.toList());
        System.out.println(limitedList);  // Вывод: [e22, a12, b14]

        // skip: пропуск определенного количества элементов
        String skippedElement = collection.stream().skip(3).findFirst().orElse("4");
        System.out.println(skippedElement);  // Вывод: c16

        // distinct: удаление дубликатов
        List<String> distinctList = collection.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);  // Вывод: [e22, a12, b14, c16, d18]

        // peek: выполнение операции над каждым элементом, без изменения элементов
        List<String> peekList = collection.stream().map(String::toLowerCase).peek((e) -> System.out.print("," + e)).collect(Collectors.toList());
        System.out.println();  // Вывод: ,e22,a12,b14,c16,d18,e22

        // map: применение функции к каждому элементу
        Stream.of("3", "4", "5").map(Integer::parseInt).map(x -> x + 10).forEach(System.out::println);  // Вывод: 13 14 15

        // mapToInt: преобразование каждого элемента в int
        int[] intArray = collection.stream().mapToInt((s) -> Integer.parseInt(s.substring(1))).toArray();
        System.out.println(Arrays.toString(intArray));  // Вывод: [22, 12, 14, 16, 18, 22]

        // flatMap: преобразование каждого элемента в поток, а затем объединение всех потоков в один
        String[] array = collection.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new);
        System.out.println(Arrays.toString(array));  // Вывод: [e22, a12, b14, c16, d18, e22]
    }

    static void terminalStream() {

        List<String> collection = Arrays.asList("f1", "f5", "b6", "a8", "10", "20");

        // 1. findFirst: Возвращает первый элемент из стрима, если стрим пустой возвращает "10" (альтернативное значение).
        String firstElement = collection.stream().findFirst().orElse("10");
        System.out.println(firstElement);  // Вывод: f1

        // 2. findAny: Возвращает любой элемент из стрима, если стрим пустой возвращает "10" (альтернативное значение).
        String anyElement = collection.stream().findAny().orElse("10");
        System.out.println(anyElement);  // Вывод может варьироваться, например: f1

        // 3. collect: Собирает результаты обработки в коллекции и не только.
        List<String> filteredList = collection.stream()
                .filter((s) -> s.contains("10"))
                .collect(Collectors.toList());
        System.out.println(filteredList);  // Вывод: [10]

        // 4. count: Подсчитывает количество элементов, соответствующих условию.
        long count = collection.stream().filter("f5"::equals).count();
        System.out.println(count);  // Вывод: 1

        // 5. anyMatch: Возвращает true, если хотя бы один элемент соответствует условию.
        boolean anyMatch = collection.stream().anyMatch("f5"::equals);
        System.out.println(anyMatch);  // Вывод: true

        // 6. noneMatch: Возвращает true, если ни один элемент не соответствует условию.
        boolean noneMatch = collection.stream().noneMatch("b6"::equals);
        System.out.println(noneMatch);  // Вывод: false

        // 7. allMatch: Возвращает true, если все элементы соответствуют условию.
        boolean allMatch = collection.stream().allMatch((s) -> s.contains("8"));
        System.out.println(allMatch);  // Вывод: false

        // 8. min: Находит минимальный элемент, используя переданный сравнитель.
        String minElement = collection.stream().min(String::compareTo).get();
        System.out.println(minElement);  // Вывод: 10

        // 9. max: Находит максимальный элемент, используя переданный сравнитель.
        String maxElement = collection.stream().max(String::compareTo).get();
        System.out.println(maxElement);  // Вывод: f5

        // 10. forEach: Применяет функцию ко всем элементам.
        Set<StringBuilder> set = new HashSet<>(Arrays.asList(new StringBuilder("one"), new StringBuilder("two")));
        set.stream().forEach((p) -> p.append("_2"));
        System.out.println(set);  // Вывод: [one_2, two_2]

        // 11. forEachOrdered: Применяет функцию ко всем элементам по очереди, сохраняя порядок элементов.
        List<StringBuilder> list = new ArrayList<>(Arrays.asList(new StringBuilder("three"), new StringBuilder("four")));
        list.stream().forEachOrdered((p) -> p.append("_nv"));
        System.out.println(list);  // Вывод: [three_nv, four_nv]

        // 12. toArray: Приводит значения стрима к массиву.
        String[] array = collection.stream().map(String::toLowerCase).toArray(String[]::new);
        System.out.println(Arrays.toString(array));  // Вывод: [f1, f5, b6, a8, 10, 20]

        // 13. reduce: Преобразует все элементы в один объект.
        String concatenated = collection.stream().reduce((c1, c2) -> c1 + c2).orElse("");
        System.out.println(concatenated);  // Вывод: f1f5b6a81020
    }
}

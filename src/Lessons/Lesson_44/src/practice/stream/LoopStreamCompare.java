package Lessons.Lesson_44.src.practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoopStreamCompare {
    public static void main(String[] args) {

    }

    // Преобразование списка строк в список чисел (представляя строки как целые числа)
    static void stringToInt() {
        List<String> stringList = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> intList = new ArrayList<>();
        for (String s : stringList) {
            intList.add(Integer.parseInt(s));
        }
        System.out.println(intList);  // Вывод: [1, 2, 3, 4, 5]

        // Здесь мы итерируемся по каждому элементу в stringList, преобразуем строку в целое число с помощью
        // Integer.parseInt, и добавляем результат в intList.
        List<Integer> intListStream = stringList.stream() // запускаем stream по stringList
                .map(Integer::parseInt)  // map - применение операций к кажому элементу, в данном примере - метод parseInt
                .collect(Collectors.toList()); // collect - собирает результаты предыдущих строк в коллекцию, Collectors.toList() - собираем в лист
        System.out.println(intListStream);  // Вывод: [1, 2, 3, 4, 5]
    }

    // Фильтрация списка, оставляя только чётные числа
    static void evenNums() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println(evenNumbers);  // Вывод: [2, 4, 6]

        List<Integer> evenNumbersStream = numbers.stream()
                .filter(number -> number % 2 == 0) // filter - отсеивает элементы коллекции, которые не подходят под условие, которое указали в круглых скобках
                .collect(Collectors.toList()); // collect - собирает результаты предыдущих строк в коллекцию, Collectors.toList() - собираем в лист
        System.out.println(evenNumbersStream);  // Вывод: [2, 4, 6]
    }

    // Суммирование элементов списка
    static void sumElem() {
        List<Integer> numbersSum = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        //Здесь мы инициализируем переменную sum значением 0, затем итерируемся по каждому элементу в numbersSum, добавляя его значение к sum.
        for (Integer number : numbersSum) {
            sum += number;
        }
        System.out.println(sum);  // Вывод: 15

        int sumStream = numbersSum.stream()
                .mapToInt(Integer::intValue)// работает, как map, но возвращает только int (примитив)
                .sum(); // суммирует все элементы
        System.out.println(sumStream);  // Вывод: 15

    }

    // Нахождение первого элемента в списке
    static void findFirstExample() {
        List<String> collection = Arrays.asList("f1", "f5", "b6", "a8", "10", "20");

        // С использованием цикла:
        String firstElement = null;
        for (String item : collection) {
            firstElement = item;
            break;
        }
        System.out.println(firstElement);  // Вывод: f1

        // С использованием стрима:
        String firstElementStream = collection.stream().findFirst().orElse("10");
        System.out.println(firstElementStream);  // Вывод: f1
    }

    // Нахождение любого элемента в списке
    static void findAnyExample() {
        List<String> collection = Arrays.asList("f1", "f5", "b6", "a8", "10", "20");

        // С использованием цикла:
        String anyElement = null;
        for (String item : collection) {
            if (item.contains("5")) {
                anyElement = item;
                break;
            }
        }
        System.out.println(anyElement);  // Вывод: f5

        // С использованием стрима:
        String anyElementStream = collection.stream().filter((s) -> s.contains("5")).findAny().orElse("10");
        System.out.println(anyElementStream);  // Вывод: f5
    }


    // Подсчет элементов в списке
    static void countExample() {
        List<String> collection = Arrays.asList("f1", "f5", "b6", "a8", "10", "20");

        // С использованием цикла:
        int count = 0;
        for (String item : collection) {
            count++;
        }
        System.out.println(count);  // Вывод: 6

        // С использованием стрима:
        long countStream = collection.stream().count();
        System.out.println(countStream);  // Вывод: 6
    }
}

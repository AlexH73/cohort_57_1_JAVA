package Lessons.Lesson_43.src.teacher_code.functional_interface_usage;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class UsageFunctional {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        MyFunctionalInterface functionalInterfaceOne = () -> System.out.println("hello from functional interface One");
        MyFunctionalInterface functionalInterfaceTwo = () -> System.out.println("hello from functional interface Two");

        useFunctionalInterface(myClass);
        useFunctionalInterface(functionalInterfaceOne);
        useFunctionalInterface(functionalInterfaceTwo);

        IBuch integerListBuch = (list) -> getBuch((List<Integer>) list);


        useIBuch(integerListBuch);

        IntegerListBuch buch = new IntegerListBuch();
        useIBuch(buch); // здесь была ошибка, ты два раза integerListBuch передавала

        // Теперь создаём IBuch для работы с файлом
        IBuch fileBuch = (file) -> {
            int result = 0;
            try (Scanner scanner = new Scanner((File) file)) {
                while (scanner.hasNextInt()) {
                    result += scanner.nextInt();
                }
                return result;
            } catch (IOException e) {
                System.err.println("error reading file in fileBuch");
                return -1;
            }
        };

        // Здесь создаём файл и вызываем fileBuch
        File file = new File("/Users/juliannaburkovska/IdeaProjects/ait_base_course/src/my_numbers.txt");
        int result = fileBuch.getBuch(file);
        System.out.println("Сумма чисел из файла = " + result);
    }

    private static void useFunctionalInterface(MyFunctionalInterface myFunctionalInterface) {
        myFunctionalInterface.myAbstractMethod();
    }

    private static void useIBuch(IBuch iBuch) {
        List<Integer> list = List.of(1, 2, 3);

        System.out.println("iBuch.getBuch(list) = " + iBuch.getBuch(list));
    }

    private static int getBuch(List<Integer> list) {
        int result = 0;
        for (Integer i : list) result += i;
        return result;
    }
}

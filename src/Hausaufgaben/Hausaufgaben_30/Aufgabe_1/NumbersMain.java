package Hausaufgaben.Hausaufgaben_30.Aufgabe_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumbersMain {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(23);
        numbers.add(74);
        numbers.add(65);

        Collections.sort(numbers);
        System.out.println("(numbers) = " + (numbers));

        numbers.remove(Integer.valueOf(2));

        numbers.set(2, 12);

        System.out.println("(numbers) = " + (numbers));

        if (numbers.contains(12)) {
            System.out.println("Список содержит число 12");
        } else {
            System.out.println("Список не содержит число 12");
        }

        System.out.println("Размер списка: " + numbers.size());

        numbers.clear();
        System.out.println("Очистка списка: " + numbers);
    }
}

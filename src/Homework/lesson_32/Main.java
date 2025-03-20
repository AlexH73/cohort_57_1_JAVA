package Homework.lesson_32;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Пример 1: Работа с Map<String, String>
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("A", "Apple");
        stringMap.put("B", "Banana");
        stringMap.put("C", "Apple");

        MapOperationsStringImpl operations = new MapOperationsStringImpl();
        operations.removeSameValues(stringMap);
        System.out.println("Результат для Map<String, string>: " + stringMap);

        //Пример 2: Работа с Map<Integer, Integer>
        Map<Integer, Integer> integerMap =new HashMap<>();
        integerMap.put(1, 10);
        integerMap.put(2, 20);
        integerMap.put(3, 10);
        integerMap.put(4, 30);

        operations.removeSameValuesAnyTypes(integerMap);
        System.out.println("Результат для Map<Integer, Integer>: " + integerMap);
    }
}

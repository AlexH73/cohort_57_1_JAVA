package Homework.lesson_32.map_operations;

import java.util.HashMap;
import java.util.Map;

public class MapOperationsDemo {
    public static void main(String[] args) {
        MapOperationsHomeworkImpl operations = new MapOperationsHomeworkImpl();

        // Пример 1: Удаление дубликатов строковых значений
        Map<String, String> fruits = new HashMap<>();
        fruits.put("A", "Apple");
        fruits.put("B", "Banana");
        fruits.put("C", "Apple");
        System.out.println("[До] Fruits: " + fruits);
        operations.removeSameValues(fruits);
        System.out.println("[После] Fruits: " + fruits + "\n");

        // Пример 2: Удаление дубликатов числовых значений
        Map<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 10);
        numbers.put(2, 20);
        numbers.put(3, 10);
        numbers.put(4, 30);
        System.out.println("[До] Numbers: " + numbers);
        operations.removeSameValuesAnyTypes(numbers);
        System.out.println("[После] Numbers: " + numbers + "\n");

        // Пример 3: Обработка null-значений
        Map<String, String> nullValues = new HashMap<>();
        nullValues.put("K1", null);
        nullValues.put("K2", null);
        System.out.println("[До] Null Values: " + nullValues);
        operations.removeSameValues(nullValues);
        System.out.println("[После] Null Values: " + nullValues + "\n");

        // Пример 4: Смешанные типы данных
        Map<Integer, Object> mixedTypes = new HashMap<>();
        mixedTypes.put(5, "Five");
        mixedTypes.put(6, 6);
        mixedTypes.put(7, "Five");
        System.out.println("[До] Mixed Types: " + mixedTypes);
        operations.removeSameValuesAnyTypes(mixedTypes);
        System.out.println("[После] Mixed Types: " + mixedTypes + "\n");

        // Пример 5: Единственный null
        Map<String, String> singleNull = new HashMap<>();
        singleNull.put("N1", null);
        singleNull.put("N2", "NotNull");
        System.out.println("[До] Single Null: " + singleNull);
        operations.removeSameValues(singleNull);
        System.out.println("[После] Single Null: " + singleNull);
    }
}

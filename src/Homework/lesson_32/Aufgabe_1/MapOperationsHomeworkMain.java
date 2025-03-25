package Homework.lesson_32.Aufgabe_1;

import Homework.lesson_32.Aufgabe_1.MapOperationsHomeworkImplem;
import Homework.lesson_32.Aufgabe_1.MapOperationsHomeworkImplem;

import java.util.HashMap;
import java.util.Map;

public class MapOperationsHomeworkMain {
    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("A", "Apple");
        stringMap.put("B", "Banana");
        stringMap.put("C", "Apple");

        MapOperationsHomeworkImplem operations = new MapOperationsHomeworkImplem();
        operations.removetSameValues(stringMap);

        System.out.println(stringMap); // Ausgabe: {B=Banana}

        Map<Integer, Integer> integerMap = new HashMap<>();
        integerMap.put(1, 10);
        integerMap.put(2, 20);
        integerMap.put(3, 10);
        integerMap.put(4, 30);

        operations.removetSameValuesAnyTypes(integerMap);

        System.out.println(integerMap); // Ausgabe: {2=20, 4=30}
    }
}


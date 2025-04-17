package Homework.lesson_32;

import java.util.HashMap;
import java.util.Map;

public class MapOperationsHomeworkUsage {
    public static void main(String[] args) {
        Map<String, String> duplicateControlStr = new HashMap<>();

        duplicateControlStr.put("A","Apple");
        duplicateControlStr.put("B","Banana");
        duplicateControlStr.put("C","Apple");

        Map<Integer, Integer> duplicateControlInt = new HashMap<>();

        duplicateControlInt.put(1, 10);
        duplicateControlInt.put(2, 20);
        duplicateControlInt.put(3, 10);
        duplicateControlInt.put(4, 30);


        System.out.println(duplicateControlStr);
    }

}

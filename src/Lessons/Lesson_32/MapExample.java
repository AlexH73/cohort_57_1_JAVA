package Lessons.Lesson_32;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        Map<String, Integer> map =  new HashMap<>();

        map.put("France", 2019);
        map.put("India", 2007);
        map.put("Japan", 1994);
        map.put("Finland", 2011);
        map.put("Canada", 2014);
        map.put("Kenia", 2014);

        printMap(map);

        map.put("Finland", 2025);
        printMap(map);

        Integer japanVisitedAt = map.get("Japan");
        System.out.println(japanVisitedAt);

        Integer norwayVisitedAt = map.get("Norway");
        System.out.println(norwayVisitedAt);

        System.out.println("map.containsKey(\"Norway\") = " + map.containsKey("Norway"));
        System.out.println("map.containsKey(\"Japan\") = " + map.containsKey("Japan"));

        // перебор значений?
        map.keySet(); // возвращает сет, который содержит только ключи

        Set<String> keyset = map.keySet();

        for (String key : keyset) {
            Integer value = map.get(key);

            System.out.println(value);
        }

        Map<Integer, List<String>> pages = new HashMap<>();

        pages.put(1, List.of("Привет", "дорогой", "читатель!"));
        pages.put(2, List.of("Эта", "книга", "посвящена", "ю.ф.вфв"));

        printMap(pages);

    }


    private static void printMap(Map map) {
        System.out.println(map);
    }
}

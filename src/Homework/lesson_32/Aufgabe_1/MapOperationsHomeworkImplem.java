package Homework.lesson_32.Aufgabe_1;

import java.util.*;

public class MapOperationsHomeworkImplem implements MapOperationsHomework {

    @Override
    public <K, V> void removetSameValuesAnyTypes(Map<K, V> map) {
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Die Map darf nicht null oder leer sein.");
        }

        // Zähle die Häufigkeit der Werte
        Map<V, Integer> valueCount = new HashMap<>();
        for (V value : map.values()) {
            valueCount.put(value, valueCount.getOrDefault(value, 0) + 1);
        }

        // Entferne Einträge mit duplizierten Werten
        map.entrySet().removeIf(entry -> valueCount.get(entry.getValue()) > 1);
    }

    @Override
    public void removetSameValues(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Die Map darf nicht null oder leer sein.");
        }

        // Zähle die Häufigkeit der Werte
        Map<String, Integer> valueCount = new HashMap<>();
        for (String value : map.values()) {
            valueCount.put(value, valueCount.getOrDefault(value, 0) + 1);
        }

        // Entferne Einträge mit duplizierten Werten
        map.entrySet().removeIf(entry -> valueCount.get(entry.getValue()) > 1);
    }
}


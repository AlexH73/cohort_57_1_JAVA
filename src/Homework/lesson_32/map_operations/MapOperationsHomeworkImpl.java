package Homework.lesson_32.map_operations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOperationsHomeworkImpl implements MapOperationsHomework {

    @Override
    public <K, V> void removeSameValuesAnyTypes(Map<K, V> map) {
        Map<V, Integer> valueFrequency = new HashMap<>();
        // Подсчет частоты значений
        for (V value : map.values()) {
            valueFrequency.put(value, valueFrequency.getOrDefault(value, 0) + 1);
        }

        // Сбор ключей для удаления
        List<K> keysToRemove = new ArrayList<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();
            if (valueFrequency.get(value) > 1) {
                keysToRemove.add(entry.getKey());
            }
        }

        // Удаление ключей
        for (K key : keysToRemove) {
            map.remove(key);
        }
    }

    // Упрощенная версия метода `removeSameValues`
    @Override
    public void removeSameValues(Map<String, String> map) {
        removeSameValuesAnyTypes(map);
    }
}

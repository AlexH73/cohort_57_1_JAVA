package Homework.lesson_32.HomeworkYulia_32;

import java.util.Map;
import java.util.HashMap;

public class MapOperationsHomeworkImpl implements MapOperationsHomework {

    @Override
    public <K, V> void removeSameValuesAnyTypes(Map<K, V> map) {
        // Подсчет количества вхождений каждого значения
        Map<V, Integer> valueCount = new HashMap<>();
        for (V value : map.values()) {
            valueCount.put(value, valueCount.getOrDefault(value, 0) + 1);
        }

        // Удаление всех ключей, значения которых встречаются более одного раза
        map.entrySet().removeIf(entry -> valueCount.get(entry.getValue()) > 1);
    }

    @Override
    public void removeSameValues(Map<String, String> map) {
        removeSameValuesAnyTypes(map);
    }
}
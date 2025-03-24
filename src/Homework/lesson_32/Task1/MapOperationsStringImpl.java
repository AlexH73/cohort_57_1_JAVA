package Homework.lesson_32.Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOperationsStringImpl implements MapOperationsHomework {
    // метод обобщенный (generic). Он принимает Map<K, V>, где:
    //K – тип ключа (например, String, Integer).
    //V – тип значения (например, String, Integer).
    @Override
    public <K, V> void removeSameValuesAnyTypes(Map<K, V> map) {
        Map<V, Integer> valueCount = new HashMap<>();
        //Подсчет частоты значений:
        for (V value : map.values()) {
            valueCount.put(value, valueCount.getOrDefault(value, 0) + 1);
        }

        // Сбор ключей для удаления
        List<K> keysToRemove = new ArrayList<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();
            if (valueCount.get(value) > 1) {
                keysToRemove.add(entry.getKey());
            }
        }

// Удаление всех ключей, у которых значения встречаются более одного раза
        for (K key : keysToRemove) {
            map.remove(key);
        }
    }

    //Mетод вызывает обобщенный метод removeSameValuesAnyTypes, передавая Map<String, String>.
    @Override
    public void removeSameValues(Map<String, String> map) {
        removeSameValuesAnyTypes(map);
    }
}

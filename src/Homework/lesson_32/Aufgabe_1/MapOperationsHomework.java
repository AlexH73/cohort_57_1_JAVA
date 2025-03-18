package Homework.lesson_32.Aufgabe_1;

/**
 * Интерфейс для работы с Map, позволяющий удалять дублирующиеся значения.
 * Студенты должны реализовать этот интерфейс и обеспечить корректную работу метода `removeSameValues`.
 *
 * Примеры тестовых данных:
 * - Исходная `Map<String, String>`: {"A" -> "Apple", "B" -> "Banana", "C" -> "Apple"}
 *   Ожидаемый результат: {"B" -> "Banana"}
 *
 * - Исходная `Map<Integer, Integer>`: {1 -> 10, 2 -> 20, 3 -> 10, 4 -> 30}
 *   Ожидаемый результат: {2 -> 20, 4 -> 30}
 *
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Интерфейс
public interface MapProcessor<K, V> {
    void removeSameValues(Map<K, V> map);
}

// Реализация интерфейса
public class MapProcessorImpl<K, V> implements MapProcessor<K, V> {

    @Override
    public void removeSameValues(Map<K, V> map) {
        Map<K, V> copy = new HashMap<>(map);
        Set<V> uniqueValues = new HashSet<>();
        Set<V> duplicateValues = new HashSet<>();

        // Определяем уникальные и дублирующиеся значения
        for (V value : copy.values()) {
            if (!uniqueValues.add(value)) {
                duplicateValues.add(value);
            }
        }

        // Удаляем записи с дублирующимися значениями
        for (Map.Entry<K, V> entry : copy.entrySet()) {
            if (duplicateValues.contains(entry.getValue())) {
                map.remove(entry.getKey());
            }
        }
    }
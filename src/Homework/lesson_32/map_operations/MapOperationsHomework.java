package Homework.lesson_32.map_operations;

import java.util.Map;

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
public interface MapOperationsHomework {

    /**
     * Удаляет дублирующиеся значения в переданной `Map`, оставляя только уникальные.
     * Если значение встречается более одного раза, все соответствующие ключи должны быть удалены.
     * Допускается один `null` в качестве значения.
     *
     * @param map Map, в которой необходимо удалить повторяющиеся значения.
     * @param <K> Тип ключей.
     * @param <V> Тип значений.
     */
    <K, V> void removeSameValuesAnyTypes (Map<K, V> map);

    /**
     * Упрощенная версия метода `removeSameValues`, работающая только с `Map<String, String>`.
     *
     * @param map Map с ключами и значениями типа `String`.
     */
    void removeSameValues(Map<String, String> map);
}

package Homework.lesson_32;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//    * Удаляет дублирующиеся значения в переданной `Map`, оставляя только уникальные.
//     * Если значение встречается более одного раза, все соответствующие ключи должны быть удалены.
//     * Допускается один `null` в качестве значения.
//     *
//     * @param map Map, в которой необходимо удалить повторяющиеся значения.
//     * @param <K> Тип ключей.
//     * @param <V> Тип значений.
public class MapOperationsStringImpl implements MapOperationsHomework{
    // метод обобщенный (generic). Он принимает Map<K, V>, где:
    //K – тип ключа (например, String, Integer).
    //V – тип значения (например, String, Integer).
    @Override
    public <K, V> void removeSameValuesAnyTypes(Map<K, V> map) {
        Map<V,Integer> valueCount = new HashMap<>();
        //Подсчет частоты значений:
        for (V value : map.values()) {
            valueCount.put(value,valueCount.getOrDefault(value,0) + 1);
        }
    }



    // Удаление всех ключей, у которых значения встречаются более одного раза



    //Mетод вызывает обобщенный метод removeSameValuesAnyTypes, передавая Map<String, String>.
    public void removeSameValues(Map<String, String> map) {
        removeSameValuesAnyTypes(map);

    }

    private class V {
    }
}

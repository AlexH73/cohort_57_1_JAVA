package Homework.lesson_32.Task1;

import java.util.Map;
//реализации методов:
public interface MapOperationsHomework {

    // метод обобщенный (generic). Он принимает Map<K, V>, где:
    //K – тип ключа (например, String, Integer).
    //V – тип значения (например, String, Integer).
    <K, V> void removeSameValuesAnyTypes(Map<K, V> map);

    //Mетод вызывает обобщенный метод removeSameValuesAnyTypes, передавая Map<String, String>.
    void removeSameValues(Map<String, String> map);
}

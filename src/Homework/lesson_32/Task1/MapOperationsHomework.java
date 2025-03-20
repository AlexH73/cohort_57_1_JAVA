package Homework.lesson_32.Task1;

import java.util.Map;
//реализации методов:
public interface MapOperationsHomework {
    <K, V> void removeSameValuesAnyTypes (Map<K, V> map); // работает с любыми типами.
    void removeSameValues(Map<String, String> map); //работает только с Map<String, String>.
}

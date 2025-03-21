package Homework.lesson_32.Aufgabe_1;

import java.util.Map;

/**
 * Interface für Operationen mit einer Map, das Methoden zur Entfernung
 * von duplizierten Werten bietet.
 */
public interface MapOperationsHomework {

    /**
     * Entfernt doppelte Werte aus der angegebenen Map. Diese Methode ist generisch
     * und funktioniert mit beliebigen Typen von Schlüsseln und Werten.
     *
     * @param map Die Map, aus der doppelte Werte entfernt werden sollen.
     * @param <K> Der Typ der Schlüssel in der Map.
     * @param <V> Der Typ der Werte in der Map.
     * @throws IllegalArgumentException wenn die Map null oder leer ist.
     */
    <K, V> void removetSameValuesAnyTypes(Map<K, V> map);

    /**
     * Entfernt doppelte Werte aus einer Map mit Strings als Schlüssel und Werte.
     * Diese Methode ist spezifisch für Maps des Typs `Map<String, String>`.
     *
     * @param map Die Map mit Strings als Schlüssel und Werten, aus der doppelte
     *            Werte entfernt werden sollen.
     * @throws IllegalArgumentException wenn die Map null oder leer ist.
     */
    void removetSameValues(Map<String, String> map);
}

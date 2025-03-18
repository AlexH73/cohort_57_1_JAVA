package Hausaufgaben.Hausaufgaben_31.Aufgabe_31;
import java.util.*;

public class StringSetOperationsImpl implements CollectionOperationsHomework{

    /**
     * Gibt die Vereinigung zweier Mengen zurück.
     *
     * @param set1 erste Menge von Strings
     * @param set2 zweite Menge von Strings
     * @return eine neue Menge, die die Vereinigung von set1 und set2 enthält
     */
    public Set<String> unionOfStringSets(Set<String> set1, Set<String> set2) {
        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    /**
     * Gibt die Schnittmenge zweier Mengen zurück.
     *
     * @param set1 erste Menge von Strings
     * @param set2 zweite Menge von Strings
     * @return eine neue Menge, die die Schnittmenge von set1 und set2 enthält
     */
    public Set<String> intersectionOfStringSets(Set<String> set1, Set<String> set2) {
        Set<String> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }

    /**
     * Gibt die Differenz zweier Mengen zurück (Elemente aus set1, die nicht in set2 sind).
     *
     * @param set1 erste Menge von Strings
     * @param set2 zweite Menge von Strings
     * @return eine neue Menge, die die Differenz von set1 und set2 enthält
     */
    public Set<String> differenceOfStringSets(Set<String> set1, Set<String> set2) {
        Set<String> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        return differenceSet;
    }

    /**
     * Prüft, ob alle Elemente in der Menge einzigartig sind.
     * (Redundant für Set, da Set immer eindeutige Elemente enthält.)
     *
     * @param set Menge von Strings
     * @return true, da Set immer eindeutige Elemente enthält
     */
    public boolean areStringElementsUnique(Set<String> set) {
        return true; // Set enthält immer eindeutige Elemente
    }
}


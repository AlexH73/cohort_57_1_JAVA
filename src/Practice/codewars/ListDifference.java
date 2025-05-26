package Practice.codewars;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Implement a function that computes the difference between two lists.
 * The function should remove all occurrences of elements from the first list (a)
 * that are present in the second list (b).
 * The order of elements in the first list should be preserved in the result.
 */
public class ListDifference {
    public static List<Integer> arrayDiff(List<Integer> a, List<Integer> b) {
        // Используем HashSet для быстрого поиска элементов из b
        Set<Integer> toRemove = new HashSet<>(b);

        // Фильтруем только те элементы, которых нет в toRemove
        List<Integer> result = new ArrayList<>();
        for (Integer num: a) {
            if (!toRemove.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(arrayDiff(List.of(1, 2), List.of(1)));          // [2]
        System.out.println(arrayDiff(List.of(1, 2, 2, 2, 3), List.of(2))); // [1, 3]
        System.out.println(arrayDiff(List.of(1, 2, 3), List.of()));        // [1, 2, 3]
        System.out.println(arrayDiff(List.of(), List.of(1, 2)));           // []
    }
}

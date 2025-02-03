package Practice.CodewarsCom;

import java.util.*;

public class Codewarrior {
    /**
     * I want to create an array of Lists of Integers, like so:
     * <p>
     * import java.util.*;
     * <p>
     * class Codewarrior {
     *     public static List<Integer>[] arrayOfLists = new List<Integer>[] {
     *         Arrays.asList(1, 2, 3),
     *         Arrays.asList(4, 5, 6),
     *         Arrays.asList(7, 8, 9),
     *     };
     * }
     *
     * However, this code does not compile :(
     * <p>
     * Can you fix the code ?
     * <p>
     * arrayOfLists should hold the 3 lists shown above, (1, 2, 3), (4, 5, 6), (7, 8, 9).
     * <p>
     * <p>
     * <p>
     * Ошибка связанная с инициализацией массива обобщенных типов (List<Integer>).
     * В Java нельзя напрямую создать массив параметризованных типов. Это связано с тем,
     * что массивы в Java являются ковариантными, а обобщения - инвариантными,
     * что может привести к проблемам с безопасностью типов.
     * <p>
     * Вместо этого вы можете использовать List<List<Integer>> для создания списка списков.
     */
    public static List<List<Integer>> arrayOfLists = new ArrayList<List<Integer>>() {
        {
            add(Arrays.asList(1, 2, 3));
            add(Arrays.asList(4, 5, 6));
            add(Arrays.asList(7, 8, 9));
        }
    };

    public static void main(String[] args) {
        // Пример использования
        for (List<Integer> list : arrayOfLists) {
            System.out.println(list);
        }
    }
}

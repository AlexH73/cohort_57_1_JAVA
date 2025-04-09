package Homework.lesson_38;

public class Main {
    public static void main(String[] args) {
        BinarySearchHomework searcher = new BinarySearchHomework();

        // Пример 1: Обычный случай (множественные вхождения)
        int[] arr1 = {1, 2, 2, 2, 3, 4};
        testCase(searcher, arr1, 2, "Множественные вхождения");

        // Пример 2: Элемент отсутствует
        testCase(searcher, arr1, 5, "Элемент отсутствует");

        // Пример 3: Пустой массив
        testCase(searcher, new int[0], 1, "Пустой массив");

        // Пример 4: Все элементы одинаковые
        int[] arr4 = {2, 2, 2, 2};
        testCase(searcher, arr4, 2, "Все элементы одинаковые");

        // Пример 5: Один элемент (найден)
        int[] arr5 = {5};
        testCase(searcher, arr5, 5, "Один элемент (найден)");

        // Пример 6: Один элемент (не найден)
        testCase(searcher, arr5, 3, "Один элемент (не найден)");

        // Пример 7: Target меньше всех элементов
        int[] arr7 = {10, 20, 30};
        testCase(searcher, arr7, 5, "Target меньше всех элементов");

        // Пример 8: Target больше всех элементов
        testCase(searcher, arr7, 40, "Target больше всех элементов");

        // Пример 9: Граничные значения
        int[] arr9 = {1, 3, 5, 7, 9};
        testCase(searcher, arr9, 1, "Первый элемент");
        testCase(searcher, arr9, 9, "Последний элемент");
    }

    private static void testCase(BinarySearchHomework searcher, int[] arr, int target, String description) {
        System.out.println("--- Тест: " + description + " ---");
        System.out.println("Массив: " + arrayToString(arr));
        System.out.println("Target: " + target);

        int first = searcher.firstCount(arr, target);
        int last = searcher.lastCount(arr, target);

        System.out.println("firstCount() → " + first);
        System.out.println("lastCount()  → " + last);
        System.out.println();
    }

    private static String arrayToString(int[] arr) {
        if (arr == null) return "null";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}

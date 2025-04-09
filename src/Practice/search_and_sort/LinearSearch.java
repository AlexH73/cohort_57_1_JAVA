package Practice.search_and_sort;

/**
 * 📌 Условие:
 * Дан массив целых чисел и число target. Найди индекс этого числа в массиве. Если не найден — верни -1.
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int target = 30;
        System.out.println("Индекс: " + liniarSearch(nums, target));// Ожидаемый результат: 2


    }

    public static int liniarSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

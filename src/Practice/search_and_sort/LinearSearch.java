package Practice.search_and_sort;


public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int target = 30;
        System.out.println("Индекс: " + searchIndex(nums, target));// Ожидаемый результат: 2
        System.out.println("Присутствует: " + target + " в массиве? " + (presenceOfElement(nums, target)? "Да" : "Нет")); // Ожидаемый результат: Да


    }

    /**
     * 📌 Условие:
     * Дан массив целых чисел и число target. Найди индекс этого числа в массиве. Если не найден — верни -1.
     */
    public static int searchIndex (int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 📌 Условие:
     * Проверь, существует ли число target в массиве.
     */
    public static boolean presenceOfElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}

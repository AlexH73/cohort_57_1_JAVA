package Homework.lesson_38.HomeworkYulia_38;

public class BinarySearchHomework {
    public int firstCount(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // Продолжаем поиск влево
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public int lastCount(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // Продолжаем поиск вправо
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    // Пример использования:
    public static void main(String[] args) {
        BinarySearchHomework bsh = new BinarySearchHomework();
        int[] nums = {1, 2, 2, 2, 3, 4, 5};

        int first = bsh.firstCount(nums, 2); // ожидается 1
        int last = bsh.lastCount(nums, 2);   // ожидается 3

        System.out.println("Первое вхождение: " + first);
        System.out.println("Последнее вхождение: " + last);
    }
}



package Lessons.Lesson_37.src.teacher_code;

public class TeacherCode3 {
    static int counter = 0;

    public static void main(String[] args) {

    }

    // O(1) - константное время выполнения. Всегда выполняется только 1 операция
    private static int methodA(int[] nums) {

        int result = nums[nums.length - 2];

        return result;
    }

    // O(1) тк вне зависимости от изменяемых параметров (различная длина массивов),
    // количество операций останется неизменным и будет выполнятся за одно и то же время в худшем случае
    private static boolean methodB(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return true;
        }
        System.out.println("Массив номер 1 не достаточно длинный!");
        // creating log files

        return false;
    }

    private static void methodC(int[] num) {
        int x = num[0] + num[num.length - 1]; // O(1) const

        int iter = x > num.length ? num.length : x; // O(1) const

        // O(n)
        for (int i = 0; i < iter; i++) {
            System.out.println(i);
        }
    }


    // 10 -> 21
    // 20 -> 41
    // 40 -> 81
    // 80 -> 161
    // 300 -> 601
    // n -> 2 * n + 1 -> O(2n + 1) -> удаляем кнстанты, которые не влияют на результат -> O(n)
    private static void methodD(int[] num) {
        // O(n)
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        // O(1)
        System.out.println();

        // O (n)
        for (int i = num.length-1; i >=0; i--) {
            System.out.print(num[i] + " ");
        }
    }

    // O(n) + O(m) -> в худшем случае, длины массивов одинаково большие, тогда ->
    // -> O(n + n) -> O(2n) -> сокращаем константы -> O(n)
    private static void methodD(int[] nums1, String[] strings) {
        int n = nums1.length;
        int m = strings.length;

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
    }

    // O(x) * O(y) ->  худшем случае эти числа одинаково большие, тогда ->
    // O(x * x) ->
    // O(x^3) != O(x^2)
    private static void methodE(int x, int y) {
        // O(x)
        for (int i = 0; i < x; i++) {
            // O(y)
            for (int j = 0; j < y; j++) {
                System.out.println("x * y = " + x * y);
                for (int k = 0; k < x; k++) {
                    System.out.println("x * x *x = " + x * x * x);
                }
            }
        }
    }

    // O(x) * O(y) + O(z)  ->  худшем случае эти числа одинаково большие, тогда ->
    // O(x * x + 6 * x) -> O(x^2 + 6 * x) -> O(x^2 + x) ->  тк в данном примере квадратичная сложность оказывает существенно большее
    // влияение, чем линейная, мы можем  пренебречь линейной в пользу более сложной для упрощения оценки сложности ->
    // O(x^2)
    private static void methodE(int x, int y, int z) {
        // O(x)
        for (int i = 0; i < x; i++) {
            // O(y)
            for (int j = 0; j < y; j++) {
                System.out.println("x * y = " + x * y);// единица времени
            }
        }

        for (int k = 0; k < z; k++) {
            System.out.println(k);
        }
        for (int k = 0; k < z; k++) {
            System.out.println(k);
        }
        for (int k = 0; k < z; k++) {
            System.out.println(k);
        }
        for (int k = 0; k < z; k++) {
            System.out.println(k);
        }
        for (int k = 0; k < z; k++) {
            System.out.println(k);
        }
        for (int k = 0; k < z; k++) {
            System.out.println(k);
        }

    }

}

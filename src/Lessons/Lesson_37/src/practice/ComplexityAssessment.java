package Lessons.Lesson_37.src.practice;

public class ComplexityAssessment {

    // Метод 1
    /**
     * Выполняет константную операцию, затем итерируется от 0 до n с выводом индекса.
     *
     * <p>Анализ временной сложности:</p>
     *
     * <ul>
     *   <li><b>Строка 1:</b> {@code System.out.println("Constant operation")} —
     *       выполняется один раз независимо от размера входных данных, что даёт
     *       константную временную сложность — {@code O(1)}.</li>
     *
     *   <li><b>Цикл:</b> {@code for (int i = 0; i < n; i++)} —
     *       итерации выполняются {@code n} раз, и на каждой итерации вызывается
     *       {@code System.out.println(i)}, что также выполняется за {@code O(1)}.</li>
     *
     *   <li>Таким образом, цикл в целом выполняется за {@code O(n)}.</li>
     * </ul>
     *
     * <p><b>Общая временная сложность:</b></p>
     * <pre>
     *     O(1) + O(n) = O(n)
     * </pre>
     *
     * <p>При анализе асимптотики константы не учитываются, поэтому итоговая
     * временная сложность метода — {@code O(n)}.</p>
     *
     * @param n Количество итераций цикла, влияет на линейный рост количества операций.
     */
    public static void method1(int n) {
        System.out.println("Constant operation"); // O(1)
        for (int i = 0; i < n; i++) {             // O(n)
            System.out.println(i);                // O(1) на каждую итерацию
        }
    }

    // Метод 2
    /**
     * Выполняет цикл, в котором переменная {@code i} увеличивается на 2 на каждой итерации
     * до тех пор, пока {@code i < n}. На каждой итерации выводится значение {@code i}.
     *
     * <p>Анализ временной сложности:</p>
     *
     * <ul>
     *   <li><b>Цикл:</b> {@code for (int i = 0; i < n; i += 2)} —
     *       переменная {@code i} инкрементируется на 2, а не на 1, как в стандартном цикле.
     *       Это значит, что общее количество итераций будет примерно {@code n / 2}.</li>
     *
     *   <li>На каждой итерации выполняется одна операция вывода {@code System.out.println(i)},
     *       которая выполняется за константное время — {@code O(1)}.</li>
     *
     *   <li>Итого, цикл выполняется {@code n / 2} раз × {@code O(1)} операция =
     *       {@code O(n / 2)}.</li>
     * </ul>
     *
     * <p><b>Общая временная сложность:</b></p>
     * <pre>
     *     O(n / 2) → O(n)
     * </pre>
     *
     * <p>Так как в асимптотическом анализе константы отбрасываются, итоговая
     * временная сложность метода — {@code O(n)}.</p>
     *
     * @param n Верхняя граница диапазона значений, влияющая на количество итераций.
     */
    public static void method2(int n) {
        for (int i = 0; i < n; i += 2) {
            System.out.println(i); // O(1) на каждую итерацию
        }
    }


    // Метод 3
    public static void method3(int n) {
        System.out.println("Start");
        System.out.println("Another constant operation");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + j);
            }
        }
    }

    // Метод 4
    public static void method4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i * j);
            }
        }
    }

    // Метод 5
    public static void method5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j += 2) {
                System.out.println(i + j);
            }
        }
    }

    // Метод 6
    public static void method6(int n) {
        System.out.println(n * 10);
    }

    // Метод 7
    public static void method7(int n) {
        System.out.println("Constant operation");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.println(i + j + k);
                }
            }
        }
    }

    // Метод 8
    public static void method8(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i * j);
            }
        }
    }
}


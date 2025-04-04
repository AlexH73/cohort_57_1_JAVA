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
    /**
     * Выполняет две константные операции и двойной вложенный цикл.
     * Во внутреннем цикле происходит вывод суммы индексов {@code i + j}.
     *
     * <p>Анализ временной сложности:</p>
     *
     * <ul>
     *   <li><b>Константные операции:</b>
     *     <ul>
     *       <li>{@code System.out.println("Start")}</li>
     *       <li>{@code System.out.println("Another constant operation")}</li>
     *     </ul>
     *     Обе выполняются один раз, независимо от входного параметра {@code n}, то есть — {@code O(1)}.</li>
     *
     *   <li><b>Внешний цикл:</b> {@code for (int i = 0; i < n; i++)} —
     *       выполняется {@code n} раз.</li>
     *
     *   <li><b>Внутренний цикл:</b> {@code for (int j = 0; j < n; j++)} —
     *       выполняется {@code n} раз для каждой итерации внешнего цикла.</li>
     *
     *   <li>Итого, вложенные циклы выполняют {@code n * n = n²} итераций, и на каждой итерации
     *       выполняется операция вывода {@code System.out.println(i + j)} — она считается как {@code O(1)}.</li>
     * </ul>
     *
     * <p><b>Общая временная сложность:</b></p>
     * <pre>
     *     O(1) (константы) + O(n²) (вложенные циклы) = O(n²)
     * </pre>
     *
     * <p>Так как при асимптотическом анализе константы не учитываются,
     * итоговая временная сложность метода — {@code O(n²)}.</p>
     *
     * @param n Размер входных данных, определяет количество итераций обоих циклов.
     */
    public static void method3(int n) {
        System.out.println("Start");                     // O(1)
        System.out.println("Another constant operation");// O(1)
        for (int i = 0; i < n; i++) {                    // O(n)
            for (int j = 0; j < n; j++) {                // O(n) вложенный
                System.out.println(i + j);               // O(1)
            }
        }
    }

    // Метод 4
    /**
     * Выполняет два вложенных цикла: внешний зависит от {@code n}, а внутренний всегда выполняется 10 раз.
     * На каждой итерации внутреннего цикла выводится произведение индексов {@code i * j}.
     *
     * <p>Анализ временной сложности:</p>
     *
     * <ul>
     *   <li><b>Внешний цикл:</b> {@code for (int i = 0; i < n; i++)} —
     *       выполняется {@code n} раз.</li>
     *
     *   <li><b>Внутренний цикл:</b> {@code for (int j = 0; j < 10; j++)} —
     *       выполняется всегда 10 раз, независимо от {@code n}.
     *       Это константное количество итераций, поэтому сложность {@code O(10) = O(1)}.</li>
     *
     *   <li>На каждой итерации внутреннего цикла выполняется {@code System.out.println(i * j)},
     *       что занимает {@code O(1)}.</li>
     * </ul>
     *
     * <p><b>Общая временная сложность:</b></p>
     * <pre>
     *     O(n * 10) = O(n)
     * </pre>
     *
     * <p>Так как в асимптотическом анализе константы отбрасываются, итоговая временная сложность метода — {@code O(n)}.</p>
     *
     * @param n Количество итераций внешнего цикла, определяющее общее количество операций.
     */
    public static void method4(int n) {
        for (int i = 0; i < n; i++) {      // O(n)
            for (int j = 0; j < 10; j++) { // O(10) → O(1)
                System.out.println(i * j); // O(1)
                // Вывод: хотя у нас вложенные циклы, внутренний выполняется
                // фиксированное количество раз (10), что считается константой.
                // Поэтому сложность — O(n), а не O(n²).
            }
        }
    }

    // Метод 5
    /**
     * Выполняет два вложенных цикла: внешний зависит от {@code n}, а внутренний увеличивает {@code j} на 2 в каждой итерации.
     * На каждой итерации внутреннего цикла выводится сумма индексов {@code i + j}.
     *
     * <p>Анализ временной сложности:</p>
     *
     * <ul>
     *   <li><b>Внешний цикл:</b> {@code for (int i = 0; i < n; i++)} —
     *       выполняется {@code n} раз.</li>
     *
     *   <li><b>Внутренний цикл:</b> {@code for (int j = 0; j < n; j += 2)} —
     *       здесь {@code j} увеличивается на 2, а не на 1, то есть количество итераций
     *       в каждом проходе составляет примерно {@code n / 2}.</li>
     *
     *   <li>На каждой итерации выполняется {@code System.out.println(i + j)}, что занимает {@code O(1)}.</li>
     * </ul>
     *
     * <p><b>Общая временная сложность:</b></p>
     * <pre>
     *     O(n * (n / 2)) = O(n² / 2) → O(n²)
     * </pre>
     *
     * <p>Так как в асимптотическом анализе константы отбрасываются, итоговая временная сложность метода — {@code O(n²)}.</p>
     *
     * @param n Определяет количество итераций внешнего цикла и влияет на вложенный цикл.
     */
    public static void method5(int n) {
        for (int i = 0; i < n; i++) {      // O(n)
            for (int j = 0; j < n; j += 2) { // O(n / 2) → O(n)
                System.out.println(i + j); // O(1)
                //Вывод: несмотря на то, что внутренний цикл выполняется n / 2 раз,
                // это все равно приводит к квадратичной сложности O(n²),
                // так как множители 1/2 отбрасываются при асимптотическом анализе.
            }
        }
    }

    // Метод 6
    /**
     * Выполняет одну операцию умножения числа {@code n} на 10 и выводит результат.
     * Эта операция выполняется за константное время.
     *
     * <p>Анализ временной сложности:</p>
     *
     * <ul>
     *   <li>Операция умножения {@code n * 10} выполняется за {@code O(1)}.</li>
     *   <li>Операция вывода {@code System.out.println(n * 10)} также выполняется за {@code O(1)}.</li>
     * </ul>
     *
     * <p><b>Общая временная сложность:</b></p>
     * <pre>
     *     O(1)
     * </pre>
     *
     * <p>Итоговая временная сложность метода — {@code O(1)}.</p>
     *
     * @param n Число, которое умножается на 10 и выводится.
     */
    public static void method6(int n) {
        System.out.println(n * 10); // O(1)
        // поскольку метод выполняет
        // только одну операцию умножения и вывод,
        // его временная сложность — O(1), то есть константная.
    }

    // Метод 7
    /**
     * Выполняет одну константную операцию и три вложенных цикла, каждый из которых зависит от {@code n}.
     * На каждой итерации самого внутреннего цикла выполняется вывод суммы индексов {@code i + j + k}.
     *
     * <p>Анализ временной сложности:</p>
     *
     * <ul>
     *   <li><b>Константная операция:</b>
     *     {@code System.out.println("Constant operation")} выполняется один раз, независимо от {@code n}, то есть — {@code O(1)}.</li>
     *
     *   <li><b>Внешний цикл:</b> {@code for (int i = 0; i < n; i++)} — выполняется {@code n} раз.</li>
     *
     *   <li><b>Средний цикл:</b> {@code for (int j = 0; j < n; j++)} — выполняется {@code n} раз для каждой итерации внешнего цикла.</li>
     *
     *   <li><b>Внутренний цикл:</b> {@code for (int k = 0; k < n; k++)} — выполняется {@code n} раз для каждой итерации среднего цикла.</li>
     *
     *   <li>Итого, три вложенных цикла выполняют {@code n * n * n = n³} итераций, и на каждой итерации выполняется операция вывода {@code System.out.println(i + j + k)}, что занимает {@code O(1)}.</li>
     * </ul>
     *
     * <p><b>Общая временная сложность:</b></p>
     * <pre>
     *     O(1) (константа) + O(n³) (три вложенных цикла) = O(n³)
     * </pre>
     *
     * <p>Так как при асимптотическом анализе константы не учитываются,
     * итоговая временная сложность метода — {@code O(n³)}.</p>
     *
     * @param n Количество итераций всех трех циклов, определяющее общее количество операций.
     */
    public static void method7(int n) {
        System.out.println("Constant operation");  // O(1)
        for (int i = 0; i < n; i++) {              // O(n)
            for (int j = 0; j < n; j++) {          // O(n)
                for (int k = 0; k < n; k++) {      // O(n)
                    System.out.println(i + j + k); // O(1)
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


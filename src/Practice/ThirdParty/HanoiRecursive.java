package Practice.ThirdParty;

/**
 * Принцип KISS (Keep It Simple, Stupid) предполагает,
 * что решения должны быть максимально простыми и понятными.
 * Задача о ханойских башнях — отличная задача для демонстрации
 * рекурсивного и итеративного подходов. Вот реализации обоих подходов с учетом принципа KISS.
 */
public class HanoiRecursive {

    /**
     * <h1>Рекурсивная реализация</h1>
     *
     * Рекурсивный подход является естественным для задачи о ханойских башнях,
     * так как она включает решение подзадач меньшего размера.
     */
    public static void solveHanoi(int n, char source, char target, char auxiliary) {
        if (n == 1) {
            System.out.println("Переместить диск 1 с " + source + " на " + target);
            return;
        }

        solveHanoi(n - 1, source, auxiliary, target);
        System.out.println("Переместить диск " + n + " с " + source + " на " + target);
        solveHanoi(n - 1, auxiliary, target, source);
    }
    public static void main(String[] args) {
        int n = 3; // Количество дисков
        solveHanoi(n, 'A', 'C', 'B');
    }
}

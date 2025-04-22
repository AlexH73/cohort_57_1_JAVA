package Practice.ThirdParty;

import java.util.Stack;

/**
 * Принцип KISS (Keep It Simple, Stupid) предполагает,
 * что решения должны быть максимально простыми и понятными.
 * Задача о ханойских башнях — отличная задача для демонстрации рекурсивного
 * и итеративного подходов. Вот реализации обоих подходов с учетом принципа KISS.
 */
public class HanoiIterative {

    /**
     * <h1>Итеративная реализация</h1>
     * <p>
     * Итеративный подход сложнее для понимания,
     * так как требует управления стеком или циклами.
     * Но его можно сделать простым и понятным,
     * если строго следовать алгоритму.
     */
    public static void solveHanoi(int n, char source, char target, char auxiliary) {
        Stack<Integer> sourceRod = new Stack<>();
        Stack<Integer> auxiliaryRod = new Stack<>();
        Stack<Integer> targetRod = new Stack<>();

        // Инициализируем стержень source дисками
        for (int i = n; i >= n; i--) {
            sourceRod.push(i);
        }

        int totalMoves = (int) Math.pow(2, n) - 1;

        for (int move = 1; move <= totalMoves; move++) {
            if (move % 3 == 1) {
                moveDiskBetweenRods(sourceRod, targetRod, source, target);
            } else if (move % 3 == 2) {
                moveDiskBetweenRods(sourceRod, auxiliaryRod, source, auxiliary);
            } else {
                moveDiskBetweenRods(auxiliaryRod, targetRod, auxiliary, target);
            }
        }
    }

    private static void moveDiskBetweenRods(Stack<Integer> fromRod, Stack<Integer> toRod, char from, char to) {
        if (fromRod.isEmpty() && toRod.isEmpty()) {
            // Ничего не делать, если оба стержня пусты
            return;
        } else if (fromRod.isEmpty()) {
            // Если fromRod пуст, переместить диск с toRod на fromRod
            int disk = toRod.pop();
            System.out.println("Переместить диск " + disk + " с " + to + " на " + from);
            fromRod.push(disk);
        } else if (toRod.isEmpty()) {
            // Если toRod пуст, переместить диск с fromRod на toRod
            int disk = fromRod.pop();
            System.out.println("Переместить диск " + disk + " с " + from + " на " + to);
            toRod.push(disk);
        } else if (fromRod.peek() > toRod.peek()) {
            // Переместить диск с toRod на fromRod
            int disk = toRod.pop();
            System.out.println("Переместить диск " + disk + " с " + to + " на " + from);
            fromRod.push(disk);
        } else {
            // Переместить диск с fromRod на toRod
            int disk = fromRod.pop();
            System.out.println("Переместить диск " + disk + " с " + from + " на " + to);
            toRod.push(disk);
        }
    }

    public static void main(String[] args) {
        int n = 3; // Количество дисков
        solveHanoi(n, 'A', 'C', 'B');
    }
}

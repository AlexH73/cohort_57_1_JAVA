package Lessons.Lesson_33.code;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Очередь (Queue) — это структура данных, работающая по принципу FIFO (First In, First Out).
 * Это означает, что первый добавленный элемент будет извлечён первым.
 *
 * 🔹 Основные операции:
 * - `offer(element)`: Добавляет элемент в конец очереди.
 * - `poll()`: Удаляет и возвращает первый элемент (или null, если очередь пуста).
 * - `peek()`: Получает первый элемент без удаления (или null, если очередь пуста).
 * - `remove(element)`: Удаляет конкретный элемент из очереди.
 * - `contains(element)`: Проверяет, есть ли элемент в очереди.
 * - `size()`: Возвращает размер очереди.
 * - `clear()`: Полностью очищает очередь.
 * - `isEmpty()`: Проверяет, пуста ли очередь.
 * - `addAll(collection)`: Добавляет все элементы из другой коллекции.
 */
public class QueueOperationsDemo {
    public static void main(String[] args) {
        // Создание очереди
        Queue<String> queue = new LinkedList<>();

        // Добавление элементов (enqueue)
        queue.offer("Первый");
        queue.offer("Второй");
        queue.offer("Третий");
        queue.offer("Четвёртый");

        System.out.println("Исходная очередь: " + queue);

        // Удаление элемента из начала очереди (dequeue)
        System.out.println("Удалён первый элемент: " + removedElement);
        System.out.println("Очередь после удаления: " + queue);

        // Получение первого элемента без удаления
        System.out.println("Первый элемент без удаления: " + queue.peek());

        // Проверка наличия элемента
        System.out.println("Очередь содержит 'Третий'? " + queue.contains("Третий"));

        // Итерация по очереди
        System.out.print("Итерация по очереди: ");
        for (String item : queue) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Удаление конкретного элемента
        queue.remove("Третий");
        System.out.println("Очередь после удаления 'Третий': " + queue);

        // Добавление всей коллекции в очередь
        Queue<String> additionalQueue = new LinkedList<>();
        additionalQueue.offer("Новый1");
        additionalQueue.offer("Новый2");
        queue.addAll(additionalQueue);
        System.out.println("Очередь после добавления новой коллекции: " + queue);

        // Размер очереди
        System.out.println("Размер очереди: " + queue.size());

        // Очистка очереди
        queue.clear();
        System.out.println("Очередь после очистки: " + queue);

        // Проверка, пуста ли очередь
        System.out.println("Очередь пуста? " + queue.isEmpty());
    }
}
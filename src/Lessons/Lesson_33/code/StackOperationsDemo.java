package Lessons.Lesson_33.code;

import java.util.Stack;
import java.util.Collections;

/**
 * Стек (Stack) — это структура данных, работающая по принципу LIFO (Last In, First Out).
 * Это означает, что последний добавленный элемент будет извлечён первым.
 *
 * 🔹 Основные операции:
 * - `push(element)`: Добавляет элемент в стек.
 * - `pop()`: Удаляет и возвращает верхний элемент (выбрасывает исключение, если стек пуст).
 * - `peek()`: Получает верхний элемент без удаления.
 * - `search(element)`: Возвращает позицию элемента (от 1), либо -1, если элемента нет.
 * - `contains(element)`: Проверяет, есть ли элемент в стеке.
 * - `size()`: Возвращает размер стека.
 * - `clear()`: Полностью очищает стек.
 * - `isEmpty()`: Проверяет, пуст ли стек.
 * - `remove(element)`: Удаляет конкретный элемент из стека.
 * - `reverse()`: Переворачивает порядок элементов в стеке.
 */
public class StackOperationsDemo {
    public static void main(String[] args) {
        // Создание стека
        Stack<String> stack = new Stack<>();

        // Добавление элементов (push)
        stack.push("Элемент 1");
        stack.push("Элемент 2");
        stack.push("Элемент 3");
        stack.push("Элемент 4");

        System.out.println("Исходный стек: " + stack);

        // Удаление верхнего элемента (pop)
        String removedElement = stack.pop();
        System.out.println("Удалён верхний элемент: " + removedElement);
        System.out.println("Стек после удаления: " + stack);

        // Получение верхнего элемента без удаления (peek)
        System.out.println("Верхний элемент без удаления: " + stack.peek());

        // Поиск элемента в стеке
        int position = stack.search("Элемент 2");
        System.out.println("Позиция 'Элемент 2' в стеке: " + (position == -1 ? "Не найден" : position));

        // Проверка наличия элемента
        System.out.println("Стек содержит 'Элемент 3'? " + stack.contains("Элемент 3"));

        // Итерация по стеку
        System.out.print("Итерация по стеку: ");
        for (String item : stack) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Удаление конкретного элемента
        stack.remove("Элемент 2");
        System.out.println("Стек после удаления 'Элемент 2': " + stack);

        // Реверсирование стека
        Collections.reverse(stack);
        System.out.println("Стек после реверсирования: " + stack);

        // Размер стека
        System.out.println("Размер стека: " + stack.size());

        // Очистка стека
        stack.clear();
        System.out.println("Стек после очистки: " + stack);

        // Проверка, пуст ли стек
        System.out.println("Стек пуст? " + stack.isEmpty());
    }
}
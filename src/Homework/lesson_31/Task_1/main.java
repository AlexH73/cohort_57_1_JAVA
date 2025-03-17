package Homework.lesson_31.Task_1;

public class main {
    public static void main(String[] args){
        CollectionOperations operations = new CollectionOperations();

        //Добавляем один элемент
        operations.addElement("Apple");

        // Добавляем несколько элементов сразу
        operations.addAllElements(new String[]{"Apple", "Banana", "Cherry", "Banana", "Apple"});

        // Считаем уникальные элементы
        System.out.println("Количество уникальных элементов: " + operations.countUniqueElements());
    }
}
 /**
 * Анализ сложности кода:
 * Добавление элемента: O(1)
 * Добавление множества элементов: O(n), где n – количество добавляемых элементов.
 * Подсчёт уникальных элементов: O(1)
 * Это оптимальная реализация.
 **/
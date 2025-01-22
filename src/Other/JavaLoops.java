// Этот файл содержит примеры и описания всех типов циклов в Java
package Other;

public class JavaLoops {

    public static void main(String[] args) {
        // Пример цикла 'for'
        System.out.println("Пример цикла 'for':");
        System.out.println("Используется, когда известно точное количество итераций.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Итерация " + i);
        }

        // Пример цикла 'while'
        System.out.println("\nПример цикла 'while':");
        System.out.println("Используется, когда количество итераций неизвестно заранее, но зависит от условия.");
        int count = 0;
        while (count < 5) {
            System.out.println("Значение count: " + count);
            count++;
        }

        // Пример цикла 'do-while'
        System.out.println("\nПример цикла 'do-while':");
        System.out.println("Выполняется хотя бы одна итерация, так как проверка условия идет после тела цикла.");
        int number = 0;
        do {
            System.out.println("Значение number: " + number);
            number++;
        } while (number < 5);

        // Пример улучшенного цикла 'for-each'
        System.out.println("\nПример цикла 'for-each':");
        System.out.println("Используется для перебора элементов массива или коллекции.");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Значение: " + num);
        }
    }
}

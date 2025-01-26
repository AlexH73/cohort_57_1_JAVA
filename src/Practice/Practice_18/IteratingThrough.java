//Задание 6: Перебор массива и вывод его элементов
//Код на Python:
//
//def print_array_elements(arr):
//for elem in arr:
//print(f"Element: {elem}")
//
//array = [10, 20, 30, 40, 50]
//print_array_elements(array)
package Practice.Practice_18;

public class IteratingThrough {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 50}; // Инициализация массива
        printArrayElements(array); // Вызов метода для вывода элементов массива
    }

    // Метод для перебора массива и вывода его элементов
    public static void printArrayElements(int[] arr) {
        for (int elem : arr) { // Перебор элементов массива с использованием цикла for-each
            System.out.println("Элемент: " + elem); // Вывод каждого элемента
        }
    }
}

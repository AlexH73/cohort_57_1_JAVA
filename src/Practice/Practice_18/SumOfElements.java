//Задание 7: Подсчитать сумму всех элементов в массиве
//Код на Python:
//
//def sum_array(numbers):
//total = 0
//for num in numbers:
//total += num
//return total
//
//numbers = [1, 2, 3, 4, 5]
//print(f"Sum of array: {sum_array(numbers)}")
package Practice.Practice_18;

public class SumOfElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Инициализация массива
        int sum = sumArray(numbers); // Вызов метода для подсчета суммы элементов массива
        System.out.println("Сумма массива: " + sum); // Вывод результата
    }

    // Метод для подсчета суммы всех элементов в массиве
    public static int sumArray(int[] numbers) {
        int total = 0; // Инициализация переменной для хранения суммы
        for (int num : numbers) { // Перебор элементов массива с использованием цикла for-each
            total += num; // Добавление текущего элемента к общей сумме
        }
        return total; // Возврат общей суммы
    }
}

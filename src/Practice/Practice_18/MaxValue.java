//Задание 4: Найти максимальное значение в массиве
//Код на Python:
//
//def find_max(numbers):
//max_value = numbers[0]
//for num in numbers:
//if num > max_value:
//max_value = num
//return max_value
//
//numbers = [1, 3, 5, 7, 2]
//print(f"Max value: {find_max(numbers)}")

package Practice.Practice_18;

public class MaxValue {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 2}; // Инициализация массива
        int maxValue = findMax(numbers); // Вызов метода для нахождения максимального значения
        System.out.println("Максимальное значение в массиве: " + maxValue); // Вывод результата
    }

    // Метод для нахождения максимального значения в массиве
    public static int findMax(int[] numbers) {
        int maxValue = numbers[0]; // Инициализация maxValue первым элементом массива
        for (int num : numbers) { // Перебор элементов массива
            if (num > maxValue) { // Если текущий элемент больше maxValue
                maxValue = num; // Обновление maxValue
            }
        }
        return maxValue; // Возврат максимального значения
    }
}

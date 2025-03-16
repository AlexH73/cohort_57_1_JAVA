package Independent_work;

// Создадим метод для поиска максимального элемента массива:

public class MaxFinder {
    public static int findMax(int[] numbers) throws IllegalAccessException {
        // Проверка на пустой массив
        if (numbers == null || numbers.length == 0) {
            throw new IllegalAccessException("Массив не должен быть пустым");
        }
        int max = numbers[0];  // Изначально считаем первым элементом максимальным

        // проходим по массиву, начиная со второго элемента
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // нашли элемент больше текущего максимума

            }

        }
        return max;


    }

    public static void main(String[] args) throws IllegalAccessException {
        int[] numbers = {3, 15, 7, 20, 9, 5};

        int maxNumber = findMax(numbers);
        System.out.println("Наибольшее число в массиве: " + maxNumber);

    }
}

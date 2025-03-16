package Independent_work;


public class MinimumFinder {

    // Метод для поиска минимального значения в массиве
    public static int minimum (int[] numbers) throws IllegalArgumentException {

        // Проверка на пустой массив
        if(numbers == null || numbers.length ==0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        // Инициализация минимального значения первым элементом массива
        int min = numbers[0]; // Изначально считаем первым элементом минимальным

        // Цикл начинается со второго элемента и сравнивает с текущим минимумом
        // проходим по массиву, начиная со второго элемента
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];

            }

        }
        return min; // возвращаем найденный минимум

    }

    public static void main(String[] args) throws IllegalArgumentException {
        int[] numbers = {12, 4, 19, 20, 9, 5, -3};

        int minNumber = minimum(numbers);
        System.out.println("Наименьшее число в массиве: " + minNumber);
    }
}

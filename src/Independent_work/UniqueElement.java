package Independent_work;

import java.util.HashSet;
import java.util.Set;

// Метод, который принимает массив целых чисел и стандартный класс исключений (Exception) в Java,
// обозначает, что метод получил неправильный (недопустимый) аргумент.
public class UniqueElement {
    public static int elements(int[] numbers) throws IllegalArgumentException {

        //проверка на пустой массив
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Массив пустой или не существует");
        }

            // Создаем Set, чтобы хранить уникальные числа
            Set<Integer> uniqueElements = new HashSet<>();

            // Заполняем Set числами из массива
            for (int num:numbers) {
                uniqueElements.add(num);
            }
            return uniqueElements.size();
        }






    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 4, 2, 9, 8};
        int uniqueElements = elements(numbers);
        System.out.println("Уникальных элементов: " + uniqueElements);
    }
}

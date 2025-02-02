package Practice.Practice_20;

public class MultiDimensionalArray {
    /**
     *<b>Дополнительное Изучение:</b> <br>
     * Попробуйте использовать многомерные массивы и выполнить операции с ними.
     * <p>
     * Создание и Инициализация Двумерного Массива
     */
    public static void main(String[] args) {
        // Создаем и инициализируем двумерный массив 3x3
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Выводим элементы двумерного массива
        System.out.println("Исходная матрица:");
        printMatrix(matrix);
    }

    // Метод для вывода двумерного массива
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

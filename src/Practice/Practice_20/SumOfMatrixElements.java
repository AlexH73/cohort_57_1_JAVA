package Practice.Practice_20;

public class SumOfMatrixElements {
    /**
     *<b>Дополнительное Изучение:</b> <br>
     * Попробуйте использовать многомерные массивы и выполнить операции с ними.
     * <p>
     * 1. Нахождение суммы всех элементов
     */
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("Сумма всех элементов матрицы: " + sum);
    }
}

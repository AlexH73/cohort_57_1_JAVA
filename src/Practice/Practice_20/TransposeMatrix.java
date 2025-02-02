package Practice.Practice_20;

public class TransposeMatrix {
    /**
     *<b>Дополнительное Изучение:</b> <br>
     * Попробуйте использовать многомерные массивы и выполнить операции с ними.
     * <p>
     * 2. Транспонирование матрицы
     * <p>
     *Транспонирование матрицы заключается в замене строк на столбцы.
     */
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Транспонированная матрица:");
        printMatrix(transposedMatrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

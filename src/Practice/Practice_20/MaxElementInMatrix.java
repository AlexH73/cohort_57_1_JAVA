package Practice.Practice_20;

public class MaxElementInMatrix {
    /**
     *<b>Дополнительное Изучение:</b> <br>
     * Попробуйте использовать многомерные массивы и выполнить операции с ними.
     * <p>
     * 3. Нахождение максимального элемента
     */
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int maxElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }

        System.out.println("Максимальный элемент в матрице: " + maxElement);
    }
}

package Practice.ThirdParty;

public class Matrix {
    /**
     * <h1>Класс Матрица</h1>
     * <b>Создать класс "Матрица". Класс должен иметь следующие переменные:</b>
     * <p>
     * двумерный массив вещественных чисел;<br>
     * количество строк и столбцов в матрице.<br>
     *
     * <b>Класс должен иметь следующие методы:</b>
     * <p>
     * сложение с другой матрицей;<br>
     * умножение на число;<br>
     * вывод на печать; <br>
     * умножение матриц.
     */

    private double[][] data;
    private int rows;
    private int columns;

    // Конструктор для инициализации матрицы
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    // Конструктор для инициализации матрицы с данными
    public Matrix(double[][] data) {
        this.rows = data.length;
        this.columns = data[0].length;
        this.data = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.data[i][j] = data[i][j];
            }
        }
    }

    // Метод для сложения с другой матрицей
    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.columns != other.columns) {
            throw new IllegalArgumentException("Размеры матриц должны совпадать для сложения");
        }
        Matrix result = new Matrix(this.rows, this.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    // Метод для умножения на число
    public Matrix multiply(double scalar) {
        Matrix result = new Matrix(this.rows, this.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                result.data[i][j] = this.data[i][j] * scalar;
            }
        }
        return result;
    }

    // Метод для умножения на другую матрицу
    public Matrix multiply(Matrix other) {
        if (this.columns != other.rows) {
            throw new IllegalArgumentException("Число столбцов первой матрицы должно быть равно числу строк второй матрицы для умножения");
        }
        Matrix result = new Matrix(this.rows, other.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                for (int k = 0; k < this.columns; k++) {
                    result.data[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return result;
    }

    // Метод для вывода матрицы на печать
    public void print() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.printf("%10.2f", this.data[i][j]);
            }
            System.out.println();
        }
    }
}

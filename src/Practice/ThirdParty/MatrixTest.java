package Practice.ThirdParty;

public class MatrixTest {
    public static void main(String[] args) {
        double[][] data1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double[][] data2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        System.out.println("\nМатрица 1:");
        matrix1.print();

        System.out.println("\nМатрица 2:");
        matrix2.print();

        Matrix sum = matrix1.add(matrix2);
        System.out.println("\nСумма матриц:");
        sum.print();

        Matrix productWithScalar = matrix1.multiply(2);
        System.out.println("\nМатрица 1 умноженная на 2:");
        productWithScalar.print();

        Matrix product = matrix1.multiply(matrix2);
        System.out.println("\nПроизведение матриц:");
        product.print();
    }
}

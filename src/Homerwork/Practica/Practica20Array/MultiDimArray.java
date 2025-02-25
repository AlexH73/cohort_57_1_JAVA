package Homerwork.Practica.Practica20Array;
//4.Работа
public class MultiDimArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Вывод двумерного массива:");
        for (int i = 0; i < matrix.length; i++) {             //Цикл по строкам
            for (int j = 0; j < matrix[i].length; j++) {      //Цикл по столбцам
                System.out.println(matrix[i][j] + " ");       //Вывод элемента
            }
            System.out.println();
        }
    }
}

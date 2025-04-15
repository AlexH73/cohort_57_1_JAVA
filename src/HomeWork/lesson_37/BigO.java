package Homework.lesson_37;

public class BigO {
    
    public static void processData(int[] data) {
        int n = data.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    // Какая-то операция, выполняющаяся за константное время
                    System.out.println("i: " + i + ", j: " + j + ", k: " + k);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = new int[5];
        processData(myArray);
    }
}


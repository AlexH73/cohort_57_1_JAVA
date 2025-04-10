package Homework.lesson_38;

public class BinarySeachRechts {
    public static void main(String[] args) {
        int[] zahlen = {100, 23, 45, 2, 6, -343, 66, -4, 1, 56, 90, 100,-890};
        int suchWert = 100;
        java.util.Arrays.sort(zahlen);
        int ergebnis = lastCount(zahlen, suchWert);

        if (ergebnis != -1) {
            System.out.println("SuchWert gefunden an Position: " + ergebnis);
        } else {
            System.out.println("SuchWert wurde nicht gefunden.");
        }
    }

    public static int lastCount(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // Продолжаем искать вправо
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}


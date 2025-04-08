package EigenesProjeckt;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {100, 23, 45, 2, 6, -343, 66, -4, 1, 56, 90, 100,-890};
        int step = 0;

        // Optimierte Bubble-Sort-Implementierung
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSorted = true;

            for (int j = 0; j < arr.length - 1 - i; j++) { // Unnötige Durchläufe reduzieren
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];

                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
                step++;
            }

            if (isSorted) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.printf("Für die Sortierung eines Arrays der Länge %d wurden %d Schritte benötigt.\n", arr.length, step);
    }
}


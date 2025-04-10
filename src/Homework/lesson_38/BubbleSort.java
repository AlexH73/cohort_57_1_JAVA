package Homework.lesson_38;

public class BubbleSort {
    public static void main(String[] args) {
        int[] zahlen = {100, 23, 45, 2, 6, -343, 66, -4, 1, 56, 90, 100, -890};
        bubbleSort(zahlen);

        // Sortierte Liste ausgeben
        for (int zahl : zahlen) {
            System.out.print(zahl + " ");
        }
    }

    public static void bubbleSort(int[] zahlen) {
        // Äußere Schleife für die Anzahl der Durchgänge
        for (int i = 0; i < zahlen.length - 1; i++) {
            boolean istSortiert = true; // Flag zum Überprüfen, ob bereits sortiert

            // Innere Schleife zum Vergleichen und Tauschen der Werte
            for (int j = 0; j < zahlen.length - 1 - i; j++) {
                if (zahlen[j] > zahlen[j + 1]) {
                    // Elemente tauschen
                    int temp = zahlen[j];
                    zahlen[j] = zahlen[j + 1];
                    zahlen[j + 1] = temp;

                    istSortiert = false; // Flag auf "nicht sortiert" setzen
                }
            }

            // Wenn kein Element mehr vertauscht wurde, ist die Liste bereits sortiert
            if (istSortiert) {
                break; // Schleife vorzeitig abbrechen
            }
        }
    }
}


package Homework.lesson_38;

public class BubbleSortMitZähler {
    public static void main(String[] args) {
        int[] zahlen = {100, 23, 45, 2, 6, -343, 66, -4, 1, 56, 90, 100, -890};
        bubbleSort(zahlen);
    }

    public static void bubbleSort(int[] zahlen) {
        int vergleiche = 0; // Zähler für die Anzahl der Vergleiche
        int tausche = 0;   // Zähler für die Anzahl der Tauschaktionen

        for (int i = 0; i < zahlen.length - 1; i++) {
            boolean istSortiert = true;

            for (int j = 0; j < zahlen.length - 1 - i; j++) {
                vergleiche++; // Zähle jeden Vergleich

                if (zahlen[j] > zahlen[j + 1]) {
                    // Elemente tauschen
                    int temp = zahlen[j];
                    zahlen[j] = zahlen[j + 1];
                    zahlen[j + 1] = temp;

                    tausche++; // Zähle jede Tauschaktion
                    istSortiert = false;
                }
            }

            // Wenn keine Tauschaktionen mehr stattfinden, ist die Liste sortiert
            if (istSortiert) {
                break;
            }
        }

        // Ergebnisse ausgeben
        System.out.println("Sortierte Liste:");
        for (int zahl : zahlen) {
            System.out.print(zahl + " ");
        }
        System.out.println("\nAnzahl der Vergleiche: " + vergleiche);
        System.out.println("Anzahl der Tauschaktionen: " + tausche);
    }
}



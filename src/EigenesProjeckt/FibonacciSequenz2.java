package EigenesProjeckt;

import java.util.Scanner;

public class FibonacciSequenz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabeaufforderung
        System.out.print("Geben Sie die Anzahl der Fibonacci-Zahlen ein (mindestens 2): ");
        int count = scanner.nextInt();

        // Prüfung von 'count'
        if (count < 2) {
            System.out.println("Ungültige Eingabe. Die Anzahl der Fibonacci-Zahlen muss mindestens 2 sein.");
        } else {
            // Initialisierung der ersten beiden Zahlen und der Summe
            int n1 = 0, n2 = 1, n3, sum = n1 + n2;

            System.out.print(n1 + " " + n2); // Ausgabe der ersten beiden Zahlen

            // Berechnung der Fibonacci-Zahlen und Summierung
            for (int i = 2; i < count; i++) {
                n3 = n1 + n2; // Berechne die nächste Zahl
                System.out.print(" " + n3); // Gib die Zahl aus
                sum += n3; // Füge die Zahl zur Summe hinzu
                n1 = n2; // Verschiebe n1 nach n2
                n2 = n3; // Verschiebe n2 nach n3
            }

            // Gesamtsumme ausgeben
            System.out.println("\nGesamtsumme der Fibonacci-Zahlen: " + sum);
        }
    }
}

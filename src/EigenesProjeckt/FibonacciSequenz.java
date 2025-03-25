package EigenesProjeckt;

public class FibonacciSequenz {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;
        int count = 20; // Anzahl der Zahlen, die berechnet werden sollen

        System.out.print(n1 + " " + n2); // Die ersten beiden Zahlen der Sequenz

        for (int i = 2; i < count; i++) { // Beginne ab der dritten Zahl
            n3 = n1 + n2; // Berechne die nächste Zahl
            System.out.print(" " + n3); // Gib die Zahl aus
            n1 = n2; // Verschiebe n1 nach n2
            n2 = n3; // Verschiebe n2 nach n3
        }
    }
}


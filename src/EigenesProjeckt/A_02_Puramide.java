package EigenesProjeckt;

public class A_02_Puramide {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" "); // Leerzeichen für die Ausrichtung
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(i);
            }
            System.out.println(); // Neue Zeile
        }

    }
}

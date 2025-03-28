package EigenesProjeckt;
import java.util.Scanner;

public class DezimalZuBinari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib eine Dezimalzahl ein: ");
        int dezimal = scanner.nextInt();
        String binär = "";

        while (dezimal > 0) {
            binär = (dezimal % 2) + binär; // Reste von rechts nach links sammeln
            dezimal = dezimal / 2;
        }

        System.out.println("Die Binärdarstellung ist: " + binär);
    }
}

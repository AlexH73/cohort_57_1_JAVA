package EigenesProjeckt;

import java.util.Scanner;

public class Quersumme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib eine Zahl ein: ");
        int zahl = scanner.nextInt();
        int quersumme = 0;

        while (zahl > 0) {
            quersumme += zahl % 10; // Letzte Ziffer der Zahl addieren
            zahl = zahl / 10; // Zahl verkleinern, indem die letzte Ziffer entfernt wird
        }

        System.out.println("Die Quersumme ist: " + quersumme);
    }
}

package EigenesProjeckt;

import java.util.Scanner;

public class PrimzahlChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib eine Zahl ein: ");
        int zahl = scanner.nextInt();

        boolean istPrimzahl = true;

        if (zahl <= 1) {
            istPrimzahl = false; // Zahlen kleiner oder gleich 1 sind keine Primzahlen
        } else {
            for (int i = 2; i <= zahl / 2; i++) {
                if (zahl % i == 0) {
                    istPrimzahl = false;
                    break; // Schleife beenden, da ein Teiler gefunden wurde
                }
            }
        }

        if (istPrimzahl) {
            System.out.println(zahl + " ist eine Primzahl.");
        } else {
            System.out.println(zahl + " ist keine Primzahl.");
        }
    }
}


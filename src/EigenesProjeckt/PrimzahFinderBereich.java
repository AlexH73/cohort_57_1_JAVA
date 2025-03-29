package EigenesProjeckt;

public class PrimzahFinderBereich {
    public static void main(String[] args) {
        int start = 1, ende = 50;

        System.out.println("Primzahlen zwischen " + start + " und " + ende + ":");
        for (int zahl = start; zahl <= ende; zahl++) {
            if (istPrimzahl(zahl)) {
                System.out.print(zahl + " ");
            }
        }
    }

    public static boolean istPrimzahl(int zahl) {
        if (zahl <= 1) {
            return false; // Keine Primzahl
        }
        for (int i = 2; i <= zahl / 2; i++) {
            if (zahl % i == 0) {
                return false; // Zahl ist teilbar, also keine Primzahl
            }
        }
        return true; // Primzahl
    }
}


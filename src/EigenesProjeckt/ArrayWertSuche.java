package EigenesProjeckt;

public class ArrayWertSuche {
    public static void main(String[] args) {
        int[] zahlen = {10, 20, 30, 40, 50};
        int gesuchterWert = 30;

        for (int zahl : zahlen) {
            if (zahl == gesuchterWert) {
                System.out.println("Wert gefunden: " + zahl);
                break; // Schleife beenden, da Wert gefunden wurde
            }
        }

    }
}


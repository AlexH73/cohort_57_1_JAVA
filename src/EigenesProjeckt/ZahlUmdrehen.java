package EigenesProjeckt;

public class ZahlUmdrehen {
    public static void main(String[] args) {
        int original = 8765; // Beispielzahl
        int umgekehrt = umkehren(original);
        System.out.println("Die umgekehrte Zahl ist: " + umgekehrt);
    }
    public static int umkehren(int zahl) {
    int umgekehrt = 0; // Variable zur Speicherung der umgekehrten Zahl
    while (zahl > 0) { // Schleife läuft, bis die Zahl 0 ist
        int letzteZiffer = zahl % 10; // Letzte Ziffer der Zahl berechnen
        umgekehrt = umgekehrt * 10 + letzteZiffer; // Ziffer hinzufügen und umkehren
        zahl = zahl / 10; // Zahl verkleinern, indem die letzte Ziffer entfernt wird
    }
    return umgekehrt; // Umgekehrte Zahl zurückgeben
}

}

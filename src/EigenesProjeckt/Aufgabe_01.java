package EigenesProjeckt;
// Schreibe ein Programm, das folgende Muster ausgibt:
// 1
// 22
// 333
// 4444
// 55555

public class Aufgabe_01 {
    public static void main(String[] args) {


    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
        System.out.print(i);
    }
    System.out.println(); // Neue Zeile
}
    }
}



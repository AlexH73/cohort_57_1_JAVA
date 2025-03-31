package EigenesProjeckt;

import java.util.Scanner;

public class PalindromChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib einen Text ein: ");
        String text = scanner.nextLine();
        String umgekehrt = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            umgekehrt += text.charAt(i); // Zeichen von hinten nach vorne hinzufügen
        }

        if (text.equalsIgnoreCase(umgekehrt)) {
            System.out.println("Der Text ist ein Palindrom.");
        } else {
            System.out.println("Der Text ist kein Palindrom.");
        }
    }
}


package Homework.lesson_40;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ColorImageGenerator2 {

    // Methode zur Umwandlung von RGB-Werten in einen Hexadezimal-Farbcode
    public static String rgb(int r, int g, int b) {

        return "#" + toHex(clamp(r)) + toHex(clamp(g)) + toHex(clamp(b));
    }

    // Methode zur Begrenzung der Werte auf den Bereich 0-255
    private static int clamp(int value) {
        return Math.max(0, Math.min(255, value));
    }

    // Methode zur Umwandlung eines Ganzzahlwerts in einen zweistelligen Hexadezimal-String
    private static String toHex(int value) {
        return String.format("%02X", value);
    }

// * Метод создаёт картинку 300x300 пикселей с фоном заданного цвета.
// * @param hexColor строка цвета в формате "RRGGBB", например "9400D3"
// * @param fileName имя выходного файла, например "color.jpg"


    public static void saveColorImage(String hexColor, String fileName) {
        try {
            if (!hexColor.startsWith("#")) {
                hexColor = "#" + hexColor;
            }

            if (hexColor.length() != 7) {
                throw new IllegalArgumentException("Ungültiger Farbcode: " + hexColor);
            }

            BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);
            Color color = Color.decode(hexColor);

            for (int x = 0; x < 300; x++) {
                for (int y = 0; y < 300; y++) {
                    image.setRGB(x, y, color.getRGB());
                }
            }

            File outputFile = new File(fileName);
            ImageIO.write(image, "jpg", outputFile);
            System.out.println("Bild wurde gespeichert: " + outputFile.getAbsolutePath());

            // Bild nach dem Speichern anzeigen
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.open(outputFile); // Öffnet das Bild in der Standardanwendung des Systems
            } else {
                System.err.println("Desktop-Funktionalität wird nicht unterstützt.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Ungültiger Eingabewert: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void saveCheckerboardImage(String color1Hex, String color2Hex, String fileName) {
        try {
            if (!color1Hex.startsWith("#")) {
                color1Hex = "#" + color1Hex;
            }
            if (!color2Hex.startsWith("#")) {
                color2Hex = "#" + color2Hex;
            }

            if (color1Hex.length() != 7 || color2Hex.length() != 7) {
                throw new IllegalArgumentException("Ungültige Farbcodes: " + color1Hex + ", " + color2Hex);
            }

            BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);
            Color color1 = Color.decode(color1Hex);
            Color color2 = Color.decode(color2Hex);

            int squareSize = 30; // Größe eines Quadrats im Schachbrettmuster

            for (int x = 0; x < 300; x++) {
                for (int y = 0; y < 300; y++) {
                    // Berechnung, welche Farbe verwendet wird
                    boolean isColor1 = ((x / squareSize) + (y / squareSize)) % 2 == 0;
                    image.setRGB(x, y, isColor1 ? color1.getRGB() : color2.getRGB());
                }
            }

            File outputFile = new File(fileName);
            ImageIO.write(image, "jpg", outputFile);
            System.out.println("Schachbrett-Bild gespeichert: " + outputFile.getAbsolutePath());

            // Bild direkt öffnen
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.open(outputFile);
            } else {
                System.err.println("Desktop-Funktionalität wird nicht unterstützt.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Ungültiger Eingabewert: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        saveCheckerboardImage("000000", "FFFFFF", "checkerboard.jpg");
    }
}

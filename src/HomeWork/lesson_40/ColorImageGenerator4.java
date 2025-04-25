package Homework.lesson_40;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ColorImageGenerator4 {
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


    public static void saveDynamicRainbowCheckerboardImage(String fileName) {
        try {
            // Farbcodes für den Regenbogen
            String[] colors = {"FF0000", "FFA500", "FFFF00", "008000", "0000FF", "4B0082", "EE82EE"};
            int colorIndex = 0;

            BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);
            int squareSize = 30; // Größe eines Quadrats im Schachbrett

            for (int x = 0; x < 300; x++) {
                for (int y = 0; y < 300; y++) {
                    // Dynamisch wechselnde Farben für jedes Quadrat
                    boolean isNextColor = ((x % squareSize == 0) && y == 0); // Farbwechsel nach jedem Quadrat
                    if (isNextColor) {
                        colorIndex = (colorIndex + 1) % colors.length; // Zyklischer Wechsel der Farben
                    }

                    Color color = Color.decode("#" + colors[colorIndex]);
                    image.setRGB(x, y, color.getRGB());
                }
            }

            File outputFile = new File(fileName);
            ImageIO.write(image, "jpg", outputFile);
            System.out.println("Wechselndes Regenbogen-Schachbrettbild gespeichert: " + outputFile.getAbsolutePath());

            // Bild direkt anzeigen
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.open(outputFile);
            } else {
                System.err.println("Desktop-Funktionalität wird nicht unterstützt.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        saveDynamicRainbowCheckerboardImage("dynamic_rainbow_checkerboard.jpg");
    }

}

# Задача 1.

```java
package Homework.lesson_40;

import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Задание: Реализуйте метод rgb, который принимает три значения от 0 до 255 (красный, зелёный, синий)
 * и возвращает строку с шестнадцатеричным представлением цвета в формате "RRGGBB".
 *
 * Далее результат используется для создания изображения 300x300 пикселей.
 *
 * Примеры:
 *  rgb(255, 255, 255) → "FFFFFF"
 *  rgb(255, 255, 300) → "FFFFFF"
 *  rgb(0, 0, 0)       → "000000"
 *  rgb(148, 0, 211)   → "9400D3"
 */
public class ColorImageGenerator {

    public static String rgb(int r, int g, int b) {
        // TODO: реализовать метод
        return null;
    }

    /**
     * Метод создаёт картинку 300x300 пикселей с фоном заданного цвета.
     * @param hexColor строка цвета в формате "RRGGBB", например "9400D3"
     * @param fileName имя выходного файла, например "color.jpg"
     */
    public static void saveColorImage(String hexColor, String fileName) {
        try {
            BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);
            Color color = Color.decode("#" + hexColor);

            for (int x = 0; x < 300; x++) {
                for (int y = 0; y < 300; y++) {
                    image.setRGB(x, y, color.getRGB());
                }
            }

            File outputFile = new File(fileName);
            ImageIO.write(image, "jpg", outputFile);
            System.out.println("Изображение сохранено: " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Ошибка при сохранении изображения: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Пример использования
        int r = 148, g = 0, b = 211;

        String hex = rgb(r, g, b); // ← здесь должен возвращаться "9400D3"
        if (hex != null) {
            saveColorImage(hex, "color.jpg");
        } else {
            System.out.println("Метод rgb пока не реализован.");
        }
    }
}
```
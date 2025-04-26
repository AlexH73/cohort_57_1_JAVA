package Homework.lesson_40;

import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


    public class СolorImageGenerator {

        public static String rgb(int r, int g, int b) {

            r = Math.max(0, Math.min(255, r));
            g = Math.max(0, Math.min(255, g));
            b = Math.max(0, Math.min(255, b));


            return String.format("%02X%02X%02X", r, g, b);
        }

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

            int r = 148, g = 0, b = 211;

            String hex = rgb(r, g, b);
            if (hex != null) {
                saveColorImage(hex, "color.jpg");
            } else {
                System.out.println("Метод rgb пока не реализован.");
            }
        }
    }



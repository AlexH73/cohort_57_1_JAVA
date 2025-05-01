package Homework.lesson_40;

import static Homework.lesson_40.ColorImageGenerator.rgb;
import static Homework.lesson_40.ColorImageGenerator.saveColorImage;

public class Main2 {
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

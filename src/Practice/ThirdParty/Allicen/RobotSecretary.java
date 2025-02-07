package Practice.ThirdParty.Allicen;

import java.util.Scanner;

public class RobotSecretary {
    public static int minKeyPresses(String s) {
        int presses = 0;
        boolean currentUpper = false; // Начинаем с нижнего регистра

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') { // Пробел всегда 1 нажатие
                presses++;
                continue;
            }

            boolean isUpper = Character.isUpperCase(c);

            if (isUpper == currentUpper) {
                presses++; // Просто печатаем
            } else {
                // Проверяем, выгоднее ли переключить регистр на постоянной основе
                if (i + 1 < s.length() && Character.isUpperCase(s.charAt(i + 1)) == isUpper) {
                    presses += 2; // Shift + буква
                } else {
                    presses += 1; // Просто смена регистра
                }
                currentUpper = isUpper; // Меняем регистр
            }
        }
        return presses;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш текст: ");
        String s = scanner.nextLine().trim();
        System.out.println(minKeyPresses(s));
        scanner.close();
    }
}

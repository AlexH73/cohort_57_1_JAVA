package Practice.ThirdParty.Allicen;

import java.util.Scanner;

/**
 * <h1>Робот-секретарь</h1>
 * Настя любит программировать и увлекается старой компьютерной техникой.
 * Однажды она увидела в музее Яндекса робота для набора текста на печатной машинке.
 * Настя захотела проверить, насколько оптимально работает робот.<br>
 * <p>
 * Клавиатура печатной машинки состоит из 26 клавиш английского алфавита,
 * клавиши пробела и клавиши Shift, которая изменяет регистр следующей набранной
 * буквы на противоположный текущему. Двойное же нажатие на клавишу Shift изменяет текущий
 * регистр машинки. В начале работы регистр всегда нижний, то есть при
 * наборе без клавиши Shift будут печататься строчные буквы.
 * Пробел одинаково набирается в обоих регистрах.
 *<p>
 * Настя хочет понять, за какое минимальное количество нажатий можно набрать текст,
 * чтобы сравнить это с результатами робота.
 */
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

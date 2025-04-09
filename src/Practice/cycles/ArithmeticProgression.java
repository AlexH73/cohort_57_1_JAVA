package Practice.cycles;

/**
 * Напишите программу, которая выведет все элементы арифметической прогрессии от 0 до 50 включительно с шагом 5.
 *
 * Каждый элемент выводится отдельно на своей строке в таком виде
 */
public class ArithmeticProgression {
    public static void main(String[] args) {
        for (int i = 0; i < 51; i = i + 5) {
            System.out.println(i);
        }
    }
}

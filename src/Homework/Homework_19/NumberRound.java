package Homework.Homework_19;

public class NumberRound {
    /**
     * Задача 3: Напишите метод, который принимает число с плавающей точкой в качестве аргумента,
     * округляет его до ближайшего целого и возвращает результат.
     * Пример: roundValue(5.7) -> 6
     *
     * @see Math#round(double)
     */
    public static void main(String[] args) {
        System.out.println("Округленное число: " + roundValue(2.555));
    }

    public static int roundValue(double value) {
        long number = Math.round(value);

        return (int) number;
    }
}

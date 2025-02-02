package Practice.Practice_20;

public class ForVsForEach {
    /**
     * <b>Исследование: </b><br>
     * Изучите различия в производительности между циклами for и for-each.
     */
    public static void main(String[] args) {
        int[] array = new int[1000000];

        // Заполняем массив значениями
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // Тест производительности классического цикла for
        long startTime = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
        }
        long endTime = System.nanoTime();
        long durationFor = endTime - startTime;
        System.out.println("Классический цикл for: " + durationFor + " наносекунд");

        // Тест производительности цикла for-each
        startTime = System.nanoTime();
        for (int element : array) {
            int temp = element;
        }
        endTime = System.nanoTime();
        long durationForEach = endTime - startTime;
        System.out.println("Цикл for-each: " + durationForEach + " наносекунд");

    }
}

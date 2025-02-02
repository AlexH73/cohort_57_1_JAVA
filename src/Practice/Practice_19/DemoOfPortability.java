package Practice.Practice_19;

public class DemoOfPortability {
    /**
     *Задача 2: Демонстрация портативности.
     * Создайте программу на Java, которая выводит сообщение, указывающее, на какой операционной системе она запущена. Используйте метод System.getProperty для определения типа ОС.
     * Подсказка: используйте System.getProperty("os.name").
     */
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
    }
}

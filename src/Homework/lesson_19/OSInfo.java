package Homework.lesson_19;

public class OSInfo {
    /**
     * Задача 2: Напишите метод, который выводит на консоль название операционной системы,
     * на которой запущена программа.
     * Пример: printOS() -> "Windows 10"
     *
     * @see System#getProperty(String)
     */
    public static void main(String[] args) {
        System.out.print("Ваша операционная система: ");
        printOS();
    }
    public static void printOS() {
        String key = "os.name";
        String value = System.getProperty(key);
        System.out.println(value);
    }
}

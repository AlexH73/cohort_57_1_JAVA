package Homework.Lesson_Nr_19;
// Домашнее задание: Задача 2 к Лекции 19

// Автор: Alexander Berlin
// Дата: ${DATE}

/**
 * Описание: * Задача 2: Напишите метод, который выводит на консоль название операционной системы,
 *      * на которой запущена программа.
 *      * Пример: printOS() -> "Windows 10"
 *      *
 *      * @see System#getProperty(String)
 **/


public class HomeWork {
    public static void main(String[] args) {
        System.out.println();
        printOS();
    }
    public static void printOS(){
        String key = "os.version";
        String value = System.getProperty(key);
        System.out.println(value);

        String osName = System.getProperty("os.name");
        System.out.println(osName);

        String userHome = System.getProperty("user.home");
        System.out.println(userHome);

        String javaVersion = System.getProperty("java.version");
        System.out.println(javaVersion);


    }

}

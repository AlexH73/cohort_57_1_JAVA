package Homework.Homework_19;

public class JavaInfo {
    public static void main(String[] args) {
        // Пример использования метода getJavaVersion(Задача 11)
        System.out.println("Текущая версия Java: " + getJavaVersion());
    }

    // Метод getJavaVersion возвращает текущую версию Java, установленную в системе
    public static String getJavaVersion() {
        // Объявляем строковую переменную Jvesion и присваиваем ей значение "java.version".
        // Это ключ, используемый для получения версии Java из системных свойств.
        String Jvesion = "java.version";

        // Возвращаем значение системного свойства, связанного с ключом Jvesion.
        // Метод System.getProperty(Jvesion) извлекает значение системного свойства "java.version",
        // которое обычно содержит строку с версией установленной Java.
        return System.getProperty(Jvesion);
    }
}

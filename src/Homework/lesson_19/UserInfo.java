package Homework.lesson_19;

public class UserInfo {
    /**
     * Задача 9: Напишите метод, который возвращает имя пользователя системы,
     * на которой запущена программа.
     * Пример: getUserName() -> "admin"
     *
     * @see System#getProperty(String)
     */
    public static void main(String[] args) {
        // Пример использования метода getUserName
        System.out.println("Имя пользователя вашей системы: " + getUserName());
    }
    public static String getUserName() {
        // Объявляем строковую переменную userKey и присваиваем ей значение "user.name".
        // Это ключ, используемый для получения имени пользователя из системных свойств.
        String userKey = "user.name";

        // Возвращаем значение системного свойства, связанного с ключом userKey.
        // Метод System.getProperty(userKey) извлекает значение системного свойства "user.name",
        // которое обычно содержит имя текущего пользователя.
        return System.getProperty(userKey);
    }
}

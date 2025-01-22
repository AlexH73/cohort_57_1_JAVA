package Practice.Practice_01;

public class StringCaseConverter {
    public static void main(String[] args) {
        // Задание 1: Преобразование регистра
        /*
        Создайте строку с текстом "Java Programming IS Awesome!".
        Выполните следующие операции:
        - Преобразуйте строку в нижний регистр.
        - Преобразуйте строку в верхний регистр.
        - Сделайте первую букву строки заглавной.
        */
        // Создаем строку
        String text = "Java Programming IS Awesome!";

        // Преобразуем строку в нижний регистр
        String lowercaseText = text.toLowerCase();
        System.out.println("Нижний регистр: " + lowercaseText);

        // Преобразуем строку в верхний регистр
        String uppercaseText = text.toUpperCase();
        System.out.println("Верхний регистр: " + uppercaseText);

        // Делаем первую букву строки заглавной
        String capitalizedText = text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
        System.out.println("Первая буква заглавная: " + capitalizedText);
    }
}


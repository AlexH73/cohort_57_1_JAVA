package Homerwork.Practica.Practica19;
//Подсказка: используйте Integer.parseInt() и блоки try-catch (обрабатываем исключение NumberFormatException,
//если ввод содержит недопустимые символы).
import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        String userInput = scanner.nextLine();      //Читаем ввод пользователя

        try {
            int number = Integer.parseInt(userInput); //Преобразуем строку в int
            System.out.println("Вы ввели число: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введенное значение не является числом.");
        }
        scanner.close(); //Закрываем Сканер, чтобы избежать утечек ресурсов
    }
}

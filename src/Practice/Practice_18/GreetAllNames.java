//Задание 8: Приветствие пользователя с несколькими именами
//Код на Python:
//
//def greet_all(names):
//for name in names:
//print(f"Hello, {name}!")
//
//names_list = ["Alice", "Bob", "Charlie"]
//greet_all(names_list)

package Practice.Practice_18;

public class GreetAllNames {
    public static void main(String[] args) {
        String[] namesList = {"Alice", "Bob", "Charlie"}; // Инициализация массива строк
        greetAll(namesList); // Вызов метода для приветствия всех пользователей
    }

    // Метод для приветствия всех пользователей в массиве
    public static void greetAll(String[] names) {
        for (String name : names) { // Перебор элементов массива с использованием цикла for-each
            System.out.println("Привет " + name + "!"); // Вывод приветствия для каждого имени
        }
    }
}

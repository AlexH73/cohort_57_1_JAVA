package Other;

public class StringMethods {
    public static void main(String[] args) {
        // 1. charAt(intIndex) - Возвращает символ по указанному индексу.
        String text = "Hello World";
        System.out.println("1. charAt(intIndex) - Возвращает символ по указанному индексу.");
        System.out.println("    text.charAt(0) = " + text.charAt(0)); // 'H'

        // 2. compareTo(String anotherString) - Лексикографическое сравнение строк.
        System.out.println("2. compareTo(String anotherString) - Лексикографическое сравнение строк.");
        System.out.println("    text.compareTo('Hello') = " + text.compareTo("Hello")); // > 0

        // 3. compareToIgnoreCase(String str) - Лексикографическое сравнение без учета регистра.
        System.out.println("3. compareToIgnoreCase(String str) - Лексикографическое сравнение без учета регистра.");
        System.out.println("    text.compareToIgnoreCase('hello world') = "+ text.compareToIgnoreCase("hello world")); // 0

        // 4. concat(String str) - Объединяет строки
        System.out.println("4. concat(String str) - Объединяет строки");
        System.out.println("    text.concat('!!!') = " + text.concat("!!!")); // "Hello World!!!"

        // ... Продолжение следует
    }
}

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
        System.out.println("    text.compareToIgnoreCase('hello world') = " + text.compareToIgnoreCase("hello world")); // 0

        // 4. concat(String str) - Объединяет строки
        System.out.println("4. concat(String str) - Объединяет строки");
        System.out.println("    text.concat('!!!') = " + text.concat("!!!")); // "Hello World!!!"

        // 5. contains(CharSequence s) - Проверяет, содержит ли строка указанную последовательность символов.
        System.out.println("5. contains(CharSequence s) - Проверяет, содержит ли строка указанную последовательность символов.");
        System.out.println("    text.contains('World') = " + text.contains("World")); // true

        // 6. endsWith(String suffix) - Проверяет, заканчивается ли строка указанным суффиксом.
        System.out.println("6. endsWith(String suffix) - Проверяет, заканчивается ли строка указанным суффиксом.");
        System.out.println("    text.endsWith('World') = " + text.endsWith("World")); // true

        // 7. equals(Object anObject) - Проверяет равенство строк.
        System.out.println("7. equals(Object anObject) - Проверяет равенство строк.");
        System.out.println("    text.equals('Hello World') = " + text.equals("Hello World")); // true

        // 8. equalsIgnoreCase(String anotherString) - Проверяет равенство строк без учета регистра.
        System.out.println("8. equalsIgnoreCase(String anotherString) - Проверяет равенство строк без учета регистра.");
        System.out.println("    text.equalsIgnoreCase('hello world') = " + text.equalsIgnoreCase("hello world")); // true

        // ... Продолжение следует
    }
}

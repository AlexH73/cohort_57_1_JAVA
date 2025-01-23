package Other;

public class StringMethods {
    public static void main(String[] args) {
        // 1. charAt(intIndex) - Возвращает символ по указанному индексу.
        String text = "Hello World";
        String textCheck = "Hello";
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
        // Повторная проверка
        System.out.println("    textCheck.contains('World') = " + textCheck.contains("World")); // false

        // 6. endsWith(String suffix) - Проверяет, заканчивается ли строка указанным суффиксом.
        System.out.println("6. endsWith(String suffix) - Проверяет, заканчивается ли строка указанным суффиксом.");
        System.out.println("    text.endsWith('World') = " + text.endsWith("World")); // true
        // Повторная проверка
        System.out.println("    textCheck.endsWith('World') = " + textCheck.endsWith("World")); // false

        // 7. equals(Object anObject) - Проверяет равенство строк.
        System.out.println("7. equals(Object anObject) - Проверяет равенство строк.");
        System.out.println("    text.equals('Hello World') = " + text.equals("Hello World")); // true
        // Повторная проверка
        System.out.println("    textCheck.equals('World') = " + textCheck.equals("World")); // false

        // 8. equalsIgnoreCase(String anotherString) - Проверяет равенство строк без учета регистра.
        System.out.println("8. equalsIgnoreCase(String anotherString) - Проверяет равенство строк без учета регистра.");
        System.out.println("    text.equalsIgnoreCase('hello world') = " + text.equalsIgnoreCase("hello world")); // true
        // Повторная проверка
        System.out.println("    textCheck.equalsIgnoreCase('World') = " + textCheck.equalsIgnoreCase("World")); // false

        // 9. indexOf(String str) - Возвращает индекс первого вхождения подстроки.
        System.out.println("9. indexOf(String str) - Возвращает индекс первого вхождения подстроки.");
        System.out.println("    indexOf('World') = " + text.indexOf("World")); // 6

        // 10. isEmpty() - Проверяет, пуста ли строка.
        System.out.println("10. isEmpty() - Проверяет, пуста ли строка.");
        System.out.println("    text.isEmpty() = " + text.isEmpty()); // false

        // 11. length() - Возвращает длину строки.
        System.out.println("11. length() - Возвращает длину строки.");
        System.out.println("    text.length() = " + text.length());

        // 12. replace(char oldChar, char newChar) - Заменяет символы.
        System.out.println("12. replace(char oldChar, char newChar) - Заменяет символы.");
        System.out.println("    text.replace('o', '0') = " + text.replace("o", "0")); // "Hell0 W0rld"

        // 13. replace(CharSequence target, CharSequence replacement) - Заменяет подстроки.
        System.out.println("13. replace(CharSequence target, CharSequence replacement) - Заменяет подстроки.");
        System.out.println("    text.replace('World', 'Java') = " + text.replace("World", "Java") ); // "Hello Java"

        // 14. split(String regex) - Разделяет строку по регулярному выражению.
        System.out.println("14. split(String regex) - Разделяет строку по регулярному выражению.");
        String[] splitText = text.split(" ");
        System.out.println("    text.split(' ') = [" + String.join(", ", splitText) + "]"); // [Hello, World]

        // 15. startsWith(String prefix) - Проверяет, начинается ли строка с указанного префикса.
        System.out.println("15. startsWith(String prefix) - Проверяет, начинается ли строка с указанного префикса.");
        System.out.println("    text.StartsWith('Hello') = " + text.startsWith("Hello")); // true

        // ... Продолжение следует
    }
}

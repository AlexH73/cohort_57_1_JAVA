package Other;

import java.nio.charset.StandardCharsets;

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

        // 16. substring(int beginIndex) - Возвращает подстроку с указанного индекса.
        System.out.println("16. substring(int beginIndex) - Возвращает подстроку с указанного индекса.");
        System.out.println("    text.substring(6) = " + text.substring(6)); // "World"

        // 17. substring(int beginIndex, int endIndex) - Возвращает подстроку между индексами.
        System.out.println("17. substring(int beginIndex, int endIndex) - Возвращает подстроку между индексами.");
        System.out.println("    text.substring(0 ,5) = " + text.substring(0, 5)); // "Hello"

        // 18. toLowerCase() - Преобразует строку в нижний регистр.
        System.out.println("18. toLowerCase() - Преобразует строку в нижний регистр.");
        System.out.println("    text.toLowerCase() = " + text.toLowerCase()); // "hello world"

        // 19. toUpperCase() - Преобразует строку в верхний регистр.
        System.out.println("19. toUpperCase() - Преобразует строку в верхний регистр.");
        System.out.println("    text.toUpperCase() = " + text.toUpperCase()); // "HELLO WORLD"

        // 20. trim() - Удаляет начальные и конечные пробелы.
        String paddedText = "   Hello World   ";
        System.out.println("20. trim() - Удаляет начальные и конечные пробелы.");
        System.out.println("    paddedText.trim() = " + paddedText.trim()); // "Hello World"

        // 21. lastIndexOf(String str) - Возвращает индекс последнего вхождения подстроки.
        System.out.println("21. lastIndexOf(String str) - Возвращает индекс последнего вхождения подстроки.");
        System.out.println("    text.lastIndexOf('0') = " + text.lastIndexOf("o")); // 7

        // 22. matches(String regex) - Проверяет, соответствует ли строка регулярному выражению.
        System.out.println("22. matches(String regex) - Проверяет, соответствует ли строка регулярному выражению.");
        System.out.println("    text.matches('.*World.*') = " + text.matches(".*World.*")); // true

        // 23. join(CharSequence delimiter, CharSequence... elements) - Объединяет строки с разделителем.
        String joined = String.join("-", "Hello", "World", "Java");
        System.out.println("23. join(CharSequence delimiter, CharSequence... elements) - Объединяет строки с разделителем.");
        System.out.println("    String.join('-', ...) = " + joined); // "Hello-World-Java"

        //  24. valueOf(Object obj) - Преобразует объект в строку.
        int number = 42;
        System.out.println(" 24. valueOf(Object obj) - Преобразует объект в строку.");
        System.out.println("    String.valueOf(number) = " + String.valueOf(number)); // "42"

        // 25. getBytes() - Преобразует строку в массив байтов.
        byte[] bytes = text.getBytes();
        System.out.println("25. getBytes() - Преобразует строку в массив байтов.");
        System.out.println("    text.getBytes() = " + new String(bytes)); // "Hello World"

        // 26. format(String format, Object... args) - Форматирует строку по шаблону.
        String formated = String.format("Hello %s! You have %d new messages.", "John", 5);
        System.out.println("26. format(String format, Object... args) - Форматирует строку по шаблону.");
        System.out.println("    String.format(...) = " + formated); // "Hello, John! You have 5 new messages."

        // 27. regionMatches - Сравнивает часть строки с другой строкой.
        boolean match = text.regionMatches(6, "World!", 0, 5);
        System.out.println("27. regionMatches - Сравнивает часть строки с другой строкой.");
        System.out.println("    text.regionMatches(...) = " + match); // true

        // 28. repeat(int count) - Возвращает строку, повторенную указанное количество раз.
        String repeated = "Java".repeat(3);
        System.out.println("28. repeat(int count) - Возвращает строку, повторенную указанное количество раз.");
        System.out.println("    \"Java\".repeat(3) = " + repeated); // "JavaJavaJava"

        // 29. indent(int n) - Добавляет отступы к строке.
        String indented = "Hello\nWorld".indent(4);
        System.out.println("29. indent(int n) - Добавляет отступы к строке.");
        System.out.println("    text.indent(4) = " + indented);

        // 30. strip() - Удаляет начальные и конечные пробелы (современная альтернатива trim()).
        String stripped = paddedText.strip();
        System.out.println("30. strip() - Удаляет начальные и конечные пробелы (современная альтернатива trim()).");
        System.out.println("    paddedText.strip() = " + stripped); // "Hello World"


        // ... Продолжение следует
    }
}

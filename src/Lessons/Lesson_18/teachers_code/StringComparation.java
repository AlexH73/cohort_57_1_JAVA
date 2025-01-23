package Lessons.Lesson_18.teachers_code;

public class StringComparation {
    public static void main(String[] args) {
        // сравнение строк в джава происходит при помощи двух способов:

        // при первом способе мы сравниваем строки при помощи "=="
        // при помощи "==" сравниваются исключительно ссылки на ячеки памяти на которые ссылаются переменные,
        // если значения лежат в разных ячейках, но при жтом одинаковые, то мы все равно получим false,
        // см случай str1 == str3
        String str1 = "aaa";
        String str2 = "aaa";
        String str3 = new String("aaa");
        String str4 = "AAA";

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);

        System.out.println("str1 == str2 = " + (str1 == str2));
        System.out.println("str1 == str3 = " + (str1 == str3));
        System.out.println("str1 == str4 = " + (str1 == str4));
    }
}

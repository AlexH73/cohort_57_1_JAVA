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

        // как сравнить строки так, чтобы сравнивалось именно их содержимое символ с символом?
        // для это этого есть метод "equals":

        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("str1.equals(str3) = " + str1.equals(str3));
        System.out.println("str1.equals(str4) = " + str1.equals(str4));

        //если в тексте мы хотим проверить, лишь равенство символов, игнорируя регистр,
        // хотя при всех прочих сравнениях регистр влиял на стравнение, то можно использовать
        // equalsIgnoreCase():


        System.out.println("str1.equalsIgnoreCase(str2) = " + str1.equalsIgnoreCase(str2));
        System.out.println("str1.equalsIgnoreCase(str3) = " + str1.equalsIgnoreCase(str3));
        System.out.println("str1.equalsIgnoreCase(str4) = " + str1.equalsIgnoreCase(str4));


    }
}

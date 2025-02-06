package Lessons.Lesson_22.teachers_code;

public class Lesson22_1 {
    public static void main(String[] args) {
        Account ilias_account = new Account("ilias", "1234");

        System.out.println("ilias_account = " + ilias_account);

        Account ilias_2 = new Account("ilias", "1234", "adas@dcfad.we", "5322, Sdf str 12", 1990);

        Account ilias_3 = new Account("ilias", "1234", "adas@dcfad.we");


        Account ilias_4 = new Account();


        System.out.println("ilias_2 = " + ilias_2);

    }
}

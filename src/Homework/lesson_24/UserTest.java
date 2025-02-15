package Homework.lesson_24;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("Ivan", "ivan@example.com");
        user.displayInfo();

        System.out.println();

        Student student = new Student("Alex", "alex@example.com", "789");
        student.displayInfo();

        System.out.println();

        PremiumStudent premiumStudent = new PremiumStudent("Masha", "masha@example.com", "250", "Gold");
        premiumStudent.displayInfo();

        System.out.println();

    }
}

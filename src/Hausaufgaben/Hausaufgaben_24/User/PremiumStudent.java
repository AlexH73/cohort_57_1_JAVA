package Hausaufgaben.Hausaufgaben_24.User;

public class PremiumStudent extends Student{
    private String membershipLevel() {
        System.out.println("Der Studend ist = " + membershipLevel());
    }

    @Override
    public void userData() {
        System.out.println("Student");
    }

    @Override
    private String studentId() {
        System.out.println("Studend = " + studentId());
    }
}

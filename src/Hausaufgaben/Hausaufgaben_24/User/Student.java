package Hausaufgaben.Hausaufgaben_24.User;

public class Student extends User{
    private void studentId() {
        System.out.println("Studend = " + studentId());
    }

    @Override
    public void userData() {
        System.out.println("Student");
    }
}

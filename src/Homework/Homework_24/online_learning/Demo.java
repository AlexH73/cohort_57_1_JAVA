package Homework.Homework_24.online_learning;

public class Demo {
    public static void main(String[] args) {
        // Создание объекта User
        User user = new User("john_doe", "john@example.com");
        System.out.println("User: " + user.getUsername() + ", Email: " + user.getEmail());

        // Создание объекта Student
        Student student = new Student("jane_doe", "jane@example.com", "S12345");
        System.out.println("Student: " + student.getUsername() + ", Email: " + student.getEmail() + ", Student ID: " + student.getStudentId());

        // Создание объекта PremiumStudent
        PremiumStudent premiumStudent = new PremiumStudent("alex_smith", "alex@example.com", "P67890", "Gold");
        System.out.println("Premium Student: " + premiumStudent.getUsername() + ", Email: " + premiumStudent.getEmail() + ", Student ID: " + premiumStudent.getStudentId() + ", Membership Level: " + premiumStudent.getMembershipLevel());
    }
}

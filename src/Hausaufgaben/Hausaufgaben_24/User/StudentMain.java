package Hausaufgaben.Hausaufgaben_24.User;

public class StudentMain  {
    public static void main(String[] args) {
        //PremiumStudent studendinfo = new PremiumStudent();

        //studendinfo.username();
        /*
        User user = new User();
        user.getUsername();
        user.setUsername();
        user.getEmail();
        user.setEmail();
        Student student = new Student();
        student.getStudentId();

         */
        PremiumStudent premiumStudent = new PremiumStudent("Max Musterman","Musterman@mail.com",1234,"Vollmietglied");
        premiumStudent.getMembershipLevel();
    }
}

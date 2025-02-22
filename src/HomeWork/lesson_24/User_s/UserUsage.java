package HomeWork.lesson_24.User_s;

public class UserUsage {
    public static void main(String[] args) {

        PremiumStudent studentData = new PremiumStudent
                ("Puschkin.A","puschkin@gmail.com",
                        "525252","Junior");

        System.out.println("  Карта студента: " + studentData);

        studentData.getUserMail();
        studentData.getUserMail();
        studentData.studentID();
        studentData.membershipLevel();

    }
}

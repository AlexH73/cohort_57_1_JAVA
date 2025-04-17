package HomeWork.lesson_24.User_s;

public class PremiumStudent extends Student {
    private String membershipLevel;

    public PremiumStudent(String userName, String userMail, String studentID, String membershipLevel) {
        super(userName, userMail, studentID);
        this.membershipLevel = membershipLevel;
    }

    public void membershipLevel() {
        System.out.println("Membership Level: " + membershipLevel);
    }

}

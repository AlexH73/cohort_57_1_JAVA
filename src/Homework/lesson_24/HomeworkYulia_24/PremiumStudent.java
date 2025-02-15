package Homework.lesson_24.HomeworkYulia_24;

public class PremiumStudent extends Student {

    private String membershipLevel;

    public PremiumStudent(String username, String email, int studentId, String membershiplevel) {
        super(username, email, studentId);
        this.membershipLevel = membershiplevel;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Уровень подписки: " + membershipLevel);
    }

}

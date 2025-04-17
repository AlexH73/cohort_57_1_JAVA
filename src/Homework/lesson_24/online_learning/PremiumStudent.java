package Homework.lesson_24.online_learning;

public class PremiumStudent extends Student {
    private String membershipLevel;

    // Конструктор
    public PremiumStudent(String username, String email, String studentId, String membershipLevel) {
        super(username, email, studentId);
        this.membershipLevel = membershipLevel;
    }

    // Геттер и сеттер
    public String getMembershipLevel() {
        return membershipLevel;
    }

    public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }
}

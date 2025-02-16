package Hausaufgaben.Hausaufgaben_24.User;

public class PremiumStudent extends Student{
    private String membershipLevel;

    public PremiumStudent(String username, String email, int studentId, String membershipLevel) {
        super(username, email, studentId);
        this.membershipLevel = membershipLevel;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }

    @Override
    public String userData() {
        return String.format("%s, membershipLevel = %s", super.userData(), this.getMembershipLevel());
    }
}

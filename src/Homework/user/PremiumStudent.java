package Homework.user;

class PremiumStudent extends Student {
    private String membershipLevel;

    public PremiumStudent(String username, String email, String studentId, String membershipLevel) {
        super(username, email, studentId);
        this.membershipLevel = membershipLevel;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }
}

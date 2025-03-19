package Homework.user;

class Student extends User {
    private String studentId;

    public Student(String username, String email, String studentId) {
        super(username, email);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }
}

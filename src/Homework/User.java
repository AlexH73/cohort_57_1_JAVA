package Homework;

public class User {
}
// TODO: Реализовать иерархию пользователей в онлайн-обучении.
// 1. `User` (базовый класс) содержит `username` и `email`.
// 2. `Student` наследует `User` и добавляет `studentId`.
// 3. `PremiumStudent` наследует `Student` и добавляет `membershipLevel`.

class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}

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

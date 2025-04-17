package Homework.lesson_24.online_learning;

public class Student extends User {
    private String studentId;

    // Конструктор
    public Student(String username, String email, String studentId) {
        super(username, email);
        this.studentId = studentId;
    }

    // Геттер и сеттер
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}

package Hausaufgaben.Hausaufgaben_23;

public class StudentGrade {
    private String subject;// 2. `subject` не может быть пустым или null.
    private int grade;

    public StudentGrade(String subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if (subject == null || subject.isEmpty()) {
            System.out.println(" *Subject* не может быть *null* или *пустым*.");
        this.subject = subject;
        }
    }

    public int getGrade() {
        return grade;
    }
    // 1. `grade` должно быть в диапазоне от 0 до 100.
    public void setGrade(int grade) {
        if (0 <= grade || grade <= 100) {
            this.grade = grade;
        }
    }
}

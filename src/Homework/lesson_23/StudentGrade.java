package Homework.lesson_23;

// Часть 2: Реализация контролируемого доступа через геттеры и сеттеры
// TODO: Реализовать геттеры и сеттеры с валидацией.
// 1. `grade` должно быть в диапазоне от 0 до 100.
// 2. `subject` не может быть пустым или null.
class StudentGrade {
    private String subject;
    private int grade;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if (subject == null || subject.isEmpty()) {
            return;
        }
        this.subject = subject;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            return;
        }
        this.grade = grade;
    }
}

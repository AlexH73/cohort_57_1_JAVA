package Homework.lesson_23;

//[x] TODO: Реализовать геттеры и сеттеры с валидацией.
// 1. `grade` должно быть в диапазоне от 0 до 100.
// 2. `subject` не может быть пустым или null.
public class StudentGrade {
    private String subject;
    private int grade;

    // Геттер для grade
    public int getGrade() {
        return grade;
    }

    // Сеттер для grade с валидацией
    public void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("Оценка должна быть в диапазоне от 0 до 100.");
            // return ниже позволит завершить выполнение метода, если в нем некорректоное значение
            return;
        }
        this.grade = grade;
    }

    // Геттер для subject
    public String getSubject() {
        return subject;
    }

    // Сеттер для subject с валидацией
    public void setSubject(String subject) {
        if (subject == null || subject.isEmpty()) {
            System.out.println("Subject не может быть null или пустым.");
            // аналогичная поправка
            return;
        }
        this.subject = subject;
    }
}

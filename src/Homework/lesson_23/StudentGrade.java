package Homework.lesson_23;
/*Часть 2: Реализация контролируемого доступа через геттеры и сеттеры
🔹 В этих классах необходимо использовать приватные поля и разрешить их изменение только через валидированные сеттеры.

// TODO: Реализовать геттеры и сеттеры с валидацией.
// 1. `grade` должно быть в диапазоне от 0 до 100.
// 2. `subject` не может быть пустым или null.
class StudentGrade {
    private String subject;
    private int grade;
}*/

//StudentGrade с валидацией
public class StudentGrade {
    private String subject;
    private  int grade;

    //Конструктор
    public StudentGrade(String subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }
    //Геттеры
    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }
    //Сеттеры с валидацией
    public void setSubject(String subject) {
        if (subject == null || subject.trim().isEmpty()) {
            throw new IllegalArgumentException("Предмет не может быть пустым или null.");
        }
        this.subject = subject;
    }

    public void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Оценка должна быть в диапазоне от 0 до 100.");
        }
        this.grade = grade;
    }
}


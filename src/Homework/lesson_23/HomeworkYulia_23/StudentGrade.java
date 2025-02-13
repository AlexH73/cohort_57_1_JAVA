// Часть 2: Реализация контролируемого доступа через геттеры и сеттеры
//🔹 В этих классах необходимо использовать приватные поля и разрешить их изменение только через валидированные сеттеры.
//
/// / TODO: Реализовать геттеры и сеттеры с валидацией.
/// / 1. `grade` должно быть в диапазоне от 0 до 100.
/// / 2. `subject` не может быть пустым или null.


package Homework.lesson_23.HomeworkYulia_23;

public class StudentGrade {
    private String subject;
    private int grade;

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }



    public void setSubject(String subject) {
        if (subject != null && !subject.isEmpty()) {
            this.subject = subject;
        }
        else {
            System.out.println("Поле не должно быть пустым или равно null");
        }
    }

    public void setGrade(int grade) {
        if (grade <= 100 && grade >= 0) {
            this.grade = grade;
        }
        else {
            System.out.println("Оценка должна быть между 0 и 100");
        }
    }
}

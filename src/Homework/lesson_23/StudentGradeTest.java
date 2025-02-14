package Homework.lesson_23;

public class StudentGradeTest {
    public static void main(String[] args) {
        //Тестируем StudentGrade
        StudentGrade student = new StudentGrade("Математика", 95);
        System.out.println("Предмет: " + student.getSubject());
        System.out.println("Оценка: " + student.getGrade());
    }
}

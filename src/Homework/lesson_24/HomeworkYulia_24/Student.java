package Homework.lesson_24.HomeworkYulia_24;

public class Student extends User {

    private int studentId;

    public Student(String username, String email, int studentId) {
        super(username, email);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("ID студента: " + studentId);
    }
}

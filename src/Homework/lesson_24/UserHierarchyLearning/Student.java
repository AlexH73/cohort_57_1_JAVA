package Homework.lesson_24.UserHierarchyLearning;
// 2. `Student` наследует `User` и добавляет `studentId`
public class Student extends User {
    private String studentId;

    //Конструктор
    public Student(String username, String email, String studentId) {
        super(username, email);
        this.studentId = studentId;
    }
    //Геттер
    public String getStudentId() {
        return studentId;
    }
    //Переопределение метода для отображения информации
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("ID студента: " + studentId);
    }

}

package HomeWork.lesson_24.User_s;

public class Student extends User {
    private String studentID;

    public Student(String userName, String userMail, String studentID) {
        super(userName,userMail);
        this.studentID = studentID;
    }

    public void studentID(){
        System.out.println("Student ID: " + studentID);
    }

}

package Hausaufgaben.Hausaufgaben_24.User;

public class Student extends User{
    private int studentId;

    public Student(String username, String email, int studentId) {
        super(username, email);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    // studentId - поле, не метод
//    private void studentId() {
//        //System.out.println("Studend = " + studentId());
//    }


    // @Override - используется только если в родительском
    // классе есть такой метод и мы его переделываем
    public String userData() {
         return String.format("user name = %s, email = %s, student ID = %d",
                 super.getUsername(),
                 super.getEmail(),
                 this.studentId);
    }
}

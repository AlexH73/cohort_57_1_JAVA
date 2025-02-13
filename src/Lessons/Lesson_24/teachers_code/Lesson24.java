package Lessons.Lesson_24.teachers_code;

public class Lesson24 {
    public static void main(String[] args) {
        PhoneGen1 phone1 = new PhoneGen1("123-456");
        //phone1.call("456-789");

        PhoneGen2 phone2 = new PhoneGen2("3434-34534");
        phone2.sendMessage("123-456", "Hello!");
        phone2.call("456-789");
    }
}

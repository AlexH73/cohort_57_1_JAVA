package Lessons.Lesson_24.teachers_code.smart_device;

public class Computer extends Camera {
    public void internetConnection() {
        System.out.println("Computer connected to the Internet");
    }

    @Override
    public void getDeviceName() {
        System.out.println("Computer");
    }
}

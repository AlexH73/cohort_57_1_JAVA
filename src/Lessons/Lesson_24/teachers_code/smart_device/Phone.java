package Lessons.Lesson_24.teachers_code.smart_device;

public class Phone extends MusicPlayer {
    public void call(String number) {
        System.out.println("Calling to the: " + number);
    }

    @Override
    public void getDeviceName() {
        System.out.println("Phone");
    }
}


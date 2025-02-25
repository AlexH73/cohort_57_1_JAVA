package Lessons.Lesson_27.SmartDevice;

public class Boombox implements MusicPlayerInterf {
    @Override
    public void playMusic() {
        System.out.println("Boombox playing a tape");
    }

    @Override
    public void recordMusic() {
        System.out.println("Boombox recording music to the tape");
    }
}

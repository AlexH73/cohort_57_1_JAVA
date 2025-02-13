package Lessons.Lesson_24.teachers_code.smart_device;

public class MusicPlayer extends Computer {
    public void playMusic(String songName) {
        System.out.println("Play a song: " + songName);
    }

    @Override
    public void getDeviceName() {
        System.out.println("MusicPlayer");
    }
}

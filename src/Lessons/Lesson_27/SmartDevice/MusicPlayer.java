package Lessons.Lesson_27.SmartDevice;

public class MusicPlayer extends Computer {
    public void playMusic() {
        System.out.println("Player playing the music");
    }

    @Override
    public void connectToTheInternet() {
        System.out.println("Music player cant connect to the internet");
    }
}

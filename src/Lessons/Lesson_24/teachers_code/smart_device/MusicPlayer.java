package Lessons.Lesson_24.teachers_code.smart_device;

public class MusicPlayer extends Computer {
    public void playMusic(String songName) {
        System.out.println("Play a song: " + songName);
    }

    // метод переопределен не случайно, а чтобы показать, как эта ошибка сохранитсья в цепочке наследования
    @Override
    public void takePhoto() {
        System.out.println("Music player cant take a photo!");
    }

    @Override
    public void getDeviceName() {
        System.out.println("MusicPlayer");
    }
}

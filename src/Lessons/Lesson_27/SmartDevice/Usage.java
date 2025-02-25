package Lessons.Lesson_27.SmartDevice;

public class Usage {
    public static void main(String[] args) {
        SmartDevice device = new SmartDevice();
        //device.takeAPhoto();

        // пример полиморфизма, когда мы берем один тип данных и реализацию через другой
        CameraInterface camera1 = new SmartDevice();
        CameraInterface camera2 = new OldCamera();

        camera1.takeAPhoto();
        camera2.takeAPhoto();

        MusicPlayerInterf player1 = new Boombox();
        MusicPlayerInterf player2 = new SmartDevice();

        player1.playMusic();
        player2.playMusic();

        player1.recordMusic();
        player2.recordMusic();

    }
}

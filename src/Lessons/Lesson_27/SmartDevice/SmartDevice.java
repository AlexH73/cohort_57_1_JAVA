package Lessons.Lesson_27.SmartDevice;

public class SmartDevice implements CameraInterface, MusicPlayerInterf {

    @Override
    public void takeAPhoto() {
        System.out.println("смарт девайс сделал фото");
    }


    @Override
    public void playMusic() {
        System.out.println("Смарт девайс воспроизводит музыку со спотифай");
    }

    @Override
    public void recordMusic() {
        System.out.println("Смарт девайс записал музыку и сохранил в привязанное облако");
    }
}

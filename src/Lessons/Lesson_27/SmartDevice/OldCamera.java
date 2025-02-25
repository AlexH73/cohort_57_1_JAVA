package Lessons.Lesson_27.SmartDevice;

public class OldCamera implements CameraInterface {

    @Override
    public void takeAPhoto() {
        // какая-то сложная логика установки серебрянной пластины в камеру
        // сложная логика как выставить правильно камеру
        System.out.println("Old camera take a photo with a silver shield");
    }
}

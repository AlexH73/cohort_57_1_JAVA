package Lessons.Lesson_27.SmartDevice;

public class SmartDevice implements CameraInterface {
    public static void main(String[] args) {
        SmartDevice device = new SmartDevice();
        //device.takeAPhoto();

        // пример полиморфизма, когда мы берем один тип данных и реализацию через другой
        CameraInterface camera1 = new SmartDevice();
        CameraInterface camera2 = new OldCamera();

        camera1.takeAPhoto();
        camera2.takeAPhoto();
    }

    @Override
    public void takeAPhoto() {
        System.out.println("смарт девайс сделал фото");
    }
}

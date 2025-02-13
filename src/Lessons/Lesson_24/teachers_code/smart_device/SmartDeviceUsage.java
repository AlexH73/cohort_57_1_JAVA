package Lessons.Lesson_24.teachers_code.smart_device;

import java.util.ArrayList;

public class SmartDeviceUsage {
    public static void main(String[] args) {
//        Camera camera = new Camera();
//        camera.takePhoto();
//
//        Computer computer = new Computer();
//        computer.internetConnection();
//
//        MusicPlayer player = new MusicPlayer();
//        player.playMusic("Song");
//
//        Phone phone = new Phone();
//        phone.call("1233-345");

        SmartDevice device = new SmartDevice();
        // ошибка именно тут:
        device.takePhoto();
        device.internetConnection();
        device.call("123-345");
        device.playMusic("fsfsad");

        Camera camera = new Phone();


    }
}

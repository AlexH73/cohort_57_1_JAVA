package Practice.Practice_24;

public class SmartDeviceUsage {
    public static void main(String[] args) {
        Camera camera = new Camera ();
        camera.takeAPhoto();

        Computer computer = new Computer();
        computer.internetConnection();

        MusicPlayer music = new MusicPlayer();
        music.playMusic("Song");


    }
}

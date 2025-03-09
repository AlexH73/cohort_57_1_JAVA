package Homework.lesson_27;

public class SmartSpeaker implements Connectable {
    private boolean isConnected;
    private int volumeLevel;
    private String playingTrack;

    public void adjustVolume(int level) {
        this.volumeLevel = level;
        System.out.println("Громкость: " + level);
    }

    public void playMusic(String track){
        this.playingTrack = track;
        System.out.println("Воспроизведение трека: " + track);
    }

    @Override
    public void connectToWiFi(String network) {
        isConnected = true;
        System.out.println("Колонка подключена к " + network);

    }

    @Override
    public void disconnectFromWiFi() {
        isConnected = false;
        System.out.println("Колонка отключена от Wi-Fi ");

    }

    @Override
    public boolean CheckConnectionStatus() {
        return false;
    }
}

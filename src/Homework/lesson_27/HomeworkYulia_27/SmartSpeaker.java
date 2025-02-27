package Homework.lesson_27.HomeworkYulia_27;

public class SmartSpeaker implements Connectable {
    private int volumeLevel;
    private String playingTrack;
    private boolean isConnected;

    @Override
    public void connectToWiFi(String network) {
        isConnected = true;
        System.out.println("Умная колонка подключена к сети " + network);
    }

    @Override
    public void disconnectFromWiFi() {
        isConnected = false;
        System.out.println("Умная колонка отключена от Wi-Fi");
    }

    @Override
    public boolean checkConnectionStatus() {
        return isConnected;
    }

    public void playMusic(String track) {
        System.out.println("Воспроизводится трек: " + playingTrack);
    }


    public void adjustVolume(int level) {
        System.out.println("Громкость установлена на " + volumeLevel);
    }
}

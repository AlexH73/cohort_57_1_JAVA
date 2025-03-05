package Homework.lesson_27;

public class SmartSpeaker implements Connectable {
    private int volumeLevel = 0;
    private String playingTrack = null;
    private boolean isConnected = false;
    private String network = "";


    @Override
    public void connectToWiFi(String network) {
        this.network = network;
        System.out.println("SmartSpeaker was connected to " + network);

    }

    @Override
    public void disconnectFromWiFi() {
        System.out.println("SmartSpeaker was disconnected to " + network);
        this.network = "";
    }

    @Override
    public boolean checkConnectionStatus() {
        System.out.println("SmartSpeaker is connected to " + network);
        return !this.network.isEmpty();
    }

    public void adjustVolume(int level) {
        this.volumeLevel = level;
    }

    public void playMusic(String track) {
        this.playingTrack = track;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    @Override
    public String toString() {
        return "SmartSpeaker{" +
                "volumeLevel=" + volumeLevel +
                ", playingTrack='" + playingTrack + '\'' +
                ", network='" + network + '\'' +
                '}';
    }
}

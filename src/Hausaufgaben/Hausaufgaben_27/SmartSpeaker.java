package Hausaufgaben.Hausaufgaben_27;

public class SmartSpeaker implements Connectable{
    private int volumeLevel = 0;
    private String playingTrack = null;
    private String network = "";
    private boolean isConnected = false;

    @Override
    public boolean checkConnectionStatus() {
        return isConnected;
    }

    @Override
    public void connectToWiFi(String network) {
        this.network = network;
        System.out.println("SmartSpeaker Connect to:  " + network);
        isConnected = true;
    }

    @Override
    public void disconnectFromWiFi() {
        System.out.println("SmartSpeaker disconnect from:  " + this.network);
        this.network = "";
        isConnected = false;
    }

    void playMusic(String track) {
        this.playingTrack = track;
        System.out.println("SmartSpeaker play Track: " + track);
    }

    void adjustVolume(int level) {
        this.volumeLevel = level;
        System.out.println("SmartSpeaker volume level is : " + level);
    }

    @Override
    public String toString() {
        return "SmartSpeaker{" +
                "volumeLevel=" + volumeLevel +
                ", playingTrack='" + playingTrack + '\'' +
                ", network='" + network + '\'' +
                ", isConnected=" + isConnected +
                '}';
    }
}

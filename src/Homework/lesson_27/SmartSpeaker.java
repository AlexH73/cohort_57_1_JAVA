package Homework.lesson_27;

public class SmartSpeaker implements Connectable, CountableKWH, VoiceControllable {
    private int volumeLevel = 0;
    private String playingTrack = null;
    private boolean isConnected = false;
    private String network = "";
    private String wakeWord = "";

    @Override
    public void activateVoiceCommand(String command) {
        System.out.println("Handling a new command: " + command);
        if (command.startsWith(wakeWord)) {
            System.out.println("Handled the command: " + command);
        } else {
            System.out.println("Ignored the command: " + command);
        }

    }

    @Override
    public void setWakeWord(String word) {
        this.wakeWord = word;
        System.out.println("Set a new wake word: " + word);
    }


    @Override
    public void connectToWiFi(String network) {
        this.network = network;
        System.out.println("SmartSpeaker was connected to " + network);

    }

    public double getKWH() {
        return 344.23;
    }

    @Override
    public void disconnectFromWiFi() {
        System.out.println("SmartSpeaker was disconnected from " + network);
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
                ", kWh =" + getKWH() +
                ", network='" + network + '\'' +
                '}';
    }
}

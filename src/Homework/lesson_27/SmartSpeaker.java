package Homework.lesson_27;

public class SmartSpeaker implements Connectable, VoiceControllable {
    private boolean isConnected;
    private  int volumeLevel;
    private  String playingTrack;
    private String wakeWord = "Alexa";

    @Override
    public void connectToWiFi(String network) {
        isConnected = true;
        System.out.println("Умная колонка подключена к " + network);

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
        playingTrack = track;
        System.out.println("Воспроизведение трека: " + playingTrack);
    }

    public void adjustVolume(int level) {
        volumeLevel = level;
        System.out.println("Громкость установлена на " + volumeLevel);
    }

    //Дополнительные улучшения : 3.Выполняет голосовую команду.
    @Override
    public void activateVoiceCommand(String command) {
        System.out.println(wakeWord + " выполняет команду: " + command);


    }
    //Дополнительные улучшения :Устанавливает ключевую фразу для активации
    // голосового управления.
    @Override
    public void setWakeWord(String word) {
        wakeWord = word;
        System.out.println("Ключевое слово изменено на: " + wakeWord);

    }
}

package Homework.lesson_27;

/**
 * Класс, представляющий умную колонку, реализующую интерфейсы Connectable и VoiceControllable.
 */
public class SmartSpeaker implements Connectable, VoiceControllable {
    private boolean isConnected;       // Статус подключения к Wi-Fi
    private int volumeLevel;           // Уровень громкости (0-100)
    private String playingTrack;       // Воспроизводимый трек
    private String wakeWord = "Алиса"; // Ключевое слово для голосового управления

    /**
     * Подключает колонку к Wi-Fi сети.
     * @param network Название сети.
     */
    @Override
    public void connectToWiFi(String network) {
        isConnected = true;
        System.out.println("Колонка подключена к " + network);
    }

    /**
     * Отключает колонку от Wi-Fi сети.
     */
    @Override
    public void disconnectFromWiFi() {
        isConnected = false;
        System.out.println("Колонка отключена от Wi-Fi");
    }

    /**
     * Проверяет статус подключения к Wi-Fi сети.
     * @return true, если подключена, false – в противном случае.
     */
    @Override
    public boolean checkConnectionStatus() {
        return isConnected;
    }

    /**
     * Активация голосовой команды.
     * @param command Голосовая команда.
     */
    @Override
    public void activateVoiceCommand(String command) {
        System.out.println("Выполняю: " + command);
    }

    /**
     * Установка ключевого слова для голосового управления.
     * @param word Ключевое слово.
     */
    @Override
    public void setWakeWord(String word) {
        wakeWord = word;
        System.out.println("Ключевое слово: " + word);
    }

    /**
     * Воспроизведение музыки.
     * @param track Название трека.
     */
    public void playMusic(String track) {
        playingTrack = track;
        System.out.println("Воспроизводится: " + track);
    }

    /**
     * Регулировка уровня громкости.
     * @param level Уровень громкости (0-100).
     */
    public void adjustVolume(int level) {
        volumeLevel = level;
        System.out.println("Громкость: " + level + "%");
    }
}
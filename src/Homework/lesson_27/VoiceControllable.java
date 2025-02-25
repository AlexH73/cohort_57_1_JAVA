package Homework.lesson_27;

/**
 * Интерфейс для голосового управления устройством.
 */
public interface VoiceControllable {
    void activateVoiceCommand(String command);  // Активация голосовой команды
    void setWakeWord(String word);              // Установка ключевого слова
}

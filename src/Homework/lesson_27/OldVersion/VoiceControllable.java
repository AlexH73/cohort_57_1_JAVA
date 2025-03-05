package Homework.lesson_27.OldVersion;
//5.Интерфейс нужен для того, чтобы умные устройства управлялись голосом
public interface VoiceControllable {
    void activateVoiceCommand(String command); //выполняет голосовую команду
    void setWakeWord(String word);             //устанавливает ключевую фразу для активации устройства
}

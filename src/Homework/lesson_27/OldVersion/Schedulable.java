package Homework.lesson_27.OldVersion;
//3.Интерфейс нужен для автовыключения и включения в указанное время
public interface Schedulable {
    void scheduleActivation(String time);   //для автоматического включения устройства
    void scheduleDeactivation(String time); //для автоматического выключения устройства
}

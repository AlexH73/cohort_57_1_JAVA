package Homework.lesson_27.OldVersion;
//2.Интерфейс нужен для управления питанием
public interface PowerControllable {
    void turnOn();  //включает все устройство
    void turnOff(); //выключает все устройство
    boolean isOn(); //проверяет, включено ли  все устройство
}

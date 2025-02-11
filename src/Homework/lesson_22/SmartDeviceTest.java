package Homework.lesson_22;

public class SmartDeviceTest {
    public static void main(String[] args) {
        //Создаем объект устройства
        SmartDevice device = new SmartDevice("Умная лампа");

        //Проверяем начальное состояние
        device.displayStatus();

        //Несколько раз переключаем состояние и выводим его:
        device.togglePower();       //Включаем
        device.displayStatus();

        device.togglePower();       //Выключаем
        device.displayStatus();

        device.togglePower();       //Включаем снова
        device.displayStatus();

        device.togglePower();       //Выключаем
        device.displayStatus();

    }
}

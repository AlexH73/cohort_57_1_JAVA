package Homework.lesson_27;

public class SmartLight implements Connectable {
    private boolean isConnected;
    private int brightnessLevel;
    private int colorTemperature;


    @Override
    public void connectToWiFi(String network) {
        isConnected = true;
        System.out.println("Умная лампа подключена к " + network);
    }

    @Override
    public void disconnectFromWiFi() {
        isConnected = false;
        System.out.println("Умная лампа отключена от Wi-Fi");

    }

    @Override
    public boolean checkConnectionStatus() {
        return isConnected;
    }

    public void setBrightness(int level) {
        brightnessLevel = level;
        System.out.println("Яркость установлена на " +   brightnessLevel);
    }

    public void setColorTemperature(int temperature) {
        colorTemperature = temperature;
        System.out.println("Цветовая температура установлена на " + colorTemperature);
    }
//Дополнительные улучшения : 1.Планировщик активации устройства,
// который автоматически включает/выключает устройство в указанное время
    public void scheduleActivation(String time) {
        System.out.println("Умная лампа включится в " + time);
    }
}

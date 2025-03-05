package Homework.lesson_27;

public class SmartLight implements Connectable {
    private int brightnessLevel;
    private int colorTemperature;
    private boolean isConnected;

    public void setBrightness(int level) {
        this.brightnessLevel = level;
        System.out.println("Яркость установлена на " + level);

    }

    public void  setColorTemperature(int temperature){
        this.colorTemperature = temperature;
        System.out.println("Цветовая температура установлена на " + temperature);

    }

    @Override
    public void connectToWiFi(String network) {
        isConnected = true;
        System.out.println("Лампа подключена к " + network);

    }

    @Override
    public void disconnectFromWiFi() {
        isConnected = false;
        System.out.println("Лампа отключена от Wi-Fi");

    }

    @Override
    public boolean CheckConnectionStatus() {
        return false;
    }
}

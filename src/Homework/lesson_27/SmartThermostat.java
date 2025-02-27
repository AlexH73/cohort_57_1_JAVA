package Homework.lesson_27;

public class SmartThermostat implements Connectable{
    private boolean isConnected;
    private int currentTemperature;
    private int targetTemperature;

    @Override
    public void connectToWiFi(String network) {
        isConnected = true;
        System.out.println("Термостат подключен к " + network);
    }

    @Override
    public void disconnectFromWiFi() {
        isConnected = false;
        System.out.println("Термостат отключен от Wi-Fi");

    }

    @Override
    public boolean checkConnectionStatus() {
        return isConnected;
    }

    public void setTemperature(int targetTemp) {
        targetTemperature = targetTemp;
        System.out.println("Желаемая температура установлена на " + targetTemp);
    }

    public int getCurrentTemperature() {
        return currentTemperature;  // Получает текущую температуру в помещении.
    }
}

package Homework.lesson_27.HomeworkYulia_27;

public class SmartThermostat implements Connectable {
    private int currentTemperature;
    private int targetTemperature;
    private boolean isConnected;

    @Override
    public void connectToWiFi(String network) {
        isConnected = true;
        System.out.println("Умный термостат подключен к сети " + network);
    }

    @Override
    public void disconnectFromWiFi() {
        isConnected = false;
        System.out.println("Умный термостат отключен от Wi-Fi");
    }

    @Override
    public boolean checkConnectionStatus() {
        return isConnected;
    }

    // аналогичное замечание, как и в предыдущих классах
    public void setTemperature(int targetTemp) {
        System.out.println("Желаемая температура установлена на " + targetTemperature);
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }
}

package Homework.lesson_27.HomeworkYulia_27;

public class SmartLight implements Connectable {
    private int brightnessLevel;
    private int colorTemperature;
    private boolean isConnected;

    @Override
    public void connectToWiFi(String network) {
        isConnected = true;
        System.out.println("Умная лампа подключена к сети " + network);
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
        System.out.println("Яркость установлена на " + brightnessLevel);
    }


    public void setColorTemperature(int temperature) {
        System.out.println("Цветовая температура установлена на " + colorTemperature);
    }
}


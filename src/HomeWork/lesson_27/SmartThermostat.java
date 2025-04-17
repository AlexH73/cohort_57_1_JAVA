package Homework.lesson_27;

public class SmartThermostat implements Connectable {
    private boolean isConnected;
    private int currentTemperature;
    private int targetTemperature;

    public int getCurrentTemperature(){
        return currentTemperature;
    }

    public void setTemperature(int targetTemp){
        this.targetTemperature = targetTemp;
        System.out.println("Желаемая температура " + targetTemp);
    }

    @Override
    public void connectToWiFi(String network) {
        isConnected = true;
        System.out.println("Термостат подключен к " + network);
    }

    @Override
    public void disconnectFromWiFi() {
        isConnected = false;
        System.out.println("Термостат отключен от Wi-Fi ");
    }

    @Override
    public boolean CheckConnectionStatus() {
        return isConnected;
    }
}

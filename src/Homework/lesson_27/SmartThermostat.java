package Homework.lesson_27;

public class SmartThermostat implements Connectable {
    private int currentTemperature = 0;
    private int targetTemperature = 0;
    private String network = "";

    public void setTargetTemperature(int targetTemperature) {
        this.targetTemperature = targetTemperature;
        System.out.println("SmartThermostat is target temperature" + targetTemperature);
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    @Override
    public void connectToWiFi(String network) {
        this.network = network;
        System.out.println("SmartThermostat was connected to " + network);

    }

    @Override
    public void disconnectFromWiFi() {
        System.out.println("SmartThermostat was disconnected to " + network);
        this.network = "";
    }

    @Override
    public boolean checkConnectionStatus() {
        System.out.println("SmartLight is connected to " + network);
        return !this.network.isEmpty();
    }

    @Override
    public String toString() {
        return "SmartThermostat{" +
                "network='" + network + '\'' +
                ", currentTemperature=" + currentTemperature +
                ", targetTemperature=" + targetTemperature +
                '}';
    }

}

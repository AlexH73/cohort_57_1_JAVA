package Homework.lesson_27;

public class SmartThermostat implements Connectable, CountableKWH {
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

    public double getKWH() {
        return 0.005;
    }

    @Override
    public void connectToWiFi(String network) {
        this.network = network;
        System.out.println("SmartThermostat was connected to " + network);

    }

    @Override
    public void disconnectFromWiFi() {
        System.out.println("SmartThermostat was disconnected from " + network);
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
                ", currentTemperature=" + currentTemperature +
                ", targetTemperature=" + targetTemperature +
                ", kWh =" + getKWH() +
                ", network='" + network + '\'' +
                '}';
    }

}

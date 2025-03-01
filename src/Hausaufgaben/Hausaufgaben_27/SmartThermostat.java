package Hausaufgaben.Hausaufgaben_27;

public class SmartThermostat implements Connectable{
    private double currentTemperature = 22.5;
    private double targetTemperature = 25.0;
    private String network = "";
    private boolean isConnected = false;

    @Override
    public boolean checkConnectionStatus() {
        return isConnected;
    }

    @Override
    public void connectToWiFi(String network) {
        this.network = network;
        System.out.println("SmartThermostat Connect to:  " + network);
        isConnected = true;
    }

    @Override
    public void disconnectFromWiFi() {
        System.out.println("SmartThermostat disconnect from:  " + this.network);
        this.network = "";
        isConnected = false;
    }

    public void setTemperature(int targetTemp) {
        this.targetTemperature = targetTemp;
        System.out.println(" SmartThermostat target Temperatur: " + targetTemp);

    }

    public double getCurrentTemperature() {
        return this.currentTemperature;
    }

    @Override
    public String toString() {
        return "SmartThermostat{" +
                "currentTemperature=" + currentTemperature +
                ", targetTemperature=" + targetTemperature +
                ", network='" + network + '\'' +
                ", isConnected=" + isConnected +
                '}';
    }
}

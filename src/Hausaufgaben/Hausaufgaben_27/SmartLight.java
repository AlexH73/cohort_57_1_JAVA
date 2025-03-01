package Hausaufgaben.Hausaufgaben_27;

public class SmartLight implements Connectable {
    private int brightnessLevel = 5;
    private int colorTemperature = 7;
    private String network = "";
    private boolean isConnected = false;

    @Override
    public boolean checkConnectionStatus() {
        return isConnected;
    }

    @Override
    public void connectToWiFi(String network) {
        this.network = network;
        System.out.println("SmartLight Connect to:  " + network);
        isConnected = true;
    }

    @Override
    public void disconnectFromWiFi() {
        System.out.println("SmartLight disconnect from:  " + this.network);
        this.network = "";
        isConnected = false;
    }

    public void setBrightnessLevel(int brightnessLevel) {
        this.brightnessLevel = brightnessLevel;
    }

    public void setColorTemperature(int colorTemperature) {
        this.colorTemperature = colorTemperature;
    }

    @Override
    public String toString() {
        return "SmartLight{" +
                "brightnessLevel=" + brightnessLevel +
                ", colorTemperature=" + colorTemperature +
                ", network='" + network + '\'' +
                ", isConnected=" + isConnected +
                '}';
    }
}

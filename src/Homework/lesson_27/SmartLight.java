package Homework.lesson_27;

public class SmartLight implements Connectable, Schedulable, CountableKWH  {
    private int brightnessLevel;
    private int colorTemperature;
    private String network = "";
    private String scheduledTime = "";
    public boolean isActivated = true;


    @Override
    public void scheduleActivation(String time) {
        this.scheduledTime = time;
    }

    public boolean checkStatus() {
        return this.isActivated;
    }

    @Override
    public double getKWH() {
        return 223.23;
    }

    @Override
    public void connectToWiFi(String network) {
        this.network = network;
        System.out.println("SmartLight was connected to " + network);

    }

    @Override
    public void disconnectFromWiFi() {
        System.out.println("SmartLight was disconnected from " + network);
        this.network = "";
    }

    @Override
    public boolean checkConnectionStatus() {
        System.out.println("SmartLight is connected to " + network);
        return !this.network.isEmpty();
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
                ", kWh =" + getKWH() +
                ", network='" + network + '\'' +
                '}';
    }
}

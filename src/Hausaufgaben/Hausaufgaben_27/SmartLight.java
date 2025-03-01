package Hausaufgaben.Hausaufgaben_27;

public class SmartLight {
    private int brightnessLevel;
    private int colorTemperature;

    public SmartLight(int brightnessLevel, int colorTemperature) {
        this.brightnessLevel = 5;
        this.colorTemperature = 7;
    }

    public void setBrightnessLevel(int brightnessLevel) {
        this.brightnessLevel = brightnessLevel;
    }

    public void setColorTemperature(int colorTemperature) {
        this.colorTemperature = colorTemperature;
    }
}

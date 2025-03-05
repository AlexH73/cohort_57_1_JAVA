package Homework.lesson_27.OldVersion;

public  class SmartLight extends SmartDevice {
    private int brightnessLevel;
    private int colorTemperature;

    public void setBrightness(int level) {
        brightnessLevel = level;
        System.out.println("Яркость установлена на " +   brightnessLevel);
    }

    public void setColorTemperature(int temperature) {
        colorTemperature = temperature;
        System.out.println("Цветовая температура установлена на " + colorTemperature);
    }

    @Override
    public String getDeviceName() {
        return "Умная лампа ";
    }
}

package Homework.lesson_27;

public class SmartHome {
    public static void main(String[] args) {
        Connectable[] devices = {
                new SmartLight(),
                new SmartThermostat(),
                new SmartSpeaker()
        };

        for (Connectable device : devices) {
            device.connectToWiFi("HomeWiFi");
            System.out.println("Статус подключения: " + device.CheckConnectionStatus());
            device.disconnectFromWiFi();
        }

        SmartLight light = new SmartLight();
        light.setBrightness(5);
        light.setColorTemperature(100);

        SmartThermostat thermostat = new SmartThermostat();
        thermostat.setTemperature(21);
        System.out.println("Текущая температура: " + thermostat.getCurrentTemperature());

        SmartSpeaker speaker = new SmartSpeaker();
        speaker.playMusic("POP-90");
        speaker.adjustVolume(20);
    }
}

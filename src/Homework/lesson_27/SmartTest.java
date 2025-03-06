package Homework.lesson_27;

public class SmartTest {
    public static void main(String[] args) {
        SmartLight light = new SmartLight();
        SmartThermostat thermostat = new SmartThermostat();
        SmartSpeaker speaker = new SmartSpeaker();
        Connectable[] devices = {light, thermostat, speaker};

        for (Connectable device : devices) {
            device.connectToWiFi("HomeWiFi");
            System.out.println("Connection status: " + device.checkConnectionStatus());
        }

        System.out.println("-----------------------------");
        light.scheduleActivation("18:30");

        thermostat.setTargetTemperature(5678);
        System.out.println("Current temperature is " + thermostat.getCurrentTemperature());

        speaker.playMusic("Mozart");
        speaker.adjustVolume(12);
        speaker.setWakeWord("Шура !");
        speaker.activateVoiceCommand("Тушите свет ! ");

        System.out.println("-----------------------------");
        System.out.println("List of devices: ");
        for (Connectable device : devices) {
            System.out.println(device);
        }

        System.out.println("-----------------------------");
        for (Connectable device : devices) {
            device.disconnectFromWiFi();
        }
    }
}


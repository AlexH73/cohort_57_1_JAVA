package Homework.lesson_27;

public class SmartTest {
    public static void main(String[] args) {
        Connectable[] devices = {
                new SmartLight(),
                new SmartThermostat(),
                new SmartSpeaker()
        };

        for (Connectable device : devices) {
            device.connectToWiFi("HomeWiFi");
            System.out.println("Connection status: " + device.checkConnectionStatus());
            device.disconnectFromWiFi();
            if (device instanceof SmartSpeaker);
            ((SmartSpeaker)device).playMusic("Bethoven");
        }
    }
}


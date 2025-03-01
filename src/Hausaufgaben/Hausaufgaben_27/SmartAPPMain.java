package Hausaufgaben.Hausaufgaben_27;

public class SmartAPPMain {
    public static void main(String[] args) {
        Connectable[] devices = {
                new SmartLight(),
                new SmartThermostat(),
                new SmartSpeaker()
        };

        for (Connectable device : devices) {
            device.connectToWiFi("HomeWiFi");
            System.out.println("Статус подключения: " + device.checkConnectionStatus());
            device.disconnectFromWiFi();
        }
    }
}

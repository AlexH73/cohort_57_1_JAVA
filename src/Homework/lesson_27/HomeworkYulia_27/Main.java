package Homework.lesson_27.HomeworkYulia_27;

public class Main {
    public static void main(String[] args) {
        Connectable[] devices = {
                new SmartLight(),
                new SmartThermostat(),
                new SmartSpeaker()
        };

        for (Connectable device : devices) {
            device.connectToWiFi("HomeWiFi");
            System.out.println("Статус подключения: " + device.checkConnectionStatus());
        }

        System.out.println("\nОтключаем устройства от сети...");
        for (Connectable device : devices) {
            device.disconnectFromWiFi();
            System.out.println("Статус подключения: " + device.checkConnectionStatus());

        }
    }
}

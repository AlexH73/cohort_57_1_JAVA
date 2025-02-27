package Homework.lesson_27;

public class SmartHome {
    public static void main(String[] args) {
        Connectable[] devices = {
                new SmartLight(),
                new SmartThermostat(),
                new SmartSpeaker()
        };
        System.out.println("\n------------- Подключение всех умных устройств к Wi-Fi ------------");
        for (Connectable device : devices) {
            device.connectToWiFi("HomeWiFi");
            System.out.println("Статус подключения: " + device.checkConnectionStatus());
        }

        System.out.println("\n--------------- Управление устройствами -----------------");
        for (Connectable device : devices) {
            if (device instanceof SmartLight) {
                ((SmartLight) device).setBrightness(75);
                ((SmartLight) device).setColorTemperature(5000);
                ((SmartLight) device).scheduleActivation("12:00");
            } else if (device instanceof SmartThermostat) {
                ((SmartThermostat) device).setTemperature(22);
                ((SmartThermostat) device).getPowerConsumption();
            } else if (device instanceof SmartSpeaker) {
                ((SmartSpeaker) device).playMusic("Imagine Dragons - Thunder");
                ((SmartSpeaker) device).adjustVolume(50);
                ((SmartSpeaker) device).activateVoiceCommand(" ");
                ((SmartSpeaker) device).setWakeWord(" ");
            }
        }

        System.out.println("\n----------- Отключение всех устройств -------------");
        for (Connectable device : devices) {
            device.disconnectFromWiFi();
            System.out.println("Статус подключения: " + device.checkConnectionStatus());
        }
    }
}

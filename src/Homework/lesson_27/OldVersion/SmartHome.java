package Homework.lesson_27.OldVersion;

public class SmartHome {
    public static void main(String[] args) {
        SmartDevice[] devices = {
                new SmartLight(),
                new SmartThermostat(),
                new SmartSpeaker()
        };

        //Перебираем все устройства и проверяем их функциональность
        System.out.println("\n--------------- Настройка устройств -----------------");
        for (SmartDevice device : devices) {
            System.out.println("\n ---------- Тестируем: " + device.getDeviceName() + " --------------");
            //Подключение к WiFi
            device.connectToWiFi("HomeWiFi");
            System.out.println("Статус подключения: " + (device.checkConnectionStatus() ? "Подключено" : "Отключено"));
            //Включение устройства
            device.turnOn();
            System.out.println("Устройство сейчас включено? " + (device.isOn() ? "Да" : "Нет"));
            //Проверка уникальных функций
            if(device instanceof SmartLight) {
                ((SmartLight)device).setBrightness(70);
            } else if (device instanceof SmartThermostat) {
                ((SmartThermostat)device).setTemperature(22);
                System.out.println("Текущая температура: " + ((SmartThermostat) device).getCurrentTemperature() + "°C");
            } else if (device instanceof SmartSpeaker) {
                ((SmartSpeaker)device).playMusic("Queen - ihojpo");
                ((SmartSpeaker)device).adjustVolume(80);
            }
            //Учет потребления энергии
            device.updateEnergyConcumption(10.5);
            System.out.println(device.getDeviceName() + " энергопотребление: " + device.getEnergyConsumption() + " Вт/ч");
            //Настройка расписания
            device.scheduleActivation("18:00");
            device.scheduleDeactivation("22:30");
            //Голосовое управление
            device.setWakeWord("Шура");
            device.activateVoiceCommand("Включи музыку");
            device.activateVoiceCommand("Тушите свет!");
            //Выключение устройства
            device.turnOff();
            System.out.println("Устройство выключено? " + (!device.isOn() ? "Да" : "Нет"));
            //Отключение от WiFi
            device.disconnectFromWiFi();
            System.out.println("Статус подключения: " + (device.checkConnectionStatus() ? "Подключено" : "Отключено"));
        }

    }
}


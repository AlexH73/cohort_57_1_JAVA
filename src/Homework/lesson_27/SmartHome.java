package Homework.lesson_27;

/**
 * Главный класс для управления умным домом.
 */
public class SmartHome {
    public static void main(String[] args) {
        // Создание массива устройств, реализующих интерфейс Connectable
        Connectable[] devices = {
                new SmartLight(),
                new SmartThermostat(),
                new SmartSpeaker()
        };

        // Управление подключением
        for (Connectable device : devices) {
            // Подключение каждого устройства к Wi-Fi сети
            device.connectToWiFi("HomeNet");
            // Проверка и вывод статуса подключения
            System.out.println("Статус: " + (device.checkConnectionStatus() ? "Подключен" : "Отключен"));
            // Отключение каждого устройства от Wi-Fi сети
            device.disconnectFromWiFi();
            // Проверка и вывод статуса подключения после отключения
            System.out.println("Статус: " + (device.checkConnectionStatus() ? "Подключен" : "Отключен"));
            System.out.println();
        }

        // Использование уникальных функций умных устройств
        SmartLight light = new SmartLight();
        light.setBrightness(75);        // Установка яркости лампы
        light.setColorTemperature(4000); // Установка цветовой температуры лампы
        light.turnOff();                // Выключение лампы
        light.scheduleActivation("20:00"); // Планирование активации лампы

        SmartThermostat thermo = new SmartThermostat();
        thermo.setTemperature(22);      // Установка целевой температуры термостата

        SmartSpeaker speaker = new SmartSpeaker();
        speaker.playMusic("Queen - Bohemian Rhapsody"); // Воспроизведение музыки на колонке
    }
}
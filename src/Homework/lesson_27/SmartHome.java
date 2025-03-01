package Homework.lesson_27;

/**
 * Главный класс для управления умным домом.
 */
public class SmartHome {
    public static void main(String[] args) {
        SmartLight light = new SmartLight();
        SmartThermostat thermostat = new SmartThermostat();
        SmartSpeaker speaker = new SmartSpeaker();
        // Создание массива устройств, реализующих интерфейс Connectable
        Connectable[] devices = {light, thermostat, speaker};

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
        light.setBrightness(75);        // Установка яркости лампы
        light.setColorTemperature(4000); // Установка цветовой температуры лампы
        light.turnOff();                // Выключение лампы
        light.scheduleActivation("20:00"); // Планирование активации лампы
        thermostat.setTemperature(22);      // Установка целевой температуры термостата
        System.out.println();

        speaker.playMusic("Queen - Bohemian Rhapsody"); // Воспроизведение музыки на колонке
        System.out.println();

        System.out.println("Вывод toString");
        for (Connectable device : devices) {
            System.out.println(device);
        }
    }
}
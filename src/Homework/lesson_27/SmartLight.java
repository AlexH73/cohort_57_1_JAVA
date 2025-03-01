package Homework.lesson_27;

/**
 * Класс, представляющий умную лампу, реализующую интерфейсы Connectable, VoiceControllable и Schedulable.
 */
public class SmartLight implements Connectable, VoiceControllable, Schedulable, ElectricityMeter {
    private int brightnessLevel;        // Уровень яркости (0-100)
    private int colorTemperature;       // Цветовая температура (1000-10000K)
    private boolean isConnected;        // Статус подключения к Wi-Fi
    private boolean isOn;               // Состояние включения
    private String wakeWord = "Лампа";  // Ключевое слово для голосового управления

    // Реализация методов Connectable
    @Override
    public void connectToWiFi(String network) {
        isConnected = true;
        System.out.println("Лампа подключена к " + network);
    }

    @Override
    public void disconnectFromWiFi() {
        isConnected = false;
        System.out.println("Лампа отключена от Wi-Fi");
    }

    @Override
    public boolean checkConnectionStatus() {
        return isConnected;
    }

    // Реализация методов VoiceControllable
    @Override
    public void activateVoiceCommand(String command) {
        System.out.println("Выполняю: " + command);
    }

    @Override
    public void setWakeWord(String word) {
        wakeWord = word;
        System.out.println("Ключевое слово: " + word);
    }

    // Реализация метода ElectricityMeter
    @Override
    public double energyConsumption() {
        return 0.07;
    }

    // Специфичные методы лампы
    public void setBrightness(int level) {
        if (level < 0 || level > 100) {
            System.out.println("Ошибка: Уровень яркости должен быть между 0 и 100.");
            return;
        }
        brightnessLevel = level;
        System.out.println("Яркость: " + level + "%");
    }

    public void setColorTemperature(int temperature) {
        if (temperature < 1000 || temperature > 10000) {
            System.out.println("Ошибка: Цветовая температура должна быть между 1000K и 10000K.");
            return;
        }
        colorTemperature = temperature;
        System.out.println("Цветовая температура: " + temperature + "K");
    }

    // Управление состоянием лампы
    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Лампа включена.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Лампа выключена.");
    }

    // Реализация метода scheduleActivation
    @Override
    public void scheduleActivation(String time) {
        if (!time.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]")) {
            System.out.println("Некорректный формат времени!");
            return;
        }
        if (isOn) {
            System.out.println("Лампа будет выключена таймером в: " + time);
        } else {
            System.out.println("Лампа будет включена таймером в: " + time);
        }
    }

    @Override
    public String toString() {
        return "Умная лампа {" +
                "Уровень яркости =" + brightnessLevel +
                ", Цветовая температура =" + colorTemperature +
                ", Статус подключения к Wi-Fi =" + isConnected +
                ", Состояние =" + isOn +
                ", Потребление энергии =" + energyConsumption() + measurement +
                ", Ключевое слово для голосового управления ='" + wakeWord + '\'' +
                '}';
    }
}
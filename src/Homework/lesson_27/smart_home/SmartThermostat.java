package Homework.lesson_27.smart_home;

/**
 * Класс, представляющий умный термостат, реализующий интерфейсы Connectable и VoiceControllable.
 */
public class SmartThermostat implements Connectable, VoiceControllable, ElectricityMeter {
    private int currentTemperature;    // Текущая температура
    private int targetTemperature;     // Целевая температура
    private boolean isConnected;       // Статус подключения к Wi-Fi
    private String wakeWord = "Термо"; // Ключевое слово для голосового управления

    /**
     * Подключает термостат к Wi-Fi сети.
     * @param network Название сети.
     */
    @Override
    public void connectToWiFi(String network) {
        isConnected = true;
        System.out.println("Термостат подключен к " + network);
    }

    /**
     * Отключает термостат от Wi-Fi сети.
     */
    @Override
    public void disconnectFromWiFi() {
        isConnected = false;
        System.out.println("Термостат отключен от Wi-Fi");
    }

    /**
     * Проверяет статус подключения к Wi-Fi сети.
     * @return true, если подключен, false – в противном случае.
     */
    @Override
    public boolean checkConnectionStatus() {
        return isConnected;
    }

    /**
     * Активация голосовой команды.
     * @param command Голосовая команда.
     */
    @Override
    public void activateVoiceCommand(String command) {
        System.out.println("Выполняю: " + command);
    }

    /**
     * Установка ключевого слова для голосового управления.
     * @param word Ключевое слово.
     */
    @Override
    public void setWakeWord(String word) {
        wakeWord = word;
        System.out.println("Ключевое слово: " + word);
    }

    /**
     * Установка целевой температуры.
     * @param targetTemp Целевая температура.
     */
    public void setTemperature(int targetTemp) {
        targetTemperature = targetTemp;
        System.out.println("Целевая температура: " + targetTemp + "°C");
    }

    /**
     * Получение текущей температуры.
     * @return Текущая температура.
     */
    public int getCurrentTemperature() {
        return currentTemperature;
    }

    /**
     * Обновление текущей температуры.
     * @param temp Новая текущая температура.
     */
    public void updateCurrentTemperature(int temp) {
        currentTemperature = temp;
        System.out.println("Текущая температура обновлена: " + temp + "°C");
    }

    /**
     * Реализация метода потребления энергии.
     */
    @Override
    public double energyConsumption() {
        return 0.0002;
    }

    @Override
    public String toString() {
        return "Умный термостат {" +
                "Текущая температура =" + currentTemperature +
                ", Целевая температура =" + targetTemperature +
                ", Статус подключения к Wi-Fi =" + isConnected +
                ", Потребление энергии =" + energyConsumption() + measurement +
                ", Ключевое слово для голосового управления ='" + wakeWord + '\'' +
                '}';
    }
}
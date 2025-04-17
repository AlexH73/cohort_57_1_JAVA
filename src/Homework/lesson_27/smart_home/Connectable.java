package Homework.lesson_27.smart_home;

public interface Connectable {
    /**
     * Подключает устройство к Wi-Fi сети.
     * @param network Название сети.
     */
    void connectToWiFi(String network);

    /**
     * Отключает устройство от сети Wi-Fi.
     */
    void disconnectFromWiFi();

    /**
     * Проверяет статус подключения.
     * @return true, если подключено, false – в противном случае.
     */
    boolean checkConnectionStatus();
}

package Homework.lesson_27;
//1.Интерфейс нужен для того, чтобы все умные устройства могли подключиться к Wi-Fi
public interface Connectable {
    /**
     * @param network Название сети.
     */
    void connectToWiFi(String network); //Подключает устройство к Wi-Fi


    void disconnectFromWiFi();          //Отключает устройство от Wi-Fi
    /**
     * @return true, если подключено, false – в противном случае.
     */
    boolean checkConnectionStatus();    //Проверяет, подключено ли устройство

}

package Homework.lesson_27;

public interface Connectable {

    void connectToWiFi(String network);

    void disconnectFromWiFi();

    boolean checkConnectionStatus();
}

package Hausaufgaben.Hausaufgaben_27;

public interface Connectable {
    /**
     * Подключает устройство к Wi-Fi сети.
     * @param network Название сети.
     */
    /**
     * Отключает устройство от сети Wi-Fi.
     */
    /**
     * Проверяет статус подключения.
     * @return true, если подключено, false – в противном случае.
     */
    import java.util.Random;

public class WiFiManager {

    private boolean isConnected = false;

    // Method to connect to a WiFi network
    public void connectToWiFi(String network) {
        if (network == null || network.isEmpty()) {
            System.out.println("Network name cannot be null or empty.");
            return;
        }
        // Simulate connecting to a network
        System.out.println("Connecting to WiFi network: " + network);
        isConnected = true;
        System.out.println("Connected to " + network);
    }

    // Method to disconnect from the WiFi network
    public void disconnectFromWiFi() {
        if (!isConnected) {
            System.out.println("No WiFi network is currently connected.");
            return;
        }
        // Simulate disconnecting from a network
        System.out.println("Disconnecting from WiFi network...");
        isConnected = false;
        System.out.println("Disconnected from WiFi network.");
    }

    // Method to check the connection status
    public boolean checkConnectionStatus() {
        return isConnected;
    }

    public static void main(String[] args) {
        WiFiManager wifiManager = new WiFiManager();

        // Example usage
        wifiManager.connectToWiFi("HomeNetwork");
        System.out.println("Connection status: " + wifiManager.checkConnectionStatus());
        wifiManager.disconnectFromWiFi();
        System.out.println("Connection status: " + wifiManager.checkConnectionStatus());
    }
}

}

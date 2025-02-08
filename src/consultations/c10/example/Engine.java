package consultations.c10.example;

public class Engine {
    String serialNumber;
    boolean isEnabled = false;

    public Engine(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    void start() {
        if (!this.isEnabled) {
            this.isEnabled = true;
            System.out.printf("%s запущен\n", this.serialNumber);
        }
    }

    void stop() {
        if (this.isEnabled) {
            this.isEnabled = false;
            System.out.printf("мотор %s остановлен\n", this.serialNumber);
        }
    }
}

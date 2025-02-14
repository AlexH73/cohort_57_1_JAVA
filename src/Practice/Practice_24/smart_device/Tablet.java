package Practice.Practice_24.smart_device;

public class Tablet extends SmartDevice {
    public Tablet(String model, String brand) {
        super(model, brand);
    }

    void drawOnScreen() {
        System.out.println("Рисуем на экране...");
    }
}

package Practice.Practice_24.smart_device;

public class SmartWatch extends SmartDevice{
    public SmartWatch(String model, String brand) {
        super(model, brand);
    }

    void showTime() {
        System.out.println("Текущее время: 12:30");
    }
}

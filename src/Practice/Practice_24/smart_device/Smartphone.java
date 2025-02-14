package Practice.Practice_24.smart_device;

/**
 * Шаг 2: Создание подклассов Smartphone, Tablet, SmartWatch
 * <p>
 * 🔹 Каждый подкласс наследуется от SmartDevice и добавляет уникальный метод:
 * ✔ Smartphone – makeCall(String number).
 * ✔ Tablet – drawOnScreen().
 * ✔ SmartWatch – showTime().
 */
public class Smartphone extends SmartDevice {
    public Smartphone(String model, String brand) {
        super(model, brand);
    }

    void makeCall(String number) {
        System.out.println("Звоним на " + number);
    }

}

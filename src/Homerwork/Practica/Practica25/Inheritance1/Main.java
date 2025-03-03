package Homerwork.Practica.Practica25.Inheritance1;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Smartphone
        Smartphone phone = new Smartphone("Samsyng", "Galaxy S22");
        phone.powerOn();   // Наследуется от SmartDevice
        phone.makeCall("+492345569");  // Уникальный метод Smartphone

        // Создаем объект Tablet
        Tablet tablet = new Tablet("Apple", "iPad Pro");
        tablet.powerOn();   // Наследуется от SmartDevice
        tablet.drawOnScreen();  // Уникальный метод Tablet

        // Создаем объект SmartWatch
        SmartWatch watch = new SmartWatch("Garmin", "Forerunner 955");
        watch.powerOn();    // Наследуется от SmartDevice
        watch.showTime();   // Уникальный метод SmartWatch



    }
}

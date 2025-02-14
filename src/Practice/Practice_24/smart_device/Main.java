package Practice.Practice_24.smart_device;

public class Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Samsung", "Galaxy S22");
        phone.powerOn();
        phone.playMusic();
        phone.takePhoto();
        phone.makeCall("+123456789");

        Tablet tablet = new Tablet("Apple", "iPad Pro");
        tablet.powerOn();
        tablet.drawOnScreen();

        SmartWatch watch = new SmartWatch("Garmin", "Forerunner 955");
        watch.powerOn();
        watch.showTime();

    }
}

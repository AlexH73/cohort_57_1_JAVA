package Homerwork.Practica.Practica25.Inheritance1;

//✔ SmartWatch – showTime().
public class SmartWatch extends SmartDevice { // Класс SmartWatch (наследуется от SmartDevice)

    public SmartWatch(String brand, String model) {
        super(brand, model);
    }

    public void showTime() {
        System.out.println("Текущее время: 12:30"); // Метод для показа времени
    }
}

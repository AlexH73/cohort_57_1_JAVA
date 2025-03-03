package Homerwork.Practica.Practica25.Inheritance1;

//✔ Tablet – drawOnScreen().
public class Tablet extends SmartDevice {

    public Tablet(String brand, String model) {
        super(brand, model);
    }

    public void drawOnScreen() {
        System.out.println("Рисуем на экране...");  // Метод для рисования на экране
    }
}

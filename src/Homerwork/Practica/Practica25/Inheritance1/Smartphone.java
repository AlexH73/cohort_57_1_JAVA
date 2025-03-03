package Homerwork.Practica.Practica25.Inheritance1;

//🔹 Каждый подкласс наследуется от SmartDevice и добавляет уникальный метод:
//✔ Smartphone – makeCall(String number).
public class Smartphone extends SmartDevice {    // Класс Smartphone (наследуется от SmartDevice)

    public Smartphone(String brand, String model) {
        super(brand, model);    // Вызываем конструктор родительского класса
    }

    public void makeCall(String number) {
        System.out.println("Звоним на " + number);  // Метод для совершения звонка
    }
}

package Hausaufgaben.Hausaufgaben_24.Product;

public class Product {
    // TODO: Переопределить метод `applyDiscount()` и использовать `super.applyDiscount()`.
// 1. `Product` (базовый класс) содержит `name` и `price`.
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void applyDiscount() {
        System.out.println(name + " " + "Der normale Preis beträgt :  " + price );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

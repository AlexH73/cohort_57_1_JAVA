package Homework.lesson_24.discount_store;

// TODO: Переопределить метод `applyDiscount()` и использовать `super.applyDiscount()`.
// 1. `Product` (базовый класс) содержит `name` и `price`.
// 2. `Electronics` переопределяет `applyDiscount()`, снижая цену на 10%.
// 3. `Clothing` переопределяет `applyDiscount()`, снижая цену на 20%, если сезонная распродажа.

public class Product {
    private String name;
    private double price;

    // Конструктор
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Метод applyDiscount()
    public void applyDiscount(){
        System.out.println("\nСчет на оплату:");
        System.out.println(name);
    }

    // Геттеры и сеттеры
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

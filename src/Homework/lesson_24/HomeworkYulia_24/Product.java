// // TODO: Переопределить метод `applyDiscount()` и использовать `super.applyDiscount()`.
/// / 1. `Product` (базовый класс) содержит `name` и `price`.
/// / 2. `Electronics` переопределяет `applyDiscount()`, снижая цену на 10%.
/// / 3. `Clothing` переопределяет `applyDiscount()`, снижая цену на 20%, если сезонная распродажа.

package Homework.lesson_24.HomeworkYulia_24;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double discount) {
        price -= price * (discount / 100);
    }

    public double getPrice() {
        return price;
    }
}

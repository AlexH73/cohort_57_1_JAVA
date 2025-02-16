package Homework;

public class applyDiscount {
}
// TODO: Переопределить метод `applyDiscount()` и использовать `super.applyDiscount()`.
// 1. `Product` (базовый класс) содержит `name` и `price`.
// 2. `Electronics` переопределяет `applyDiscount()`, снижая цену на 10%.
// 3. `Clothing` переопределяет `applyDiscount()`, снижая цену на 20%, если сезонная распродажа.

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void applyDiscount() {
        System.out.println("Применена скидка: " + price * 0.1);
        price -= price * 0.1;
    }

    public double getPrice() {
        return price;
    }
}

class Electronics extends Product {

    public Electronics(String name, double price) {
        super(name, price);  // Вызов конструктора родительского класса
    }

    @Override
    public void applyDiscount() {
        super.applyDiscount();
        System.out.println("Скидка для электроники: 10%");
    }
}

class Clothing extends Product {

    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public void applyDiscount() {
        super.applyDiscount();
        System.out.println("Скидка для одежды: 20%");
    }
}

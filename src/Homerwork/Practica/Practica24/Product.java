package Homerwork.Practica.Practica24;
// 3. Реализовать методы:
//    - `sell(int quantity)`, который уменьшает `stock`, если товара достаточно на складе.
//    - `restock(int quantity)`, который увеличивает `stock`.
public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void sell(int quantity) {
        if (quantity > 0) {
            stock -= quantity;
            System.out.println(quantity + " items sold.");
        } else {
            System.out.println("Not enough stock or invalid quantity.");
        }
    }

    public void restock(int quantity) {
        if (quantity > 0) {
            stock += quantity;
            System.out.println(quantity + "items restocked.");
        } else {
            System.out.println("Restock quantity must be positive.");
        }
    }

    public void displayProductInfo() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Stock: " + stock);
    }
}

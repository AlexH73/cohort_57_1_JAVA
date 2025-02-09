package Hausaufgaben.Hausaufgaben_22.Product;

public class Product {//  1. Добавить поля:
//    - `name` (String) - Название продукта
    String name;
//    - `price` (double) - Цена продукта
    double price;
//    - `stock` (int) - Количество на складе
    int stock;
// 2. Создать конструктор, принимающий все три параметра.

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
//  3. Реализовать методы:
//    - `sell(int quantity)`, который уменьшает `stock`, если товара достаточно на складе.
    static int sell() {

    }
//    - `restock(int quantity)`, который увеличивает `stock`.
    static int restock() {

    }
}

package Hausaufgaben.Hausaufgaben_22.Product;

//  1. Добавить поля:
//    - `name` (String) - Название продукта
//    - `price` (double) - Цена продукта
//    - `stock` (int) - Количество на складе
// 2. Создать конструктор, принимающий все три параметра.
//  3. Реализовать методы:
//    - `sell(int quantity)`, который уменьшает `stock`, если товара достаточно на складе.
// static int sell() {
//    - `restock(int quantity)`, который увеличивает `stock`.
//  static int restock() {


public class Product {

    String name;

    double price;
    int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void sell(int quantity) {
        if (stock >= quantity) {
            stock -= quantity;
        }
    }

    public void restock(int quantity) {
        if (quantity >= 0) {
            stock += quantity;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}

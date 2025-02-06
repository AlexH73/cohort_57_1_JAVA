package Practice.Practice_22;
//[x] TODO: Создать класс Product
//[x] 1. Добавить поля:
//    - `name` (String) - Название продукта
//    - `price` (double) - Цена продукта
//    - `stock` (int) - Количество на складе
//[x] 2. Создать конструктор, принимающий все три параметра.
//[x] 3. Реализовать методы:
//    - `sell(int quantity)`, который уменьшает `stock`, если товара достаточно на складе.
//    - `restock(int quantity)`, который увеличивает `stock`.

class Product {
    String name;
    double price;
    int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    // Метод для отображения информации о товаре
    public void displayProductInfo() {
        System.out.println("Product: " + name + ", \nPrice: " + price + ", \nStock: " + stock);
        //System.out.println("Is adult: " + (isAdult() ? "Yes" : "No"));
    }
    public void sell(int quantity) {
        if (stock >= quantity) {
            stock -= quantity;
        }
    }

    public void restock(int quantity) {
        stock += quantity;
    }

    @Override
    public String toString() {
        return "\nProduct {" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}


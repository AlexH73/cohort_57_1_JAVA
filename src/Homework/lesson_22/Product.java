package Homework.lesson_22;
//[x] TODO: Создать класс Product
//[x] 1. Добавить поля:
//    - `name` (String) - Название продукта
//    - `price` (double) - Цена продукта
//    - `stock` (int) - Количество на складе
//[x] 2. Создать конструктор, принимающий все три параметра.
//[x] 3. Реализовать методы:
//    - `sell(int quantity)`, который уменьшает `stock`, если товара достаточно на складе.
//    - `restock(int quantity)`, который увеличивает `stock`.

/**
 * <h1>Задание 3: Расширение класса Product</h1>
 * 1. Добавить метод applyDiscount(double percentage),
 * который уменьшает цену товара на заданный процент.<br>
 * 2. Изменить метод sell(int quantity), чтобы он проверял наличие нужного
 * количества товара; если товара недостаточно, продавать только доступное
 * количество и выводить сообщение.<br>
 * 3. Протестировать класс, создав несколько объектов Product и применив скидки и продажи.
 */

public class Product {
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
        System.out.println("Product: " + name + ", Price: " + price + ", Stock: " + stock);
    }

    public void sell(int quantity) {
        if (stock >= quantity) {
            stock -= quantity;
            System.out.println("\nSold " + quantity + " units of " + name + ". Remaining stock: " + stock);
        } else {
            System.out.println("\nNot enough stock for " + name + ". Available stock: " + stock);
            System.out.println("Sold " + stock + " units of " + name);
            stock = 0;
        }
    }

    public void applyDiscount(double percentage) {
        this.price = this.price * (1 - percentage / 100);
    }

    public void restock(int quantity) {
        stock += quantity;
        System.out.println("Restocked " + quantity + " units of " + name + ". Current stock: " + stock);
    }

    @Override
    public String toString() {
        return "Product {" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
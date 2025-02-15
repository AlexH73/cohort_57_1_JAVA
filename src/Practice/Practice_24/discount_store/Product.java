package Practice.Practice_24.discount_store;

/**
 * Шаг 1: Создание базового класса Product
 * <p>
 * ✔ Поля name (название товара) и price (цена).
 * ✔ Метод applyDiscount(), который выводит "Скидка пока не применяется.".
 */
public class Product {
    private String name;
    private double price;

    // Конструктор
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Метод applyDiscount()
    public void applyDiscount() {
        System.out.println("Скидка пока не применяется.");
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

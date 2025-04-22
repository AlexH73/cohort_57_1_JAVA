package main_project.src.classes;
import main_project.src.interfaces.*;

public class Product implements IProduct {
    private String name;          // Название продукта
    private double price;         // Цена продукта
    private String description;   // Описание продукта
    private int stockQuantity;    // Количество на складе

    // Конструктор
    public Product(String name, double price, String description, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Цена продукта не может быть отрицательной.");
        }
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getStockQuantity() {
        return stockQuantity;
    }

    @Override
    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity < 0) {
            throw new IllegalArgumentException("Количество на складе не может быть отрицательным.");
        }
        this.stockQuantity = stockQuantity;
    }

    @Override
    public void reduceStock(int quantity) {
        if (quantity > stockQuantity) {
            throw new IllegalArgumentException("Недостаточно товара на складе для уменьшения на указанное количество.");
        }
        stockQuantity -= quantity;
    }

    @Override
    public void increaseStock(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Увеличение количества на складе не может быть отрицательным.");
        }
        stockQuantity += quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", stockQuantity=" + stockQuantity +
                '}';
    }
}


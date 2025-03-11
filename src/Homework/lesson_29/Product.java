package Homework.lesson_29;

import java.util.List;

public class Product {
    private String name;
    private double price;
    private int rating;
    private int quantity;
    private int soldPerMonth; //Количество проданных едениц за месяц

    public Product(String name, double price, int rating, int quantity, int soldPerMonth) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.quantity = quantity;
        this.soldPerMonth = soldPerMonth;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSoldPerMonth() {
        return soldPerMonth;
    }

    @Override
    public String toString() {
        return "Product{" + "Name='" + name + '\'' +
                ", Price=" + price +
                ", Rating=" + rating +
                ", Quantity=" + quantity +
                ", SoldPerMonth=" + soldPerMonth + '}';
    }
}

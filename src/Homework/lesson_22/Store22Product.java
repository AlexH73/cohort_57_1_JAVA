package Homework.lesson_22;

public class Store22Product {
    double price;
    String productName;

    public Store22Product(double price, String productName) {
        this.price = price;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Store22{" +
                "price=" + price +
                ", productName='" + productName + '\'' +

                '}';
    }
}
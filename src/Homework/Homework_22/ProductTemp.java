package Homework.Homework_22;

public class ProductTemp {
    double price;
    String productName;

    public ProductTemp(double price, String productName) {
        this.price = price;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "ProductTemp{" +
                "price=" + price +
                ", productName='" + productName + '\'' +
                '}';
    }
}

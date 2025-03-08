package Hausaufgaben.Hausaufgaben_29.Untericht_29;

public class Product {
    private String title;
    private double price;
    private int rating;
    private int quantity;
    private String operatingSystem;


    public Product(String title, double price, int rating, int quantity, String operatingSystem) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.quantity = quantity;
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getTitle() {
        return title;
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

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", quantity=" + quantity +
                ", operatingSystem=" + operatingSystem +
                '}';
    }
}


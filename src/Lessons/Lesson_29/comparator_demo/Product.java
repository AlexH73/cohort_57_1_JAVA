package Lessons.Lesson_29.comparator_demo;

public class Product {
    private String title;
    private double price;
    private int rating;
    private int quantity;


    public Product(String title, double price, int rating, int quantity) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.quantity = quantity;
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
                '}';
    }
}

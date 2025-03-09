package Homework.lesson_29.HomeworkYulia_29;

class Product {
    String title;
    double price;
    int rating, quantity, salesPerMonth;

    Product(String title, double price, int rating, int quantity, int salesPerMonth) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.quantity = quantity;
        this.salesPerMonth = salesPerMonth;
    }

    @Override
    public String toString() {
        return title + ", " + price + ", " + rating + ", " + quantity + ", " + salesPerMonth;
    }
}
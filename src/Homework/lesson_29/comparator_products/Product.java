package Homework.lesson_29.comparator_products;

public class Product {
    // Добавлено новое поле для домашнего задания
    private String title;
    private double price;
    private int rating, quantity, soldPerMonth; // Новое поле: количество проданных за месяц

    // Обновленный конструктор с новым полем
    public Product(String title, double price, int rating, int quantity, int soldPerMonth) {
        this.price = price;
        this.quantity = quantity;
        this.rating = rating;
        this.soldPerMonth = soldPerMonth;
        this.title = title;
    }

    // Геттер для нового поля
    public int getSoldPerMonth() {
        return soldPerMonth;
    }

    // Остальные геттеры и toString
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Product {" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", quantity=" + quantity +
                ", soldPerMonth=" + soldPerMonth +  // Добавлено в вывод
                '}';
    }
}

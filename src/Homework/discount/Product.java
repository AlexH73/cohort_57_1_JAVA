package Homework.discount;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void applyDiscount() {
        System.out.println("Применена скидка: " + price * 0.1);
        price -= price * 0.1;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
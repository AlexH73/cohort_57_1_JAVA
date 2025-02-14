package Homework.lesson_24.discount_store;

public class Electronics extends Product{

    // Конструктор
    public Electronics(String name, double price) {
        super(name, price);
    }

    // Переопределение метода applyDiscount()
    @Override
    public void applyDiscount() {
        super.applyDiscount();
        double discountedPrice = getPrice() * 0.9;
        setPrice(discountedPrice);
        System.out.println("Цена снижена на 10%. Новая цена: " + getPrice());
    }
}

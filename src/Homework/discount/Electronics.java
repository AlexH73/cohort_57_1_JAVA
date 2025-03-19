package Homework.discount;

public class Electronics extends Product {

    public Electronics(String name, double price) {
        super(name, price);  // Вызов конструктора родительского класса
    }

    @Override
    public void applyDiscount() {
        double discountPrice = super.getPrice() * 0.9;
        super.setPrice(discountPrice);
        System.out.println("Скидка для электроники: 10%");
    }
}
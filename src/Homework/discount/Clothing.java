package Homework.discount;

public class Clothing extends Product {

    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public void applyDiscount() {
        double discountPrice = super.getPrice() * 0.8;
        super.setPrice(discountPrice);
        System.out.println("Скидка для одежды: 20%");
    }
}

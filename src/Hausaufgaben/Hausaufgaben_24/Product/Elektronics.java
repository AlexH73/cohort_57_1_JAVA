package Hausaufgaben.Hausaufgaben_24.Product;

public class Elektronics extends Product{
    // 2. `Electronics` переопределяет `applyDiscount()`, снижая цену на 10%.
    public Elektronics(String name, double price) {
        super(name, price);
    }

    @Override
    public void applyDiscount() {
        super.applyDiscount();
        double discountRate = getPrice() * 0.9;
        setPrice(discountRate);
        System.out.println(getName() + " " + "Discounted Price: " + getPrice());
    }
}

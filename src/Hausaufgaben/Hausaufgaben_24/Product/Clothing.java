package Hausaufgaben.Hausaufgaben_24.Product;

public class Clothing extends Product {
    // 3. `Clothing` переопределяет `applyDiscount()`, снижая цену на 20%, если сезонная распродажа.
    private boolean sale;

    public Clothing(String name, double price, boolean sale) {
        super(name, price);
        this.sale = sale;
    }

    @Override
    public void applyDiscount() {
        super.applyDiscount();
        if (sale) {
            double discountRate = getPrice() * 0.8;
            setPrice(discountRate);
            System.out.println(getName()+ " " + "Discounted Price: " + getPrice());
        } else {
            System.out.println(getName()+ " " + "Preis unverendert: " + getPrice());
        }
    }
}

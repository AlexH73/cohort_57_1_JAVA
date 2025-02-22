package Hausaufgaben.Hausaufgaben_24.Product;

public class StoreMain {
    public static void main(String[] args) {
        Product[] products = {
                new Elektronics("TV", 123.12),
                new Clothing("Toster", 12.45, false)
        };

        for (Product product: products) {
            product.applyDiscount();
        }

    }
}
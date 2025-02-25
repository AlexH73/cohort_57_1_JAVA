package Homerwork.Practica.Practica22;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product("Ноутбук", 1000.0, 10);
        product.displayProductInfo();
        product.sell(5);
        product.restock(3);
        product.sell(10);

    }
}

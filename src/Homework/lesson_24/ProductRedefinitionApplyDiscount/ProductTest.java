package Homework.lesson_24.ProductRedefinitionApplyDiscount;
//Тестовый класс
public class ProductTest {
    public static void main(String[] args) {
        Product genericProduct = new Product("Товар", 100);
        genericProduct.displayInfo();
        genericProduct.applyDiscount();
        genericProduct.displayInfo();

        System.out.println();

        Electronics laptop = new Electronics("Ноутбук", 2000);
        laptop.displayInfo();
        laptop.applyDiscount();
        laptop.displayInfo();

        System.out.println();

        Clothing jeans = new Clothing("Джинсы", 300, true);
        jeans.displayInfo();
        jeans.applyDiscount();
        jeans.displayInfo();

        System.out.println();

        Clothing socken = new Clothing("Носки", 60, false);
        socken.displayInfo();
        socken.applyDiscount();
        socken.displayInfo();

    }
}

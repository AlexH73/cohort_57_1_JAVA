package Homework.lesson_22;

public class ProductTest {
    public static void main(String[] args) {
        // Создание нескольких объектов Product
        Product product1 = new Product("Laptop", 1500.0, 10);
        Product product2 = new Product("Smartphone", 800.0, 20);
        Product product3 = new Product("Tablet", 600.0, 15);

        // Вывод начального состояния товаров
        System.out.println("\nInitial condition of the goods:");
        product1.displayProductInfo();
        product2.displayProductInfo();
        product3.displayProductInfo();

        // Применение скидки
        product1.applyDiscount(10.0);
        product2.applyDiscount(15.0);
        product3.applyDiscount(20.0);

        // Вывод состояния товаров после применения скидки
        System.out.println("\nAfter applying the discount:");
        product1.displayProductInfo();
        product2.displayProductInfo();
        product3.displayProductInfo();

        // Продажа товара
        product1.sell(5);
        product2.sell(25); // Недостаточно товара на складе
        product3.sell(10);

        // Пополнение товара
        product1.restock(10);
        product2.restock(20);
        product3.restock(5);

        // Вывод состояния товаров после операций
        System.out.println("\nCondition of goods after operations:");
        product1.displayProductInfo();
        product2.displayProductInfo();
        product3.displayProductInfo();
    }
}
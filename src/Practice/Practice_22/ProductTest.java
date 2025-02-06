package Practice.Practice_22;

public class ProductTest {
    public static void main(String[] args) {
        // Создание нескольких объектов Product
        Product product1 = new Product("Laptop", 1500.0, 10);
        Product product2 = new Product("Smartphone", 800.0, 20);
        Product product3 = new Product("Tablet", 600.0, 15);
        Product product4 = new Product("Smartwatch", 200.0, 30);

        // Вывод начального состояния товаров
        System.out.println("Начальное состояние товаров:");
        System.out.println(product1);
        product1.displayProductInfo();
        System.out.println(product2);
        product2.displayProductInfo();
        System.out.println(product3);
        product3.displayProductInfo();
        System.out.println(product4);
        product4.displayProductInfo();

        // Продажа товара
        product1.sell(5);
        product2.sell(25); // Недостаточно товара на складе
        product3.sell(10);
        product4.sell(5);

        // Пополнение товара
        product1.restock(10);
        product2.restock(20);
        product3.restock(5);
        product4.restock(10);

        // Вывод состояния товаров после операций
        System.out.println("\nСостояние товаров после операций:");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
    }
}

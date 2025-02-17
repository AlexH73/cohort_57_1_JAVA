package Homework.Homework_24.discount_store;

public class Main {
    public static void main(String[] args) {
        // Тестирование классов Product, Electronics и Clothing
        Product product = new Product("Общий продукт", 100.0);
        Electronics electronics = new Electronics("Телевизор", 1000.0);
        Clothing clothing = new Clothing("Куртка", 200.0, true);

        product.applyDiscount(); // Ожидается: Счет на оплату.
        System.out.println("Цена продукта: " + product.getPrice() + product.currency);

        electronics.applyDiscount(); // Ожидается: Счет на оплату. Цена снижена на 10%. Новая цена: 900.0
        System.out.println("Цена электроники: " + electronics.getPrice() + electronics.currency);

        clothing.applyDiscount(); // Ожидается: Счет на оплату. Цена снижена на 20% из-за сезонной распродажи. Новая цена: 160.0
        System.out.println("Цена одежды: " + clothing.getPrice() + clothing.currency);
    }
}

package Practice.Practice_24.discount_store;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Создание массива продуктов различных типов
        Product[] products = {
                new Electronics("Телевизор", 1000.0, 2),
                new Electronics("Ноутбук", 1500.0, 3),
                new Electronics("Смартфон", 700.0, 1),
                new Clothing("Куртка", 200.0, "L", "Синяя", true),
                new Clothing("Футболка", 50.0, "M", "Красная", false),
                new Clothing("Штаны", 80.0, "XL", "Черные", true),
                new Grocery("Молоко", 3.0, LocalDate.now().plusDays(5)),
                new Grocery("Хлеб", 2.0, LocalDate.now().plusDays(10)),
                new Grocery("Яблоки", 5.0, LocalDate.now().plusDays(2)),
                new Grocery("Сыр", 8.0, LocalDate.now().plusDays(15))
        };

        // Применение скидок
        for (Product product : products) {
            System.out.println("Товар: " + product.getName());
            System.out.println("Начальная цена: " + product.getPrice() + product.currency);
            product.applyDiscount();
            System.out.println();
        }
    }
}

package Homework.Homework_22;

public class StoreTest {
    public static void main(String[] args) {
        // Создание объекта Store
        Store store = new Store();

        // Добавление товаров в магазин
        store.addProduct(new Product("Ноутбук", 1500.0, 10));
        store.addProduct(new Product("Смартфон", 800.0, 20));
        store.addProduct(new Product("Планшет", 600.0, 15));
        store.addProduct(new Product("Смарт-часы", 300.0, 30));
        store.addProduct(new Product("Телевизор", 1200.0, 5));
        store.addProduct(new Product("Наушники", 150.0, 50));
        store.addProduct(new Product("Игровая консоль", 500.0, 8));
        store.addProduct(new Product("Камера", 700.0, 12));
        store.addProduct(new Product("Электронная книга", 200.0, 25));
        store.addProduct(new Product("Принтер", 250.0, 10));

        // Вывод всех товаров
        System.out.println("Все товары в магазине:");
        store.displayAllProducts();

        // Поиск самого дорогого товара
        Product mostExpensive = store.findMostExpensiveProduct();
        System.out.println("\nСамый дорогой товар:");
        if (mostExpensive != null) {
            mostExpensive.displayProductInfo();
        } else {
            System.out.println("Магазин пуст.");
        }
    }
}
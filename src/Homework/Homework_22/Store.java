package Homework.Homework_22;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Дополнительное задание</h1>
 * <b>Создать новый класс Store, который управляет списком товаров (Product). Реализовать:</b>
 * <p>
 *    1. Поле products (список товаров).<br>
 *    2. Метод addProduct(Product product), который добавляет товар в магазин.<br>
 *    3. Метод displayAllProducts(), который выводит список всех товаров.<br>
 *    4. Метод findMostExpensiveProduct(), который возвращает самый дорогой товар.<br>
 *    5. Протестировать, создав Store и добавив несколько товаров.
 */

public class Store {
    List<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    // Метод для добавления товара в магазин
    public void addProduct(Product product) {
        products.add(product);
    }

    // Метод для вывода списка всех товаров
    public void displayAllProducts() {
        for (Product product : products) {
            product.displayProductInfo();
        }
    }

    // Метод для поиска самого дорогого товара
    public Product findMostExpensiveProduct() {
        if (products.isEmpty()) {
            return null;
        }

        Product mostExpensive = products.get(0);
        for (Product product : products) {
            if (product.price > mostExpensive.price) {
                mostExpensive = product;
            }
        }
        return mostExpensive;
    }
}

/* Homework.lesson_22;

public class StoreTest {
    public static void main(String[] args) {
        //Создаем магазин
        Store store = new Store();

        //Создаем несколько товаров
        Product product1 = new Product("Ноутбук" , 1500.0, 3);
        Product product2 = new Product("Наушники" , 120.0, 50);
        Product product3 = new Product("Смартфон", 700.0, 32);

        //добовляем товары в магазин
        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);

        //Выводим список всех товаров
        store.displayAllProducts();
        //Находим и выводим самый дорогой товар
        Product mostExprnsive = store.findMostExpensiveProduct();
        if (mostExprnsive != null) {
            System.out.println("Самый дорогой товар:");
            mostExprnsive.displayInfo();
        }

    }
}
*/
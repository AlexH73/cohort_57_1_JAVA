package Homework.lesson_22;

import java.util.ArrayList;

/*Дополнительное задание (необязательное, для продвинутых студентов)
Создать новый класс Store, который управляет списком товаров (Product). Реализовать:

Поле products (список товаров).
Метод addProduct(Product product), который добавляет товар в магазин.
Метод displayAllProducts(), который выводит список всех товаров.
Метод findMostExpensiveProduct(), который возвращает самый дорогой товар.
Протестировать, создав Store и добавив несколько товаров.*/
/*public class Store {
    ArrayList<Product>products; //Список товаров
    //Конструктор
    public Store() {
        this.products = new ArrayList<>();
    }
    //Метод addProduct(Product product), который добавляет товар в магазин
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Товар \" " + product + "\" добавлен в магазин ");
    }
    //Метод displayAllProducts(), который выводит список всех товаров
    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("Магазин пуст. Нет товаров для отображения");
            return;
        }
        System.out.println("Список всех товаров в магазине:");
        for (Product product : products) {
            product.displayInfo();
        }
    }
    //Метод findMostExpensiveProduct(), который возвращает самый дорогой товар
    // Возвращаетитовар или null, если товаров нет
    public Product findMostExpensiveProduct() {
        if (products.isEmpty()) {
            System.out.println("Магазин пуст. Нет товаров для поиска");
            return null;
        }
        Product mostExprnsive = products.get(0);
        for (Product product : products) {
            if (product.price() > mostExprnsive.price) {
                mostExprnsive = product;
            }
        }
        return mostExprnsive;
    }


}
*/

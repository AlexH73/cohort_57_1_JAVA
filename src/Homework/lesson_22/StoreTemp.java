package Homework.lesson_22;


import java.util.Arrays;

/*
Создать новый класс Store, который управляет списком товаров (Product). Реализовать:


Поле products (список товаров).
Метод addProduct(Product product), который добавляет товар в магазин.
Метод displayAllProducts(), который выводит список всех товаров.
Метод findMostExpensiveProduct(), который возвращает самый дорогой товар.
Протестировать, создав Store и добавив несколько товаров.

1. создать класс Store
    products (список) -> массив, который содержит Product
2. управляет списком товаров Product.
3. создать класс Product (какой?)
    int/long/double price
    опциональное поле String с поисанием или именем

возвращаемся к формулировке:
 */
public class StoreTemp {
    ProductTemp[] products; // null

    public StoreTemp(){
        this.products = new ProductTemp[0];
    }

    public StoreTemp(ProductTemp[] products) {
        this.products = products;
    }

    public void addProduct(ProductTemp product) {
        products = Arrays.copyOf(products, products.length + 1);
        products[products.length - 1] = product;
    }

    public void displayAllProducts() {
        for (ProductTemp product : products) {
            System.out.println(product);
        }

        // Arrays.toString(products);
    }

    public ProductTemp findMostExpensiveProduct() {
        if (products == null || products.length == 0) {
//            ProductTemp mostExpProduct = null;
//            return mostExpProduct;
            return null;
        }

        // предположим, что первый товар в списке - самый дорогой
        ProductTemp mostExpProduct = products[0];

        // перебираем все товары в списке продуктов
        for (int i = 0; i < products.length; i++) {
            // сравниваем цену самого дорогого на данный момент товара с ценого i-го товара,
            // если цена i-го товара выше цены самого дорогого из найденных, то значит,
            // мы нашли более дорогой товар в списке товаров и теперь i-й товар считаем
            // самым дорогим и будем сравнивать с ним.
            products[i].price = 1;
            if (mostExpProduct.price < products[i].price) {
                mostExpProduct = products[i];
            }
        }

        // возвращаем найденный i-й товар, как самый дорогой
        return mostExpProduct;
    }
}

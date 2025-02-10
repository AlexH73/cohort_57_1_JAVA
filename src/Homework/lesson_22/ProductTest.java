package Homework.lesson_22;

public class ProductTest {
    public static void main(String[] args) {
        //Создаем несколько товаров
        Product product1 = new Product("Ноутбук" , 1000.0, 10);
        Product product2 = new Product("Смартфон" , 500.0, 5);
        //Выводим информацию о товарах
        product1.displayInfo();
        product2.displayInfo();
        //Применяем скидку
        product1.applyDiscount(10);
        product2.applyDiscount(15);

        //Продаем товары
        product1.sell(7);
        product2.sell(6);
        //Выводим обновленную информацию
        product1.displayInfo();
        product2.displayInfo();
    }
}

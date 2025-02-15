package Homework.lesson_23;
//Основной класс для тестирования
public class OnlineStoreTest {
    public static void main(String[] args) {
        //Создаем объект OnlineStore
        OnlineStore product = new OnlineStore("Ноутбук", 1500, 20);
        //Выводим информацию о продукте
        product.displayProductInfo();
        // Изменяем скидку (корректное значение)
        product.setDiscountPercentage(20);
        System.out.println("\n После изменения скидки:");
        product.displayProductInfo();

        product.setDiscountPercentage(60);
        System.out.println("\n После изменения скидки:");
        product.displayProductInfo();

    }
}

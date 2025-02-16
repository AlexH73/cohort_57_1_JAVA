package Hausaufgaben.Hausaufgaben_22.Product;
/*
Задание 3: Расширение класса Product.
Добавить метод applyDiscount(double percentage), который уменьшает цену товара на заданный процент.
Изменить метод sell(int quantity), чтобы он проверял наличие нужного количества товара; если товара недостаточно, продавать только доступное количество и выводить сообщение.
Протестировать класс, создав несколько объектов Product и применив скидки и продажи.
 */
public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product("carrot", 2.75, 1000);

        product.sell(2000);
        System.out.println("product = " + product);

        product.restock(2000);
        System.out.println("product = " + product);

        product.sell(1523);
        System.out.println("product = " + product);
    }
}

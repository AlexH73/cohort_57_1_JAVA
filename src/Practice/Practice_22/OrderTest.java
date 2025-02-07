package Practice.Practice_22;

public class OrderTest {
    public static void main(String[] args) {
        // Создание объекта Order
        Order order1 = new Order(1, "Алекс Х.", 150.75);

        // Вывод начальной информации о заказе
        order1.displayOrder();

        // Обновление статуса заказа
        order1.updateStatus("Отправлен");
        System.out.println("\nПосле обновления статуса:");
        order1.displayOrder();

        // Еще одно обновление статуса заказа
        order1.updateStatus("Доставлен");
        System.out.println("\nПосле еще одного обновления статуса:");
        order1.displayOrder();

    }
}

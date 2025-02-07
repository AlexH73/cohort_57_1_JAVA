package Homework.lesson_22;

public class OrderTest {
    public static void main(String[] args) {
        // Создание объектов Order
        Order order1 = new Order(1, "Алекс Х.", 150.75);
        Order order2 = new Order(2, "Мария С.", 250.00);
        Order order3 = new Order(3, "Иван П.", 100.50);

        // Вывод начальной информации о заказах
        System.out.println("Начальная информация о заказах:");
        order1.displayOrder(10, 5);
        System.out.println();
        order2.displayOrder(8, 10);
        System.out.println();
        order3.displayOrder(5, 0);
        System.out.println();

        // Обновление статуса заказов
        order1.updateStatus("Отправлен");
        order2.updateStatus("Доставлен");
        order3.updateStatus("Отправлен");

        // Вывод информации о заказах после обновления статуса
        System.out.println("Информация о заказах после обновления статуса:");
        order1.displayOrder(10, 5);
        System.out.println();
        order2.displayOrder(8, 10);
        System.out.println();
        order3.displayOrder(5, 0);

    }
}

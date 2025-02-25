package Homerwork.Practica.Practica22;
// 1. Добавить поля:
//    - `orderId` (int) - Уникальный идентификатор заказа
//    - `customerName` (String) - Имя покупателя
//    - `totalAmount` (double) - Сумма заказа
//    - `status` (String) - Статус заказа ("Ожидает", "Отправлен", "Доставлен")
// 2. Создать конструктор, принимающий `orderId`, `customerName`, `totalAmount`.
// 3. Реализовать методы:
//    - `updateStatus(String newStatus)`, который меняет статус заказа.
//    - `displayOrder()`, который выводит информацию о заказе.
public class Order {
    private int orderId;
    private String customerName;
    private double totalAmount;
    private String status;

    //Конструктор, по умолчанию статус "Ожидает"
    public Order(int orderId, String customerName, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = "Ожидает";
    }

    //Метод для обновления статуса заказа
    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Статус заказа #" + orderId + " обновлен: " + status);
    }

    //Метод для отображения информации о заказе
    public void displayOrder() {
        System.out.println("Заказ #" + orderId);
        System.out.println("Покупатель: " + customerName);
        System.out.println("Сумма: " + totalAmount);
        System.out.println("Статус: " + status);
        System.out.println("-----------------------------");
    }
}

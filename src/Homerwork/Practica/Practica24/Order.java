package Homerwork.Practica.Practica24;
//- `status` (String) - Статус заказа ("Ожидает", "Отправлен", "Доставлен")
// 2. Создать конструктор, принимающий `orderId`, `customerName`, `totalAmount`.
// 3. Реализовать методы:
//    - `updateStatus(String newStatus)`, который меняет статус заказа.
//    - `displayOrder()`, который выводит информацию о заказе.
public class Order {
    private int orderId;
    private String customerName;
    private double totalAmount;
    private String status;

    public Order(int orderId, String customerName, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = "Ожидает";
    }

    public void updateStatus(String newStatus) {
        if (newStatus.equals("Ожидает") ||
                newStatus.equals("Отправлен") || newStatus.equals("Доставлен")) {
            this.status = newStatus;
            System.out.println("Order status updated to: " + newStatus);
        } else {

            System.out.println("Invalid status. Choose from: Ожидает, Отправлен, Доставлен.");
        }
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Status: " + status);
    }
}

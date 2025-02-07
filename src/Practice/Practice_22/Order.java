package Practice.Practice_22;
//[х] TODO: Создать класс Order
//[x] 1. Добавить поля:
//    - `orderId` (int) - Уникальный идентификатор заказа
//    - `customerName` (String) - Имя покупателя
//    - `totalAmount` (double) - Сумма заказа
//    - `status` (String) - Статус заказа ("Ожидает", "Отправлен", "Доставлен")
//[x] 2. Создать конструктор, принимающий `orderId`, `customerName`, `totalAmount`.
//[х] 3. Реализовать методы:
//    - `updateStatus(String newStatus)`, который меняет статус заказа.
//    - `displayOrder()`, который выводит информацию о заказе.

class Order {
    int orderId;
    String customerName;
    double totalAmount;
    String status;

    // Конструктор, принимающий orderId, customerName, totalAmount
    public Order(int orderId, String customerName, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = "Ожидает"; // Устанавливаем статус по умолчанию
    }

    // Метод для обновления статуса заказа
    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    // Метод для отображения информации о заказе
    public void displayOrder() {
        System.out.println("Идентификатор заказа: " + orderId);
        System.out.println("Имя покупателя: " + customerName);
        System.out.println("Общая сумма: " + totalAmount);
        System.out.println("Статус: " + status);
    }
}

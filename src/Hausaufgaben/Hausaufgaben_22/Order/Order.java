package Hausaufgaben.Hausaufgaben_22.Order;
// TODO: Создать класс Order
class Order {

// 1. Добавить поля:
//    - `orderId` (int) - Уникальный идентификатор заказа
    int orderId;
//    - `customerName` (String) - Имя покупателя
    String customerName;
//    - `totalAmount` (double) - Сумма заказа
    double totalAmount;
//    - `status` (String) - Статус заказа ("Ожидает", "Отправлен", "Доставлен")
    String status;
// 2. Создать конструктор, принимающий `orderId`, `customerName`, `totalAmount`.

    public Order(int orderId, String customerName, double totalAmount, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = status;
    }

// 3. Реализовать методы:
//    - `updateStatus(String newStatus)`, который меняет статус заказа.
    void updateStatus(String newStatus) {
        this.status = newStatus;
    }


//    - `displayOrder()`, который выводит информацию о заказе.
void displayOrder(){
    System.out.printf(
            "\n%s, %n ,%s, %f \n",
            this.status,
            this.orderId,
            this.customerName,
            this.totalAmount);
    }
}







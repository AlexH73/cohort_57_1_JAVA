package Hausaufgaben.Hausaufgaben_22.Order;

// TODO: Создать класс Order
/*
Задание 5: Улучшение класса Order.
Добавить метод calculateFinalAmount(double taxRate, double discountPercentage), который возвращает итоговую сумму заказа с учетом налога и скидки.
Изменить displayOrder(), чтобы он отображал финальную сумму с учетом налога и скидки.
Протестировать класс, создав несколько объектов Order с разными налогами и скидками.

// 1. Добавить поля:
//    - `orderId` (int) - Уникальный идентификатор заказа
//    - `customerName` (String) - Имя покупателя
//    - `totalAmount` (double) - Сумма заказа
//    - `status` (String) - Статус заказа ("Ожидает", "Отправлен", "Доставлен")
// 2. Создать конструктор, принимающий `orderId`, `customerName`, `totalAmount`.
// 3. Реализовать методы:
//    - `updateStatus(String newStatus)`, который меняет статус заказа.
//    - `displayOrder()`, который выводит информацию о заказе.
 */
class Order {
    int orderId;
    String customerName;
    double totalAmount;
    String status;

    public Order(int orderId, String customerName, double totalAmount, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    // исправлена ошибка
    public void displayOrder() {
        System.out.printf(
                // "\n%s, %n ,%s, %f \n",
                "\n%s, %d ,%s, %f \n",
                this.status,
                this.orderId,
                this.customerName,
                this.totalAmount);
    }
}







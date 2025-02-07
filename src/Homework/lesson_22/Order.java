package Homework.lesson_22;
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

/**
 * <h1>Задание 5: Улучшение класса Order</h1>
 *    1. Добавить метод calculateFinalAmount(double taxRate, double discountPercentage),
 *    который возвращает итоговую сумму заказа с учетом налога и скидки.<br>
 *    2. Изменить displayOrder(), чтобы он отображал финальную сумму с учетом налога и скидки.<br>
 *    3. Протестировать класс, создав несколько объектов Order с разными налогами и скидками.<br>
 */

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

    // Метод для вычисления итоговой суммы заказа с учетом налога и скидки
    public double calculateFinalAmount(double taxRate, double discountPercentage) {
        double taxAmount = totalAmount * taxRate / 100;
        double discountAmount = totalAmount * discountPercentage / 100;
        return totalAmount + taxAmount - discountAmount;
    }

    // Метод для отображения информации о заказе
    public void displayOrder(double taxRate, double discountPercentage) {
        double finalAmount = calculateFinalAmount(taxRate, discountPercentage);
        System.out.println("Идентификатор заказа: " + orderId);
        System.out.println("Имя покупателя: " + customerName);
        System.out.println("Общая сумма: " + totalAmount);
        System.out.println("Налоговая ставка: " + taxRate + "%");
        System.out.println("Процент скидки: " + discountPercentage + "%");
        System.out.println("Финальная сумма: " + finalAmount);
        System.out.println("Статус: " + status);
    }
}

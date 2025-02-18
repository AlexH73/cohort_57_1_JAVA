package Homework.lesson_25.payment_system;

// Базовый класс PaymentMethod
public class PaymentMethod {
    private double amount;
    private String currency;

    public PaymentMethod(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    // Метод pay, который будет переопределён в подклассах
    public void pay() {
        System.out.println("Оплата на сумму " + amount + " " + currency);
    }

    // Перегруженный метод pay с transactionId
    public void pay(String transactionId) {
        System.out.println("Оплата на сумму " + amount + " " + currency + " с ID транзакции: " + transactionId);
    }

    // Метод refund для возврата платежа
    public void refund() {
        System.out.println("Возврат платежа на сумму " + amount + " " + currency);
    }

    // Геттеры
    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }
}

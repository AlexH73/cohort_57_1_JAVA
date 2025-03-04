package Homework.lesson_25;
//🔹 Шаг 1: Реализовать базовый класс PaymentMethod с общими свойствами и методом pay().
//✔ Добавьте в PaymentMethod метод refund(), который можно переопределить в подклассах для имитации возврата платежа.
//✔ Реализуйте перегрузку метода pay(), чтобы можно было передавать дополнительные детали (например, transactionId).
public class PaymentMethod {
     private double amount;
     private  String currency;

    public PaymentMethod(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return  amount;
    }

    public String getCurrency() {
        return currency;
    }

    // Обычный метод оплаты (без transactionId)
    public void pay() {

    }
    // Перегруженный метод pay() с transactionId
    public void pay(String transactionId) {
        System.out.println("Оплата " + amount + " " + currency + " с идентификатором транзакции: " + transactionId);
    }


    // Метод возврата
    public void refund() {
        System.out.println("Возврат платежа на сумму " + amount + " " + currency);
    }
}

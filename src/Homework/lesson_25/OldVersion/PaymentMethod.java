package Homework.lesson_25.OldVersion;
/*Шаг 1: Создание базового класса PaymentMethod
✔ Определите поля amount (сумма) и currency (валюта).
✔ Реализуйте метод pay(), который позже будет переопределён в подклассах.
🚀 Дополнительное задание:
✔ Добавьте в PaymentMethod метод refund(), который можно переопределить в подклассах для имитации возврата платежа.
✔ Реализуйте перегрузку метода pay(), чтобы можно было передавать дополнительные детали (например, transactionId).*/

public abstract class PaymentMethod {
    protected double amount;
    protected String currency;

    public PaymentMethod(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    public abstract void pay(String s);

    public void refund() {
        System.out.println("Возвращено " + amount + " " + currency);
    }

}

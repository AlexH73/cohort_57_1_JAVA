package Homework.lesson_25;
/*Шаг 1: Создание базового класса PaymentMethod
✔ Определите поля amount (сумма) и currency (валюта).
✔ Реализуйте метод pay(), который позже будет переопределён в подклассах.*/

public abstract class PaymentMethod {
    protected double amount;
    protected String currency;

    public PaymentMethod(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public abstract void pay();
}

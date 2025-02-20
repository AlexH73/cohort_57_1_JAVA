package Homework.lesson_25;
/*Шаг 1: Создание базового класса PaymentMethod
✔ Определите поля amount (сумма) и currency (валюта).
✔ Реализуйте метод pay(), который позже будет переопределён в подклассах.*/

//Базовый класс для всех способов оплаты
public abstract class PaymentMethod {
    protected double amount;
    protected String currency;


    //Конструктор
    public PaymentMethod(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    //Метод для оплаты будет переопределяться
    public abstract void pay();
}

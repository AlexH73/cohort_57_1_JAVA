// Задание: Реализация полиморфизма в системе платежей
//🔹 В этом задании вам нужно создать систему, поддерживающую разные способы оплаты.
//🔹 Шаг 1: Реализовать базовый класс PaymentMethod с общими свойствами и методом pay().
//🔹 Шаг 2: Создать подклассы CreditCardPayment, PayPalPayment и CryptoPayment, переопределяя pay().
//🔹 Шаг 3: Использовать полиморфизм для обработки различных типов платежей единым способом.

package Homework.lesson_25.HomeworkYulia_25;

public class PaymentMethod {
    protected double amount;
    protected String currency;

    public PaymentMethod(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public void pay() {
    }
}


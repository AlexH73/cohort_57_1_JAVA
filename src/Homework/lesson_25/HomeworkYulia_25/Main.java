package Homework.lesson_25.HomeworkYulia_25;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PaymentMethod> payments = new ArrayList<>();

        // Добавляем разные способы оплаты в список
        payments.add(new CreditCardPayment(100.0, "USD", "1554-5677-9876-5552"));
        payments.add(new PayPalPayment(70.0, "EUR", "Yulia@gmail.com"));
        payments.add(new CryptoPayment(0.009, "BTC", "1A2b3C4d5E6f777H9I0J"));

        // Полиморфный вызов метода pay() для каждого способа оплаты
        for (PaymentMethod payment : payments) {
            payment.pay();
        }
    }
}




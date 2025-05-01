package Homework.lesson_25;

import Homework.lesson_25.OldVersion.CreditCardPayment;
import Homework.lesson_25.OldVersion.CryptoPayment;
import Homework.lesson_25.OldVersion.PayPalPayment;
import Homework.lesson_25.OldVersion.PaymentMethod;

import static Homework.lesson_20.QualityOfDetailsAnalysis.i;

public class Main {
    public static void main(String[] args) {
        PaymentMethod[] payments = {
                //Создаем массив платежей
                new CreditCardPayment(100.0, "$", "3427777"),
                new PayPalPayment(50.0, "$", "user@example.com"),
                new CryptoPayment(0.01, "ВТС", "36RDC56678gjkTGGKikuhh")
        };

        // Полиморфный вызов метода pay() (без transactionId)
        System.out.println("\n--------- Оплата без transactionId -----------");
        for (PaymentMethod payment : payments) {
            payment.pay("F3466" + (1000 + i));

        }

        // Полиморфный вызов перегруженного метода pay() (с transactionId)
        System.out.println("\n--------- Оплата с transactionId -----------");
        for (int i = 0; i < payments.length; i++) {
            payments[i].pay("F3466" + (1000 + i)); // Передаем transactionId
        }

        // Выполняем возвраты
        System.out.println("\n ------------- Выполняем возвраты ---------------");
        for (PaymentMethod payment : payments) {
            payment.refund();
        }
    }
}

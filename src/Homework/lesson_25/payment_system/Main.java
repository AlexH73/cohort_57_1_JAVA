package Homework.lesson_25.payment_system;

public class Main {
    public static void main(String[] args) {
        PaymentMethod[] payments = new PaymentMethod[4];

        payments[0] = new PaymentMethod(10800, "RUB");
        payments[1] = new CreditCardPayment(100.50, "USD", "1234-5678-9012-3456");
        payments[2] = new PayPalPayment(200.75, "EUR", "user@example.com");
        payments[3] = new CryptoPayment(0.05, "BTC", "1A2b3C4d5E6f7G8H9I0J");

        for (PaymentMethod payment : payments) {
            payment.pay();
            payment.refund();
            System.out.println();
        }

        System.out.println("--- Перегруженный метод pay ---");
        payments[0].pay("TXN12345");
        payments[1].pay("TXN67890");
        payments[2].pay("TXN54321");
        payments[3].pay("TXN59511");

    }
}

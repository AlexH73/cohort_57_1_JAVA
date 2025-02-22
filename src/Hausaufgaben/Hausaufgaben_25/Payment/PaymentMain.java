package Hausaufgaben.Hausaufgaben_25.Payment;

public class PaymentMain {
    public static void main(String[] args) {
        PaymentMethod[] payments = {
            new CreditCardPayment(10.23, "USD", "123.456.78.DE"),
            new PayPalPayment(200, "EUR", "maxmustarman@muster.mom"),
            new CryptoPayment(0.0567890, "BTC", "uifuhgrvbovboivboifn")
            };

        for (PaymentMethod payment : payments) {
            payment.pay("12534");
            payment.refund();
            System.out.println();
        }

        System.out.println("PAY funktioniert nicht");

    }
}





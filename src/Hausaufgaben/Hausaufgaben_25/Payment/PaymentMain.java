package Hausaufgaben.Hausaufgaben_25.Payment;

public class PaymentMain {
    public static void main(String[] args) {
        PaymentMethod[] payments = new PaymentMethod[4];

        payments[0] = new PaymentMethod(1270, "USD");
        payments[1] = new CreditCardPayment(10.23, "USD", "12345678");
        payments[2] = new PayPalPayment(200, "EUR", "maxmustarman@muster.mom");
        payments[3] = new CryptoPayment(0.0567890, "BTC", "uifuhgrvbovboivboifn");

        for (PaymentMethod payment : payments) {
            payment.pay("123");
            payment.refund();
            System.out.println();
        }

        System.out.println("PAY funktioniert nicht");
        payments[0].pay("123");
        payments[1].pay("456");
        payments[2].pay("789");
        payments[3].pay("012");

    }
}





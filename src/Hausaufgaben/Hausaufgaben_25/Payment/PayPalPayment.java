package Hausaufgaben.Hausaufgaben_25.Payment;

public class PayPalPayment extends PaymentMethod{
    public PayPalPayment(double amount, String currency) {
        super(amount, currency);
    }

    @Override
    public void pay() {
        System.out.println("Paypal hat das Geld Überwiesen !");
    }
}

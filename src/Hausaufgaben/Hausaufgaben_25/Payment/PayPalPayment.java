package Hausaufgaben.Hausaufgaben_25.Payment;

public class PayPalPayment extends PaymentMethod{
    private String email;
    public PayPalPayment(double amount, String currency, String email) {
        super(amount, currency);
        this.email = email;
    }

    @Override
    public void pay(String number) {
        System.out.println("Paypal hat das Geld Überwiesen ! " + getAmount());
    }

    @Override
    public void refund() {
        System.out.println("Geld zurück erhalten: " + email + " на сумму " + getAmount() + " " + getCurrency());
    }
}

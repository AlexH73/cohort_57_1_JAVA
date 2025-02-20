package Hausaufgaben.Hausaufgaben_25.Payment;

public class CryptoPayment extends PaymentMethod {
    public CryptoPayment(double amount, String currency) {
        super(amount, currency);
    }

    @Override
    public void pay() {
        System.out.println("Coins wurden Überwiesen !");
    }
}

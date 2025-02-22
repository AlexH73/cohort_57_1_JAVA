package Hausaufgaben.Hausaufgaben_25.Payment;

public class CryptoPayment extends PaymentMethod {
    private String walletAdresse;

    public CryptoPayment(double amount, String currency, String walletAdresse) {
        super(amount, currency);
        this.walletAdresse = walletAdresse;
    }

    @Override
    public void pay(String number) {
        System.out.println("Coins wurden Überwiesen ! " + getAmount());
    }

    @Override
    public void refund() {
        System.out.println("Ihr Bitcoin wurde zurück überwiesen: " + getAmount());
    }
}

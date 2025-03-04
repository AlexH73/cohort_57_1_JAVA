package Homework.lesson_25;
//✔ CryptoPayment – реализует pay(), имитируя оплату криптовалютой.
public class CryptoPayment extends PaymentMethod {
    private String walletAddress;

    public CryptoPayment(double amount, String currency, String walletAddress) {
        super(amount, currency);
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay() {
        System.out.println("Оплата " + getAmount() + " "
                + getCurrency() + " через криптокошелек: " + walletAddress);
    }

    @Override
    public void pay(String transactionId) {
        System.out.println("Оплата " + getAmount() + " " + getCurrency() +
                " через криптокошелек(ID: " + transactionId + "): " + walletAddress);
    }
}

package Homework.lesson_25.HomeworkYulia_25;

public class CryptoPayment extends PaymentMethod {
    public String walletAddress;

    public CryptoPayment(double amount, String currency, String walletAddress) {
        super(amount, currency);
        this.walletAddress = walletAddress;
    }

    @Override

    public void pay() {
        System.out.println("Оплата" + amount + " " + currency + " с помощью криптовалюты: " + walletAddress);
    }
}

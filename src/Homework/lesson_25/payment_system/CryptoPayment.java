package Homework.lesson_25.payment_system;

public class CryptoPayment extends PaymentMethod {
    private String walletAddress;

    public CryptoPayment(double amount, String currency, String walletAddress) {
        super(amount, currency);
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay() {
        System.out.println("Оплата криптовалютой на кошелёк " + walletAddress + " на сумму " + getAmount() + " " + getCurrency());
    }

    @Override
    public void refund() {
        System.out.println("Возврат криптовалюты на кошелёк " + walletAddress + " на сумму " + getAmount() + " " + getCurrency());
    }
}

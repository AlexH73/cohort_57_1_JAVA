package Homework.lesson_25.OldVersion;

/*✔ CryptoPayment – реализует pay(), имитируя оплату криптовалютой.*/
public class CryptoPayment extends PaymentMethod {
    private String walletAdresse;

    //Конструктор
    public CryptoPayment( double amount, String currency, String walletAdresse) {
        super(amount, currency);
        this.walletAdresse = walletAdresse;
    }

    @Override
    public void pay(String s) {
        System.out.println("Оплата " + amount + " " + currency + " с криптокошелька " + walletAdresse);
    }

    @Override
    public void refund() {
        System.out.println("Возврат средств невозможен для криптовалютных платежей.");
    }
}

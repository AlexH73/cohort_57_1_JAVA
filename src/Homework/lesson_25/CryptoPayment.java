package Homework.lesson_25;
/*✔ CryptoPayment – реализует pay(), имитируя оплату криптовалютой.*/
public class CryptoPayment extends PaymentMethod {
    private String walletAdresse;

    //Конструктор
    public CryptoPayment( double amount, String currency, String walletAdresse) {
        super(amount, currency);
        this.walletAdresse = walletAdresse;
    }

    @Override
    public void pay() {
        System.out.println("Оплата " + amount + " " + currency + " с криптокошелька " + walletAdresse);
    }
}

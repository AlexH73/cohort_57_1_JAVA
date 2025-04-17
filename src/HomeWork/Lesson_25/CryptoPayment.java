package HomeWork.Lesson_25;

public class CryptoPayment extends PaymentMethod {
    public CryptoPayment(double amount, String currency) {
        super(amount, currency);
    }

    @Override
    public void pay() {
        System.out.println("Оплата Криптой: ");
    }
}

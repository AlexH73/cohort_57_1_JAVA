package HomeWork.Lesson_25;

public class CreditCardPayment extends PaymentMethod {
    public CreditCardPayment(double amount, String currency) {
        super(amount, currency);
    }

    @Override
    public void pay() {
        System.out.println("Оплата Кредитной картой: ");
    }
}

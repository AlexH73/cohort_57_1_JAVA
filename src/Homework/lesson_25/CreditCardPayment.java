package Homework.lesson_25;
//✔ CreditCardPayment – реализует pay(), имитируя оплату кредитной картой.
public class CreditCardPayment extends PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(double amount, String currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay() {
        System.out.println("Оплата " + getAmount() + " " + getCurrency() +
                " через кредитную карту: " + cardNumber);

    }

    @Override
    public void pay(String transactionId) {
        System.out.println("Оплата " + getAmount() + " " + getCurrency() +
                " через кредитную карту(ID: " + transactionId + "): " + cardNumber);
    }
}

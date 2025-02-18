package Homework.Homework_25.payment_system;

public class CreditCardPayment extends PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(double amount, String currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay() {
        System.out.println("Оплата кредитной картой " + cardNumber + " на сумму " + getAmount() + " " + getCurrency());
    }

    @Override
    public void refund() {
        System.out.println("Возврат средств на кредитную карту " + cardNumber + " на сумму " + getAmount() + " " + getCurrency());
    }
}

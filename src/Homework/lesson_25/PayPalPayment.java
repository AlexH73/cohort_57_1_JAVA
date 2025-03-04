package Homework.lesson_25;
//✔ PayPalPayment – реализует pay(), имитируя оплату через PayPal.
public class PayPalPayment extends PaymentMethod {
    private String email;

    public PayPalPayment(double amount, String currency, String email) {
        super(amount, currency);
        this.email = email;
    }

    @Override
    public void pay() {
        System.out.println("Оплата " + getAmount() +
                " " + getCurrency() + " через PayPal- аккаунт: " + email);
    }

    @Override
    public void pay(String transactionId) {
        System.out.println("Оплата " + getAmount() + " " + getCurrency() +
                " через PayPal(ID: " + transactionId + "): " + email);
    }
}


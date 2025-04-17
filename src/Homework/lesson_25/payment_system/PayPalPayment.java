package Homework.lesson_25.payment_system;

public class PayPalPayment extends PaymentMethod {
    private String email;

    public PayPalPayment(double amount, String currency, String email) {
        super(amount, currency);
        this.email = email;
    }

    @Override
    public void pay() {
        System.out.println("Оплата через PayPal (" + email + ") на сумму " + getAmount() + " " + getCurrency());
    }

    @Override
    public void refund() {
        System.out.println("Возврат средств через PayPal на аккаунт " + email + " на сумму " + getAmount() + " " + getCurrency());
    }
}

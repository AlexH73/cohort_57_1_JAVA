package Homework.lesson_25.HomeworkYulia_25;

public class PayPalPayment extends PaymentMethod {
    private String email;

    public PayPalPayment(double amount, String currency, String email) {
        super(amount, currency);
        this.email = email;
    }

    @Override

    public void pay() {
        System.out.println("Оплата " + amount + " " + currency + " через PayPal с аккаунта: " + email);
    }
}

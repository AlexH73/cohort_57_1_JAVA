package HomeWork.Lesson_25;

public class PayPalPayment extends PaymentMethod {
    public PayPalPayment(double amount, String currency) {
        super(amount, currency);
    }

    @Override
    public void pay() {
        System.out.println("Оплата через PayPal: ");
    }
}


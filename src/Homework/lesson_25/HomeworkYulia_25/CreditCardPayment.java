package Homework.lesson_25.HomeworkYulia_25;

public class CreditCardPayment extends PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(double amount, String currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }

    @Override

    public void pay() {
        System.out.println("Оплата" + amount + " " + currency + " с помощью кредитной карты: " + cardNumber);
    }
}
